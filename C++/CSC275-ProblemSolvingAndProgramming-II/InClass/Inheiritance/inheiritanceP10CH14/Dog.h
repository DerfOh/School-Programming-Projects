#ifndef DOG_H
#define DOG_H

#include "pet.h"


class Dog : public pet
{
    public:
        Dog();
        virtual ~Dog();
        string Getbreed() { return breed; }
        void Setbreed(string val) { breed = val; }
        string getLifespan();
    protected:
    private:
        string breed;
};

#endif // DOG_H
