#ifndef ROCK_H
#define ROCK_H

#include "pet.h"


class Rock : public pet
{
    public:
        Rock();
        virtual ~Rock();
        string getLifespan();

    protected:
    private:

};

#endif // ROCK_H
