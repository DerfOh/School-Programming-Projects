#include <iostream>
 using namespace std;

char eval(double value)
 {
    char evaluatedValue;
    if (value <= 0)
    {
        evaluatedValue = 'N';
        return evaluatedValue;
    }
    else
    {
        evaluatedValue = 'P';
        return evaluatedValue;
    }
 }

int main()
 {
    double value;
    char evaluatedValue;
    cout << "Enter a number to be evaluated for Positive or Negative/Zero: ";
    cin >> value;
    evaluatedValue = eval(value);
    cout << "\n\nThe value is a: " << evaluatedValue << endl;
    return (0);

 }

