#include <iostream>
using namespace std;

void WaitingTime(int BT[], int WT[], int n) {
    WT[0] = 0; 
    for (int i = 1; i < n; i++) {
        WT[i] = BT[i - 1] + WT[i - 1];
    }
}

void TurnAroundTime(int BT[], int WT[], int TAT[], int n) {
    for (int i = 0; i < n; i++) {
        TAT[i] = BT[i] + WT[i]; 
    }
}

int main() {
    int n = 3; 
    int BT[] = {3,3,24};
    int WT[n];
    int TAT[n]; 

    WaitingTime(BT, WT, n);
    TurnAroundTime(BT, WT, TAT, n);

    cout << "Process\tBurst Time\tWaiting Time\tTurnaround Time" << endl;
    for (int i = 0; i < n; i++) {
        cout << i + 1 << "\t" << BT[i] << "\t\t" << WT[i] << "\t\t" << TAT[i] << endl;
    }

    return 0;
}

//Average Waiting Time & Avearge Turn Around Time
