# PalindromeCheckerApp
# Project Objective
This project demonstrates how to check whether a given string is a palindrome using basic Java concepts.
## Flow of Execution
1. Initialize input string.
2. Call recursive method:
   check(string, start, end)
3. Compare characters at:
   - start index
   - end index
4. If equal → Move inward
5. If not equal → Return false
6. Stop when:
   start >= end
7. Display result.

## Use Cases Covered

### Use Case 1 – Application Start
Program execution begins.

### Use Case 2 – Input Initialization
System defines input string.
Example:
String input = "madam";

### Use Case 3 – Recursive Method Call
check(input, 0, input.length() - 1);

### Use Case 4 – Base Condition
If start >= end → return true

### Use Case 5 – Character Comparison
If s.charAt(start) != s.charAt(end)
→ return false

### Use Case 6 – Recursive Step
Call:
check(s, start + 1, end - 1);

### Use Case 7 – Termination
Recursion stops when:
- All characters matched
- Mismatch found

### Use Case 8 – Result Handling
Boolean result returned to main method.

### Use Case 9 – Final Output Display
Print result to console.

# Use Case 10 – Normalized Palindrome Validation
Description:

This use case validates whether a given string is a
palindrome after preprocessing (normalization).

# Running Procedure

Compile the program:

javac UseCase2PalindromeCheckerApp.java

Run the program:

java UseCase2PalindromeCheckerApp