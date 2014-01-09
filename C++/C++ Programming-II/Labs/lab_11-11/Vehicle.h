//
//  Vehicle.h
//  labProb4-Pg656.cpp
//
//  Created by Fredrick Paulin on 11/11/13.
//  Copyright (c) 2013 Fredrick Paulin. All rights reserved.
//

#ifndef labProb4_Pg656_cpp_Vehicle_h
#define labProb4_Pg656_cpp_Vehicle_h

#include <iostream>
#include <string>
#include "Person.h"

using namespace std;


class Vehicle
{
public:
    Vehicle() : manufacturer("No Name"), cylinders(0), owner("No Name"){}
    
    Vehicle(string name_in, int cylinders_in, const string& owner_in): manufacturer(name_in), cylinders(cylinders_in), owner(Person(owner_in)){}
    
    //copy constructor
    Vehicle(const Vehicle& theVehicle): manufacturer(theVehicle.manufacturer), cylinders(theVehicle.cylinders), owner(theVehicle.owner){}
    
    string getManufacturer(){return manufacturer;}
    int getCylinders(){return cylinders;}
    string getOwner(){return owner.getName();}
    

private:
    string manufacturer;
    int cylinders;
    Person owner;
    
};



#endif
