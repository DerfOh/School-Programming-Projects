//#include "hotdogStand.h"
#include <iostream>
#include <cstdlib> //for exit(1)

using namespace std;


//this program keeps track of hotdogsales on a given day



class hotdogStand
{
    public:
        hotdogStand(int idNumber, int sales);
        int justSold(int dogSold);
        void output();

        int getSales(){return soldToday;};
        int getBrats(){return bratwurst;};
        int getClassic(){return classicDog;};
        int getConey(){return coney;};
        int getStandID(){return standID;};

        static int totalSales(){totalSold++;};
        static int getTotalSold(){return totalSold;};




    protected:
    private:
        int standID;
        int soldToday;
        static int totalSold;

        //varieties of dogs
        int classicDog, bratwurst, coney;

};

int hotdogStand::totalSold = 0;

int main()
{
    hotdogStand stand1(1,0), stand2(2,0), stand3(3,0);
    int dogSold, idNumber;
    char anotherStand; //controles main loop


    do
    {
        cout << "Enter the stand that you wish to record sales for: ";
        cin >> idNumber;

        switch (idNumber)
        {
            case 1:
                cout << "Enter the type of dog sold at stand One:\n1. Classic\n2. Bratwurst\n3. Coney \nEnter a negative number to quit." << endl;
                do
                {
                    cin >> dogSold;
                    if (dogSold>=0)
                    {
                        stand1.justSold(dogSold);
                        hotdogStand::totalSales();
                    }


                }while (dogSold > 0);
                break;
            case 2:
                cout << "Enter the type of dog sold at stand Two:\n1. Classic\n2. Bratwurst\n3. Coney \nEnter a negative number to quit." << endl;
                do
                {
                    cin >> dogSold;
                    if (dogSold>=0)
                    {
                        stand2.justSold(dogSold);
                        hotdogStand::totalSales();
                    }


                }while (dogSold > 0);
                break;
            case 3:
                cout << "Enter the type of dog sold at stand Three:\n1. Classic\n2. Bratwurst\n3. Coney \nEnter a negative number to quit." << endl;
                do
                {
                    cin >> dogSold;
                    if (dogSold>=0)
                    {
                        stand3.justSold(dogSold);
                        hotdogStand::totalSales();
                    }
                }while (dogSold > 0);
                break;
            default:
                cout << "Invalid Stand ID, or operation has been finished by user";
                break;
        }

        cout << "\n\nWould you like to record sales for another stand? 'Y' to continue: ";
        cin >> anotherStand;

    }while ((anotherStand == 'y') || (anotherStand =='Y'));





    //cout << "Enter the type of dog"

    stand1.output();
    stand2.output();
    stand3.output();

    cout << "\n\nThe total sales from all stands is : " << hotdogStand::getTotalSold() << endl;





}

hotdogStand::hotdogStand(int idNumber, int sales) : standID(idNumber), soldToday(sales), classicDog (0), bratwurst(0), coney(0)
{
    //intentionally left empty, perhaps put an input tester here.
}

int hotdogStand::justSold(int dogSold)
{
    soldToday++;

    switch (dogSold)
    {
        case 1:
            classicDog ++;
            break;
        case 2:
            bratwurst++;
            break;
        case 3:
            coney++;
            break;
        default:
            cout << "Invalid input, please enter 1, 2, or 3" << endl;

            break;
    }
}

void hotdogStand::output()
{
    cout << "\n-------------------------------------\n";
    cout << "Total dogs stand " << getStandID() << " sold today : " << getSales() << endl;
    cout << "Classic Dogs sold: " << getClassic() << endl;
    cout << "Bratwurst sold: " << getBrats() << endl;
    cout << "Coney Dogs sold: " << getConey() << endl;
    cout << "-------------------------------------\n";

}

//perhaps implement this for large orders
//void hotdogStand::justSold(int amount)
//{
//    soldToday + amount;
//}

//int hotdogStand::getSales(){return soldToday;}


