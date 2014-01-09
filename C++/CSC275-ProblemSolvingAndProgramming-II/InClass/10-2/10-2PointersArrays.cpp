#include <iostream>

using namespace std;

void print_me(int* a)
{
    //++*a; //be careful not to  increment the the memory address.

    //when the function call is pushed on the stack print me is pushed with the address of a1
    // in other words you can pass a pointer so long as the type in the definition is of type*
    cout << "a in = " << *a << endl;
}

int main(void)
{
    int a = 6;


    //* indicates that it is a pointer
    int *p1, *p2, v1, v2;

    v1 = 0;



    cout << "v1 =" << v1 <<endl;
    cout << "&v1 = " << &v1 <<endl;

    p1 = &v1; //pointer points at the address of v1



    cout << "pointer p1 points to the variable at = " << p1 << endl;
    cout << "*p1 = " << *p1 << endl;
    //remember that you are always working with the address the number belongs to and the value at that location
    *p1 = 42;

    p2 = p1;

    *p2 = 43;

    print_me(p1);
    print_me(p2);
    //changes the value p1 points to

    cout << "a1 = " << v1 << endl;
//    cout << "v1 =" << v1 <<endl;
//    cout << "p1 =" << *p1 <<endl;



    return(0);


}
