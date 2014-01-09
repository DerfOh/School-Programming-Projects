#ifndef ENEMY_H
#define ENEMY_H

#include <iostream>

using namespace std;


class Enemy
{
    public:
        Enemy();
        virtual ~Enemy();

        virtual void Attack()=0;
        // pure virtual function indicated by Attack()=0, forced you to build function into program
    protected:
    private:
        //int hp;
};

#endif // ENEMY_H
