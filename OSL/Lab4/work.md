cd                           # Change directory.
ls                           # List files and directories in the current directory.
cd Documents                 # Navigate into the 'Documents' directory.
ls                           # List files and directories inside 'Documents'.
cd OSL                       # Navigate into the 'OSL' directory.
ls                           # List files in the 'OSL' directory.
cat file1                    # Display the contents of 'file1'.
touch file                   # Create a new empty file named 'file'.
ls                           # Verify that 'file' has been created by listing files again.
nano file                    # Open 'file' in the nano text editor to edit its content.
cat file                     # Display the contents of 'file'.
head file                    # Show the first 10 lines of 'file' (default behavior).
head -5 file                 # Show the first 5 lines of 'file'.
tail file                    # Show the last 10 lines of 'file' (default behavior).
tail -3 file                 # Show the last 3 lines of 'file'.
sort file                    # Sort the lines of 'file' alphabetically by default.
sort -k 2 file               # Sort the lines of 'file' based on the second column.
sort -k 3 file               # Sort the lines of 'file' based on the third column.
sort -n -k 3 file            # Sort the lines of 'file' numerically by the third column.
sort -n -k 1 file            # Sort the lines of 'file' numerically by the first column.
sort -r file                 # Reverse sort the lines of 'file' alphabetically.
nl -s '.' -w 10 file         # Number the lines of 'file', using '.' as the separator and a 10-character width for the line numbers.
nl -s ')' -w 20 file         # Number the lines of 'file', using ')' as the separator and a 20-character width for the line numbers.
wc file                      # Display the word count, line count, and character count of 'file'.
cut -f 1 -d ' ' file         # Extract the first field (column) of 'file', using a space as the delimiter.
sed s/Rii/Psycho/g file      # Replace all occurrences of 'Rii' with 'Psycho' in 'file' and display the result.
grep '2$' file               # Find and display lines in 'file' where a field ends with '2'.
grep '2' file                # Find and display all lines in 'file' containing '2'.
grep '^Ma' file              # Find and display lines in 'file' that start with 'Ma'.
grep 'Ma' file               # Find and display all lines in 'file' containing 'Ma'.
grep [A-E] file              # Find and display lines in 'file' containing characters from 'A' to 'E'.
grep [a-e] file              # Find and display lines in 'file' containing characters from 'a' to 'e'.
