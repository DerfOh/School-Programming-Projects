# include <iostream>
using namespace std;

//*******************************************************************
//* Name:	Fredrick Paulin
//* Program: 	CSC 175 Assignment 1 Part 1
//* Due Date:	Jan 24, 2013
//* IDE:  	Codeblocks
//* Program function:  Takes 5 variables from the user, then finds their average.
//*******************************************************************

int main(){

    //declare variables
    double var1, var2, var3, var4, var5, avg;

    cout << "Enter the first integer: ";
    cin >> var1;

    cout << "Enter the second integer: ";
    cin >> var2;

    cout << "Enter the third integer: ";
    cin >> var3;

    cout << "Enter the fourth variable: ";
    cin >> var4;

    cout << "Enter the fifth variable: ";
    cin >> var5;

    //Compute the averages
    avg = (var1 + var2 + var3 + var4 + var5) / 5;

    //Output to the user the average
    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(2);
    cout << "The average all the integers is " << avg << endl;



    //End the program
    return 0;

}
