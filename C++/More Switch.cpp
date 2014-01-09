#include <iostream>
using namespace std;

int main(){

    char grade;
    int aCount = 0, bCount = 0, cCount = 0;
    bool keepRunning = true;





    ////!!! THIS DOESN'T LOOP LIKE YOU WANT IT TO, JUST A DEMO OF SWITCH
    while (keepRunning == true)
    {
        cout << "Enter a grade to be counted: ";
        cin >> grade;

        switch (grade)
        {
            case 'A':
            case 'a':
                ++aCount;
                break;
            case 'B':
            case 'b':
                ++bCount;
                break;
            case 'C':
            case 'c':
                ++cCount;
                break;
            case 'X':
            case 'x':
                keepRunning = false;
                break;
            default:
                cout << "Please enter a valid choice\n";
                break;
        }
    }
    cout << "\n\nThere are " << aCount << " A's in the class, " << bCount << " B's in the class, "<<endl;
    cout << "and there are " << cCount << "C's in the class" << endl;




return 0;}
