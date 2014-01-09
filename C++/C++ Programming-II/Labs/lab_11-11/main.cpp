//
//  main.cpp
//  labProb4-Pg656.cpp
//
//  Created by Fredrick Paulin on 11/11/13.
//  Copyright (c) 2013 Fredrick Paulin. All rights reserved.
//

#include <iostream>
#include "Vehicle.h"
#include "Truck.h"
#include "Person.h"

using namespace std;


int main()
{
    Vehicle v1("Ford", 4, "James Carter") ;
    
    Vehicle v2;
    
    Vehicle v3(v1);
    
    v2 = v1;
    
    

    cout << "\nCar v1 (constructed) Data:\n";
    
    cout << v1.getManufacturer() << endl;
    
    cout << v1.getCylinders() << endl;
    
    cout << v1.getOwner() << endl;
    
    
    
    cout << "\nCar v2 (assigned) Data:\n";
    
    cout << v2.getManufacturer() << endl;
    
    cout << v2.getCylinders() << endl;
    
    cout << v2.getOwner() << endl;
    
    
    
    
    
    cout << "\nCar v3 (copy constructed) Data:\n";
    
    cout << v3.getManufacturer() << endl;
    
    cout << v3.getCylinders() << endl;
    
    cout << v3.getOwner() << endl;
    
    
    
    
    
    Truck  t1("Mac", 8, "John Q. Driver", 80.0, 2000);
    
    // 80 tons gross vehicle weight, 20,000 lbs tow capacity
    
    
    
    Truck  t3(t1), t2;
    
    t2 = t1;
    
    
    
    cout << "\nTruck T1 (constructed) data:\n";
    
    
    
    cout << t1.getManufacturer() << endl;
    
    cout << t1.getCylinders() << endl;
    
    cout << t1.getOwner() << endl;
    
    cout << t1.getLoadCapacity() << endl;
    
    cout << t1.getTowingCapacity() << endl;
    
    
    
    
    
    cout << "\nTruck T2 (assigned) data:\n";
    
    
    
    cout << t2.getManufacturer() << endl;
    
    cout << t2.getCylinders() << endl;
    
    cout << t2.getOwner() << endl;
    
    cout << t2.getLoadCapacity() << endl;
    
    cout << t2.getTowingCapacity() << endl;
    
    
    
    
    
    cout << "\nTruck T3 (copy constructed) data:\n";
    
    
    
    cout << t3.getManufacturer() << endl;
    
    cout << t3.getCylinders() << endl;
    
    cout << t3.getOwner() << endl;
    
    cout << t3.getLoadCapacity() << endl;
    
    cout << t3.getTowingCapacity() << endl;
    
    
    
    
    return 0;
}

