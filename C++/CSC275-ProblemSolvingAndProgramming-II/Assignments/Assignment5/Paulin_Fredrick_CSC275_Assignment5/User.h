#ifndef USER_H
#define USER_H
#include "Security.h"



class User
{
    public:
        User(string usernameIn, string passwordIn);
        bool login();
        void display();

        //these need to be deleted for security reasons
        string getName(){return username;}
        string getPass(){return password;}
        int getLevel(){return userLevel;}




    protected:
    private:
        string username, password;
        int userLevel;
};

#endif // USER_H
