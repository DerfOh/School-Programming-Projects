#include <iostream>
using namespace std;
// Outputs class information
void outputHeader();
// prompts the user to enter the square footage of the area they wish to convert to acres
void getInput(double& sqFoot);



 int main()
 {
     double sqFoot, acres;
     outputHeader();
     getInput(sqFoot);
     acres = (sqFoot/43560);
     if (acres == 1)
     {
         cout << "The total square footage comes out to " << acres << " acre" << endl;
     }
     else
     {
         cout << "The total square footage comes out to " << acres << " acres" << endl;
     }

    return(0);

 }


 void outputHeader()
 {
    // Main output header for class information
    cout <<
    "-----------------------------------\n"
    "CIS 175-02\n"
    "Midterm Question 1.\n"
    "Coded by: Fredrick Paulin\n"
    "-----------------------------------\n"
    "One acre of land is equivalent to 43,560 square feet.\nDesign a program that prompts the user to enter the total square footage in a\ntract of land, calculates, and prints out to the console screen the number of acres in the tract.\n\n";

 }

 void getInput(double& sqFoot)
 {
     using namespace std;

     cout << "\n\n-----------------------------------\n";
     cout << "\nEnter the square footage of the area of\nwhich you want to find the acreage: ";
     cin >> sqFoot;
 }
