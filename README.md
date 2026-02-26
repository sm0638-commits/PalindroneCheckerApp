# PalindromeCheckerApp
# Project Objective
This project demonstrates how to check whether a given string is a palindrome using basic Java concepts.
## Flow of Execution

1. Initialize input string.
2. Create LinkedList.
3. Insert each character into the list.
4. Remove elements from:
   - Front (removeFirst)
   - Back (removeLast)
5. Compare both characters.
6. If all match → TRUE
7. If any mismatch → FALSE

## Use Cases Covered

### Use Case 1 – Application Start
Program execution begins.

### Use Case 2 – Input Initialization
System defines input string.
Example:
String input = "refer";

### Use Case 3 – Deque Creation
Deque<Character> deque = new ArrayDeque<>();

### Use Case 4 – Data Insertion
Characters added using:
deque.addLast(c);

### Use Case 5 – Bidirectional Comparison
Elements removed from:
- Front (removeFirst)
- Back (removeLast)

### Use Case 6 – Condition Check
If first != last → Not Palindrome

### Use Case 7 – Loop Control
Continue comparison while list.size() > 1

### Use Case 8 – Final Result Display
Print the result to console.

# Running Procedure

Compile the program:

javac UseCase2PalindromeCheckerApp.java

Run the program:

java UseCase2PalindromeCheckerApp