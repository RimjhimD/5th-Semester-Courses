# Commands Practiced Today

# Navigate to the home directory
cd

# List files and directories in the current directory
ls

# Navigate to the 'Documents' directory
cd Documents

# List files and directories inside the 'Documents' directory
ls

# Navigate to the 'OSL' directory
cd OSL

# List files in the 'OSL' directory
ls

# Display the contents of 'file1'
cat file1

# Create a new empty file named 'file'
touch file

# Verify that 'file' has been created by listing files again
ls

# Open 'file' in the nano text editor to edit its content
nano file

# Display the contents of 'file'
cat file

# Show the first 10 lines of 'file'
head file

# Show the first 5 lines of 'file'
head -5 file

# Show the last 10 lines of 'file'
tail file

# Show the last 3 lines of 'file'
tail -3 file

# Sort the lines of 'file' alphabetically
sort file

# Sort the lines of 'file' based on the second column
sort -k 2 file

# Sort the lines of 'file' based on the third column
sort -k 3 file

# Sort the lines of 'file' numerically by the third column
sort -n -k 3 file

# Sort the lines of 'file' numerically by the first column
sort -n -k 1 file

# Reverse sort the lines of 'file' alphabetically
sort -r file

# Number the lines of 'file', using '.' as the separator and a 10-character width for the line numbers
nl -s '.' -w 10 file

# Number the lines of 'file', using ')' as the separator and a 20-character width for the line numbers
nl -s ')' -w 20 file

# Display the word count, line count, and character count of 'file'
wc file

# Extract the first field (column) of 'file', using a space as the delimiter
cut -f 1 -d ' ' file

# Replace all occurrences of 'Rii' with 'Psycho' in 'file' and display the result
sed s/Rii/Psycho/g file

# Find and display lines in 'file' where a field ends with '2'
grep '2$' file

# Find and display all lines in 'file' containing '2'
grep '2' file

# Find and display lines in 'file' that start with 'Ma'
grep '^Ma' file

# Find and display all lines in 'file' containing 'Ma'
grep 'Ma' file

# Find and display lines in 'file' containing characters from 'A' to 'E'
grep [A-E] file

# Find and display lines in 'file' containing characters from 'a' to 'e'
grep [a-e] file
