# Create a directory
mkdir MyDirectory

# Navigate into a directory
cd MyDirectory

# Create a new file
touch myfile.txt

# Write data into a file
echo -e "ID\tName\tSec" > myfile.txt

# Append data to a file in a loop
for i in {1..15}
do
    echo -e "$i\tName_$i\tSec_$i" >> myfile.txt
done

# Append specific data into a file
echo -e "ID\tName\tSec" > file1
data=("39\tRii\tA" 
      "14\tShezan\tA" 
      "19\tSakib\tA" 
      "21\tTariq\tB" 
      "35\tAyesha\tB" 
      "43\tNadia\tC" 
      "12\tHassan\tC" 
      "27\tAlina\tA" 
      "16\tFarhan\tB" 
      "33\tMariam\tA" 
      "25\tUsman\tC" 
      "44\tSara\tB" 
      "11\tIbrahim\tA" 
      "29\tZoya\tC" 
      "38\tHamza\tB")
for row in "${data[@]}"
do
    echo -e "$row" >> file1
done

# Display file content
cat myfile.txt
cat file1

# Rename a file
mv old_filename.txt new_filename.txt

# Move a file to another directory
mv file1 ../OSL2

# Delete a file
rm myfile.txt

# Delete a directory
rm -r OSL1

