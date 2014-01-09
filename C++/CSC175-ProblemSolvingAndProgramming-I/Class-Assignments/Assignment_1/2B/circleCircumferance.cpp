#include <iostream>
using namespace std;

//*******************************************************************
//* Name:	Fredrick Paulin
//* Program: 	CSC 175 Assignment 1 Part 2
//* Due Date:	Jan 24, 2013
//* IDE:  	Codeblocks
//* Program function:  Takes the radious and finds the circumference.
//*******************************************************************



int main(){

    cout << "*******************************************************************\n\
* Name:	Fredrick Paulin\n\
* Program: 	CSC 175 Assignment 1 Part 2\n\
* Due Date:	Jan 24, 2013\n\
* IDE:  	Codeblocks\n\
* Program function:  Takes the radius and finds the circumference.\n\
*******************************************************************\n" << endl;


    //declare variables
    double radius, circumference, pi = 3.14;


    //prompt the user for input
    cout << "Enter the radius of the circle: ";
    cin >> radius;


    //compute the circumference
    circumference = (radius*2)*pi;


    //output the circumference to the user
    cout << "The circumference is " << circumference << endl;


//end program
return 0;}
