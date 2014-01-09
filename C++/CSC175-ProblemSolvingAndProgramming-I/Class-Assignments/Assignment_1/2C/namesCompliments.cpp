#include <iostream>
using namespace std;

//*******************************************************************
//* Name:	Fredrick Paulin
//* Program: 	CSC 175 Assignment 1 Part 3
//* Due Date:	Jan 24, 2013
//* IDE:  	Codeblocks
//* Program function:  Takes a user input and has a response to the name.
//*******************************************************************



int main(){

    cout << "*******************************************************************\n\
* Name:	Fredrick Paulin\n\
* Program: 	CSC 175 Assignment 1 Part 3\n\
* Due Date:	Jan 24, 2013\n\
* IDE:  	Codeblocks\n\
* Program function:  Takes a user input and has a response to the name.\n\
*******************************************************************\n" << endl;


    //declare variables
    char choice;

    //prompt the user for input
    cout <<"Coice\t\t Name\n\n"
    "A or a\t\t Alex\n"
    "B or b\t\t Ben\n"
    "C or c\t\t Carmen\n"
    "D or d\t\t Dave\n"
    "E or e\t\t Elizbeth\n"
    "\nPlease choose someone to read a characteristic about them: ";

    cin >> choice;

    //compute the response
    if (choice=='A'||choice=='a')
        cout << "\nHe is great!\n";

    else if (choice=='B'||choice=='b')
        cout << "\nHe is brave!\n";

    else if (choice=='C'||choice=='c')
        cout << "\nShe is beautiful!\n";

    else if (choice=='D'||choice=='d')
        cout << "\nHe is smart!\n";

    else if (choice=='E'||choice=='e')
        cout << "\nShe is sweet!\n";

    else
    {
        cout << "\n\n\n\n\n!!!!!You did not enter a valid response, the program will now restart.!!!!!\n\n\n\n\n";
        main();
    }



//end program
return 0;}
