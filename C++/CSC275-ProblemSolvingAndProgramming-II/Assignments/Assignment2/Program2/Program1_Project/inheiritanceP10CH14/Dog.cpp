#include "Dog.h"

Dog::Dog()
{
    //ctor
}

Dog::~Dog()
{
    //dtor
}

string Dog::getLifespan()
{
    string ret_val = "";

    if (this->Getweight() >= 100)
    {
        ret_val = "approximately 7 Years";
    }
    else
    {
        ret_val = "approximately 13 Years";
    }

    return ret_val;
}
