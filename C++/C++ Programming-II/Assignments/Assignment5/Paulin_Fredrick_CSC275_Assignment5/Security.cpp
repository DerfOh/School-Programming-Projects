#include "Security.h"
#include "User.h"
#include "Administrator.h"
#include <iostream>


using namespace std;

Security::Security()
{
    //ctor
}

int Security::validate(string username, string password)
{
    if ((username=="abbott") && (password=="monday"))
    {
        return 1;
    }

    if ((username=="costello") && (password=="tuesday"))
    {
        return 2;
    }

    return (0);

}
