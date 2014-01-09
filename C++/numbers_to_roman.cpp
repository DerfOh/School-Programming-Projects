#include <iostream>
using namespace std;
// Outputs class information
void outputHeader();
// prompts the user to enter the numeral to be converted to roman numerals
void getInput(double& numeral);



 int main()
 {
     double numeral;
     outputHeader();

     do
     {
         getInput(numeral);

         if (numeral == 1)
         {
             cout << "The Roman equivilant to 1 is: I";
         }
         else if (numeral == 2)
         {
             cout << "The Roman equivilant to 2 is: II";
         }
         else if (numeral == 3)
         {
             cout << "The Roman equivilant to 3 is: III";
         }
         else if (numeral == 4)
         {
             cout << "The Roman equivilant to 4 is: IV";
         }
         else if (numeral == 5)
         {
             cout << "The Roman equivilant to 5 is: V";
         }
         else
         {
             cout << "Your number is outside the range (1-5)";
         }
     }while (numeral<1 || numeral>5);


    return(0);

 }


 void outputHeader()
 {
    // Main output header for class information
    cout <<
    "-----------------------------------\n"
    "CIS 175-02\n"
    "Midterm Question 3.\n"
    "Coded by: Fredrick Paulin\n"
    "-----------------------------------\n"
    "Create a program that converts a number to a roman numeral (between 1&5 with validation)";

 }

 void getInput(double& numeral)
 {
     using namespace std;

     cout << "\n\n-----------------------------------\n";
     cout << "\nPlease enter a valid numeral between 1 and 5: ";
     cin >> numeral;
 }
