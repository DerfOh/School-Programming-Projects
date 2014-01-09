//
//  Person.h
//  labProb4-Pg656.cpp
//
//  Created by Fredrick Paulin on 11/11/13.
//  Copyright (c) 2013 Fredrick Paulin. All rights reserved.
//

#ifndef labProb4_Pg656_cpp_Person_h
#define labProb4_Pg656_cpp_Person_h
#include <iostream>
#include <string>
using namespace std;



class Person
{
public:
    Person(): name(""){}
    Person(string theName):name(theName){}

    Person(const Person& theObject): name(theObject.name){}
    
    
    string getName() {return name;}
    string getName() const;
    Person& operator=(const Person& rtSide)
    {
        this->name = rtSide.name;
        return *this;
    }
    
    friend istream& operator >>(istream& is, Person& personObject)
    {
        is >> personObject.name;
        
        return is;
    }
    
    friend ostream& operator <<(ostream& os, Person& personObject)
    {
        os << personObject.name;
        
        return os;
    }
 
    
private:
    string name;
    
};

#endif
