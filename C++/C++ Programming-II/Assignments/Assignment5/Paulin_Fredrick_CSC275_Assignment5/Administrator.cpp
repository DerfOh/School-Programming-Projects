#include "Security.h"
#include "Administrator.h"
#include <iostream>

using namespace std;

Administrator::Administrator(string usernameIn, string passwordIn) : username(usernameIn), password(passwordIn)
{
    //ctor
}

bool Administrator::login()
{
    if ((username=="costello") && (password=="tuesday")) return true;
    return (0);
}
