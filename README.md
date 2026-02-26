# PalindromeCheckerApp
# Project Objective
This project demonstrates how to check whether a given string is a palindrome using basic Java concepts.
## Flow of Execution

1. Initialize input string.
2. Create Deque.
3. Insert each character using addLast().
4. Compare characters from both ends:
    - removeFirst()
    - removeLast()
5. If all pairs match → TRUE
6. If any mismatch → FALSE

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

### Use Case 7 – Final Result Display
Print result to console.

# Running Procedure

Compile the program:

javac UseCase2PalindromeCheckerApp.java

Run the program:

java UseCase2PalindromeCheckerApp