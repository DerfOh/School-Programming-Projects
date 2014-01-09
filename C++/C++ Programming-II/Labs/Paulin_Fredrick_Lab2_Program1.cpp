#include <iostream>

using namespace std;

int main ()
{
    int *a;
    int new_size = 0;

    cout << "Enter the size : ";
    cin >> new_size;

    a = new int[new_size];

    for (int i = 0; i<new_size; i++)
    {
        a[i] = new_size - i;

    }

//    cout << *(a) << endl;
//    cout << *(a+1) << endl;
//    cout << *(a+2) << endl;
//    cout << *(a+3) << endl;
//    cout << *(a+4) << endl;


    for (int i = 0; i<new_size; i++)
    {
        cout << "a[" << i << "] = " << " " << *(a +i) << " and the address is " << (a +i) <<endl;

    }
}
