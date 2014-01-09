#ifndef CLOWN_H
#define CLOWN_H

#include "Enemy.h"


class Clown : public Enemy
{
    public:
        Clown();
        virtual ~Clown();
        void Attack();
    protected:
    private:
};

#endif // CLOWN_H
