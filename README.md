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
UC1  – Application Start

UC2  – Basic Input Handling

UC3  – Stack Creation

UC4  – Push Operation

UC5  – Stack-Based Validation

UC6  – Queue + Stack Fairness Check

UC7  – Deque Optimized Approach

UC8  – LinkedList Based Validation

UC9  – Recursive Palindrome Checker

UC10 – Normalized Palindrome Validation

UC11 – Object-Oriented Palindrome

UC12 – Strategy Pattern Implementation

# Use Case 12 – Strategy Pattern 

Description:

This use case implements the Strategy Design Pattern
to allow dynamic selection of palindrome algorithms.

Components:

1. PalindromeStrategy (Interface)
   - Defines method: check(String input)

2. StackStrategy (Concrete Strategy)
   - Implements palindrome validation using Stack

3. Main Class
   - Injects chosen strategy at runtime
   - Executes the selected algorithm


# Running Procedure

Compile the program:

javac UseCase2PalindromeCheckerApp.java

Run the program:

java UseCase2PalindromeCheckerApp