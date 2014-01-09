#include <iostream>
using namespace std;

int main()
{
    typedef int* IntPointer;
    IntPointer a1, a2, a3;
    int aSize;


    //Get the array size from the user.
    cout << "Enter the size of the arrays: ";
    cin >> aSize;

    //initialize 2 arrays of that size.
    a1 = new int[aSize];
    a2 = new int[aSize];
    a3 = new int[aSize + aSize];

    //populate those arrays with random numbers
    for (int i = 0; i<aSize; i++)
    {
        *(a1 + i) = rand() %10;
    }

    for (int i = 0; i<aSize; i++)
    {
        *(a2 + i) = rand() %10;
    }


    //Print out the contents of those arrays
    cout << "Array 1: ";
    for (int i = 0; i<aSize; i++)
    {
        cout << *(a1 + i) << " ";
    }
    cout << endl;

    cout << "Array 2: ";
    for (int i = 0; i<aSize; i++)
    {
        cout << *(a2 + i) << " ";
    }
    cout << endl;

    //Combine the two arrays into a third super array.

    for (int i = 0; i< aSize * 2; i++)
    {
        if (i < aSize)
        {
            *(a3 + i) = *(a1 + i);
        }
        else if (i >= aSize)
        {
            *(a3 + i) = *(a2 + (i - aSize));
        }

    }

//    for (int i = aSize; i< aSize *2; i++)
//    {
//
//    }

    cout << "Array 3: ";
    for (int i = 0; i<aSize*2; i++)
    {
        cout << *(a3 + i) << " ";
    }
    cout << endl;



    return(0);
}
