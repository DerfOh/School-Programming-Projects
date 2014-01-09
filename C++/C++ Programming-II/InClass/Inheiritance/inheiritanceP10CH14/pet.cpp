#include "pet.h"
#include <iostream>
using namespace std;

pet::pet()
{
    //ctor
}

pet::~pet()
{
    //dtor
}

string pet::Getname() { return name; }
void pet::Setname(string val) { name = val; }
int pet::Getage() { return age; }
void pet::Setage(int val) { age = val; }
int pet::Getweight() { return weight; }
void pet::Setweight(int val) { weight = val; }

string pet::getLifespan(){return "unknown lifespan";}
