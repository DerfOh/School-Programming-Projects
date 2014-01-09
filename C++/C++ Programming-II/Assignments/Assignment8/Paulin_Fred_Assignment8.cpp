#include <iostream>
#include <cmath>
using namespace std;

template<class T>
T absoluteValue(T number)
{
    //this is a bit redundant as cmath has a library function that does this for you, but for the sake of example...
    return abs(number);
}

int main ()
{

    //int num1, num2;
    double num1, num2;
    //float num1, num2;
    //char num1, num2;

    cout << "Enter your first value"<< endl;
    cin >> num1;
    cout << "Enter your second value"<< endl;
    cin >> num2;

    cout << "The absolute value of number 1 is: " << absoluteValue(num1) << endl;
    cout << "The absolute value of number 2 is: " << absoluteValue(num2) << endl;

}
