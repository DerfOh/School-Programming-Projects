#include <iostream>

using namespace std;

int numberOfPins(int rows);
int main ()
{
    int num_rows;
    int num_pins;
    cout << "How many rows of bowling pins will there be?" << endl;
    cin >> num_rows;
    num_pins = numberOfPins(num_rows);
    cout << "You will need to set up " << num_pins << " bowling pins." << endl;

    return (0);

}

int numberOfPins(int rows)
{
    int temp = 1;
    for (int i=0; i<rows; i++)
    {
        //temp+=(rows)+i;
    }
    return temp;
}
