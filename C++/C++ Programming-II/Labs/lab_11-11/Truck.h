//
//  Truck.h
//  labProb4-Pg656.cpp
//
//  Created by Fredrick Paulin on 11/11/13.
//  Copyright (c) 2013 Fredrick Paulin. All rights reserved.
//

#ifndef labProb4_Pg656_cpp_Truck_h
#define labProb4_Pg656_cpp_Truck_h

#include <iostream>
#include <string>

#include "Vehicle.h"

using namespace std;

class Truck : public Vehicle
{
public:
    Truck():Vehicle(), loadCapacity(0){}
    Truck(string name_in, int cylinders_in, string owner_in, double capacity, int towingCapacity_in):
     Vehicle(name_in, cylinders_in, owner_in), loadCapacity(capacity), towingCapacity(towingCapacity_in){}
    
    double getLoadCapacity(){return loadCapacity;}
    int getTowingCapacity(){return towingCapacity;}
    void setTowingCapacity()
    {
        towingCapacity = loadCapacity/2;
        //return towingCapacity;
    }
    
    
    
    
private:
    double loadCapacity;
    int towingCapacity;
    
};






#endif
