#include "User.h"
#include "Security.h"
#include <iostream>

using namespace std;

User::User(string usernameIn, string passwordIn) : username(usernameIn), password(passwordIn)
{
    userLevel = Security::validate(getName(), getPass());

}

bool User::login()
{
    if ((getName()=="abbott") && (getPass()=="monday")) return true;
    return (0);
}

void User::display()
{
    cout << "User: " << getName()<< "'s level is: ";
    if (getLevel() == 1)
    {
        cout << "User." << endl;
    }
    else if (getLevel() == 2)
    {
        cout << "Admin." << endl;
    }
    else
    {
        cout << "INVALID USER!" << endl;;
    }
}

