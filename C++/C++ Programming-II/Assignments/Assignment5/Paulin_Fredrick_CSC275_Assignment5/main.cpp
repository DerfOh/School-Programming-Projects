#include <iostream>
#include "Security.h"
#include "Administrator.h"
#include "User.h"
using namespace std;



int main()
{
    //Administrator a1("costello", "tuesday");
    User u1("abbott", "monday"), u2("costello", "tuesday"), u3("fredrick", "paulin");

    u1.display();
    u2.display();
    u3.display();


}
