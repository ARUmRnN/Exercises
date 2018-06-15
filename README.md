Exercies task
=============

Brackets
--------

Given a string consisting of brackets, digit and latin alphabet symbol, write a program to examine whether the pairs and the orders of "{", "}", "(", ")", "[", "]" are correct (balanced). For example, the program should print -1 for the string [()]{}{[()()]()} and index (4) incorrect bracket for ()[]}.

Stack with Max
--------------

A program simulating a stack that can effectively return the current max element. Your program should read a sequence of commands of different types from the standard input.

There are three types of commands:

push v - add an element (v) to a top of the stack;
pop - remove the top element of the stack;
max - return the current max in the stack.
The time complexity of these operations should not depend on the stack size (constant time, O(1)).

Hint: you may use several standard stacks to write a solution.

Input data format
-----------------

The first line contains the number of commands. Next lines contain one of the following commands: push v, pop, max.

Output data format
------------------

The program must output the current max for each command max.

Sample Input
------------
5
push 2
push 1
max
pop
max

Sample Output
-------------
2
2
