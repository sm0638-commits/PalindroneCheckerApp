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

UC13 – Performance Comparison & Benchmarking

# Use Case 13 – Performance Comparison 

Description:

This use case measures execution time of a
palindrome algorithm using benchmarking concepts.

Steps:

1. Select a palindrome strategy.
2. Capture start time using System.nanoTime().
3. Execute the algorithm.
4. Capture end time.
5. Calculate total execution duration.
6. Display results.

# Running Procedure

Compile the program:

javac UseCase2PalindromeCheckerApp.java

Run the program:

java UseCase2PalindromeCheckerApp