package com.example.labper2

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.google.firebase.database.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { FirebaseAppScreen() }
    }
}

@Composable
fun FirebaseAppScreen() {
    var inputText by remember { mutableStateOf(TextFieldValue("")) }
    var dataList by remember { mutableStateOf(listOf<String>()) }

    val database = FirebaseDatabase.getInstance("https://labperf2-4dfd5-default-rtdb.asia-southeast1.firebasedatabase.app/")
        .getReference("lab_test_data")

    // Fetch Data from Firebase
    LaunchedEffect(Unit) {
        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val newData = snapshot.children.mapNotNull { it.getValue(String::class.java) }
                dataList = newData
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("Firebase", "Error fetching data", error.toException())
            }
        })
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Enter Data:", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = inputText,
            onValueChange = { inputText = it },
            label = { Text("Type something...") }
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            val key = database.push().key
            if (key != null) {
                database.child(key).setValue(inputText.text)
                    .addOnSuccessListener { Log.d("Firebase", "Data added!") }
                    .addOnFailureListener { Log.e("Firebase", "Failed to add data", it) }
            }
        }) {
            Text("Submit Data")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Stored Data:", style = MaterialTheme.typography.headlineMedium)

        LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            items(dataList) { item ->
                Text(text = item, style = MaterialTheme.typography.bodyLarge, modifier = Modifier.padding(8.dp))
            }
        }
    }
}
