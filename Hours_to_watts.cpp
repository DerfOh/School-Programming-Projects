#include <iostream>
using namespace std;
// Outputs class information
void outputHeader();
// prompts the user to enter the wattage of the bulb to find its life expectancy
void getInput(double& wattage);



 int main()
 {
     double wattage;
     outputHeader();

     do
     {
         getInput(wattage);

         if (wattage == 25)
         {
             cout << "Your bulb will have 2500 hours of usage.";
         }
         else if (wattage == 40)
         {
             cout << "Your bulb will have 2200 hours of usage.";
         }
         else if (wattage == 60)
         {
             cout << "Your bulb will have 1750 hours of usage.";
         }
         else if (wattage == 75)
         {
             cout << "Your bulb will have 1500 hours of usage.";
         }
         else if (wattage == 100)
         {
             cout << "Your bulb will have 1200 hours of usage.";
         }
         else
         {
             cout << "Your wattage is outside valid lightbulb wattages";
         }
     }while (wattage != 25 && wattage != 40 && wattage != 60 && wattage != 75 && wattage != 100);


    return(0);

 }


 void outputHeader()
 {
    // Main output header for class information
    cout <<
    "-----------------------------------\n"
    "CIS 175-02\n"
    "Midterm Question 4.\n"
    "Coded by: Fredrick Paulin\n"
    "-----------------------------------\n"
    "Create a program that finds the life expectancy of a lightbulb based on its wattage";

 }

 void getInput(double& wattage)
 {
     using namespace std;

     cout << "\n\n-----------------------------------\n";
     cout << "\nPlease enter a valid lightbulb wattage\n";
     cin >> wattage;
 }
