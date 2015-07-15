# flipcoin
This is yet another coding challenge in the sprit of codility.

The Flip Coin problem does not use Random and algorithmically does not really have anything to do with coins.

This is a object counting problem more easily solved using Java as opposed to ANSI C or C++.

There is no build as the entire project was developed in Intellij and run @ the Intellij terminal.

Java commandline:

$ java -cp . name.davidwbrown.FlipCoin

There are N coins kept on the table, numbered from 0 to N - 1. Initially, each coin is kept tails up. You have to perform two types of operations :
1) Flip all coins numbered between A and B inclusive. This is represented by the command "0 A B"
2) Answer how many coins numbered between A and B inclusive are heads up. This is represented by the command "1 A B".
Input :
The first line contains two integers, N and Q. Each of the next Q lines are either of the form "0 A B" or "1 A B" as mentioned above.
Output :
Output 1 line for each of the queries of the form "1 A B" containing the required answer for the corresponding query.

All input is space delimited.

Sample Input :
4 7
1 0 3
0 1 2
1 0 1
1 0 0
0 0 3
1 0 3 
1 3 3

Sample Output :
0
1
0
2
1

Constraints :
N > 0
Q > 0
0 <= A <= B <= N - 1
