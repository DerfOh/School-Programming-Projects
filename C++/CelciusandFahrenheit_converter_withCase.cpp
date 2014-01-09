// Created By Fredrick Paulin
// This program will convert fahrenheit into celcius
#include <iostream>

 using namespace std;
 int fahrenheitConverter();
 int celsiusConverter();
 void menu();

 int main()
 {
    // Main output header for class information
    cout <<
    "-----------------------------------\n"
    "CIS 175-02\n"
    "Fahrenheit converter, homework 2.\n"
    "Coded by: Fredrick Paulin\n"
    "-----------------------------------\n"
    "This program will cross conver Fahrenheit and Celsius Temperatures";
     menu();


 }

  void menu()
 {
// F or f for fahrenheit
// C or c for celsius
// X or x to exit
    char choice;


    cout << "\nEnter F to convert Fahrenheit to Celsius\n";
    cout << "Enter C to convert Celsius to Fahrenheit\n";
    cout << "Enter X to exit the converter program\n\n";
    cin >> choice;

    switch (choice) //switch that establishes a main menu in the program
    {
        case 'F':
        case 'f':
            fahrenheitConverter();
            break;
        case 'C':
        case 'c':
            celsiusConverter();
            break;
        case 'X':
        case 'x':
            exit(1);
            break;
        default:
        cout << "Please enter a valid choice\n";
        menu();
    }

// Alternative to switch case below //
//----------------------------------//

//    if (choice=='F'||choice=='f')
//        fahrenheitConverter();
//
//    else if (choice=='C'||choice=='c')
//        celsiusConverter();
//
//    else if (choice=='X'||choice=='x')
//        exit(1);
//
//    else
//        cout << "Please enter a valid choice.\n";
//        menu();
 }


// Initiate the fahrenheit conversion
 int fahrenheitConverter()
 {
     // establish variables for fahenheit and celsius
     double fahrenheit, celsius;

     bool correct; // Boolean expression that checks for a valid input
     char exit; // flag that ends the loop
     void menu(); // allows the menu function to be called


     cout << "\nEnter a temperature between -100 and 125: ";
     cin >> fahrenheit; // variable to be converted into celcius

// this loop checks if the inputted value is within the allowable range
//    while (correct != true)
//    {
//    if (fahrenheit > 125)
//    {
//
//        cout << "\nYour temperature is higher than 125, please enter another temperature: ";
//        cin >> fahrenheit;
//        correct = false;
//    }
//    if (fahrenheit < -100)
//    {
//        cout << "\nYour temperature is lower than -100, please enter another temperature: ";
//        cin >> fahrenheit;
//        correct = false;
//    }
//    else
//        correct = true;
//    }

     //will calcualte the temperature in celcius
     celsius = (fahrenheit - 32.0) * (5.0 / 9.0);
     cout.setf(ios::fixed);
     cout.setf(ios::showpoint);
     cout.precision(2);
     cout << "The temperature in celcius is " << celsius << " degreese" << endl;

     //Pause before exiting
     cout << "\n\nenter x to exit to the main menu, or c to continue converting: ";
     cin >> exit;

     // if the user enters x the program will exit, otherwise any other value
     // will return them to the beginning of the function
     if (exit=='x'||exit=='X')
        menu();
     else
        fahrenheitConverter();


 }

// Initiate the celcius conversion
 int celsiusConverter()
 {

// Establish the variables for fahrenheit and celsius
     double fahrenheit, celsius;
     bool correct; // Boolean expression that checks validity of input
     char exit; // Flag to exit the function's loop
     void menu(); // Void for menu so that it can be called at any time


     cout << "\nEnter a temperature between -50 and 150 in Celsius: ";
     cin >> celsius; // Get the value to be converted in celsius to fahrenheit

// Loop that checks that the value inputted for celsius is within the allowable range
//    while (correct != true)
//    {
//    if (celsius > 150)
//    {
//
//        cout << "\nYour temperature is higher than 150, please enter another temperature: ";
//        cin >> celsius;
//        correct = false;
//    }
//    if (celsius < -50)
//    {
//        cout << "\nYour temperature is lower than -50, please enter another temperature: ";
//        cin >> celsius;
//        correct = false;
//    }
//    else
//        correct = true;
//    }



    //will calcualte the temperature in celcius
    fahrenheit = (celsius * 9.0/5.0) + 32;
    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(2);
    cout << "The temperature in fahrenheit is " << fahrenheit << " degreese" << endl;



     //Pause before exiting
     cout << "\n\nenter x to exit to the main menu, or c to continue converting: ";
     cin >> exit;

     // if the user enters x the program will exit, otherwise any other value
     // will return them to the beginning of the program
     if (exit=='x'||exit=='X')
        menu();
     else
        celsiusConverter();

 }

