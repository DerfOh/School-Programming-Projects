#ifndef SECURITY_H
#define SECURITY_H

#include <iostream>
using namespace std;




class Security
{
    public:
        Security();
        static int validate(string username, string password);
    protected:
    private:

};

#endif // SECURITY_H
