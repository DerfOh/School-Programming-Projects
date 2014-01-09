#ifndef ADMINISTRATOR_H
#define ADMINISTRATOR_H

#include "Security.h"



class Administrator
{
    public:
        Administrator(string usernameIn, string passwordIn);
        bool login();

    protected:
    private:
        string username, password;

};

#endif // ADMINISTRATOR_H
