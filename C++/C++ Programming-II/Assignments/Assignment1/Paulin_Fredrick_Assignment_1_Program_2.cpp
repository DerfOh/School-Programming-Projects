#include <iostream>
using namespace std;

class odometer
{
private:
    double milesDriven, milesTotal, milesPerGal, totalFuelCost, fuelPrice;

public:
    void resetOdometer();

    void setFuelEfficiency();
    void setOdometer();
    void setFuelCost();

    void displayData();

    double getMPG();
    double getDistance();
    double fuelUsed();
    double getFuelCost();

};

double odometer::getFuelCost()
{
    return fuelPrice;
}

void odometer::setFuelCost()
{
    cout << "Enter the current price per gallon at the pump: ";
    cin  >> fuelPrice;
}

void odometer::resetOdometer()
{
    milesTotal = 0;
    milesPerGal = 0;
    milesDriven = 0;
}

double odometer::getMPG()
{

    return milesPerGal;
}

double odometer::getDistance()
{

    return milesTotal;
}

void odometer::setOdometer()
{
    //odometer trip;
    cout << "Enter the miles driven, enter a negative number to end input: ";



    do
    {
        cin >> milesDriven;

        if (milesDriven > 0)
        {
            milesTotal += milesDriven;
        }
        else
        {
            cout << "";
        }

    }while (milesDriven >= 0);

    return;

}

void odometer::setFuelEfficiency()
{
    cout << "Enter the miles your vehicle gets for a single gallon: ";
    cin >> milesPerGal;
}

double odometer::fuelUsed()
{

    return (milesTotal / milesPerGal);
}

void odometer::displayData()
{
    cout << "\n\nMiles Driven:\t-\t-\t " << getDistance()<< endl;
    cout << "Vehicle mpg:\t-\t-\t " << getMPG() << endl;
    cout << "Total gallons of fuel used:\t " << fuelUsed() << endl;

    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(2);
    cout << "Total fuel expenses:\t-\t $" << (fuelUsed()*getFuelCost());
}

int main()
{
    char continueLoop; //exit character

    odometer trip;

    trip.resetOdometer();
    trip.setFuelEfficiency();
    trip.setFuelCost();
    trip.setOdometer();


    trip.displayData();

    cout << "\n\nEnter Y to calculate the milage for another trip,\nenter any other character to exit: ";
    cin >> continueLoop;

    if ((continueLoop == 'Y')||(continueLoop == 'y'))
    {
        trip.resetOdometer();
        main();
    }
    else
    {
        return 0;
    }


    return 0;
}
