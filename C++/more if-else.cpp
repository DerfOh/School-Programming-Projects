#include <iostream>
using namespace std;

//This program demonstrates an if else statement

int main(){

    //Census
    char maritalStatus, gender;
    int age;

    cout << "Enter your marital status, gender, and age: ";
    cin >> maritalStatus >> gender >> age;

    if (maritalStatus == 'S' && gender == 'M' && age >=18 && age <=26)
    {
        cout << "All criteria are met!";
    }

    //PH
    bool neutral = false, base = false, acid = false;
    double pH;

    //prompt the user for input
    cout << "\nEnter the PH value: ";
    cin >> pH;

    //decide if its nuetral, basic, or acidic
    if (pH == 7)
    {
        neutral = true;
    }

    else if (pH > 7)
    {
        base = true;
    }

    else if (pH < 7)
    {
        acid = true;
    }

    if (acid == true)
    {
        cout << "\nThe compound is an acid";
    }

    else if (base == true)
    {
        cout << "\nThe compound is a base";
    }

    else if (neutral == true)
    {
        cout << "\nThe compound is neutral";
    }


return 0;}

