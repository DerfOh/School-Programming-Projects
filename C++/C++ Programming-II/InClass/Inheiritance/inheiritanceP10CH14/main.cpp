#include <iostream>
#include "pet.h"
#include "Dog.h"
#include "Rock.h"
#include "Cat.h"


using namespace std;

int main()
{
    Dog d, j;
    Cat c;
    Rock r;
    
    
    d.Setname("Chopper");
    d.Setage(7);
    d.Setweight(101);
    d.Setbreed("Lab");

    j.Setname("Jay");
    j.Setage(7);
    j.Setweight(75);
    j.Setbreed("Retriever");
    
    c.Setname("Kitty");
    c.Setage(6);
    c.Setweight(45);
    c.Setbreed("Manecoon");

    r.Setname("Rocky");
    r.Setage(1000);
    r.Setweight(1001);
//    r.Setbreed(""); <- doesn't work because this is only in the dog class


    cout << "Our dog " << d.Getname()
    << " is " << d.Getage()
    << " years old and weighs " << d.Getweight() << " units "
    << "\nand has a lifespan of "<<d.getLifespan()
    << " and is a " << d.Getbreed() << endl;

    cout << endl;

    cout << "Our dog " << j.Getname()
    << " is " << j.Getage()
    << " years old and weighs " << j.Getweight() << " units "
    << "\nand has a lifespan of "<<j.getLifespan()
    << " and is a " << j.Getbreed() << endl;

    cout << endl;
    
    cout << "Our cat " << c.Getname()
    << " is " << c.Getage()
    << " years old and weighs " << c.Getweight() << " units "
    << "\nand has a lifespan of "<<c.getLifespan()
    << " and is a " << c.Getbreed() << endl;
    
    cout << endl;

    cout << "Our rock " << r.Getname()
    << " is " << r.Getage()
    << " years old and weighs " << r.Getweight() << " units "
    << "\nand has a lifespan of about "<<d.getLifespan() <<endl;




    return 0;
}
