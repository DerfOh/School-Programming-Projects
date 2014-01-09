#ifndef PET_H
#define PET_H

#include <iostream>
using namespace std;


class pet
{
    public:
        pet();
        virtual ~pet();
        string Getname();
        void Setname(string val);
        int Getage();
        void Setage(int val);
        int Getweight();
        void Setweight(int val);
        string getLifespan();

    protected:
    private:
        string name;
        int age;
        int weight;
        string lifespan;
};

#endif // PET_H
