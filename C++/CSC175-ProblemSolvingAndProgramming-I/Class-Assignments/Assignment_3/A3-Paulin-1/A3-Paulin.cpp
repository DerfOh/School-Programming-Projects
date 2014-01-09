#include <iostream>
using namespace std;

//**************************************************************************
//*Name:              Fredrick Paulin
//*Program:           CSC 175 Assignment 3
//*Due Date:          Mar 14, 2013
//*Program Function:  A Menu driven program for a beer distribution company
//**************************************************************************

char mainMenu();
double purchase(int purchase[], int sell[], double unitPrice[]);
double sell(int inventory[], int inventoryCost[], double unitPrice[]);
double display(int inventory[], int inventoryCost[], double unitPrice[]);
//Easy menu to display instead of writing one for each function.
void productsMenu();

int main()
{
    char choice;

    //Establish arrays to be passed to functions, Tang seems to want these values be able to be changed
    //if you go back to main from the purchase, display, or sell functions it will reset these values, be careful.
    //Let me know if I'm missing an obvious solution to this.
    int inventory [8] = {100, 100, 100, 100, 100, 100, 100, 100};
    int inventoryCost[8] = {80, 90, 100, 110, 120, 130, 140, 150};
    double unitPrice [8] = {0.8, 0.9, 1.0, 1.1, 1.2, 1.3, 1.4, 1.5};


    //calls menu fuction to get choice, copy paste to other functinos to avoid variable data from being reset
    //(see above comment)
    choice = mainMenu();

    switch (choice)
    {
        case 'P':
        case 'p':
            purchase(inventory, inventoryCost, unitPrice);
            break;

        case 'S':
        case 's':
            sell(inventory, inventoryCost, unitPrice);
            break;

        case 'D':
        case 'd':
            display(inventory, inventoryCost, unitPrice);
            break;

        case 'Q':
        case 'q':
            return(0);
            break;


    }



}

char mainMenu()
{
    char choice;

    cout << "\nEnter 'P' to calculate (P)urchases.\n";
    cout << "Enter 'S' to calculate (S)ales\n";
    cout << "Enter 'D' to (D)isplay current inventory\n";
    cout << "Enter 'Q' to (Q)uit the program.\n";

    cin >> choice;
    switch (choice)
    {
        case 'P':
        case 'p':
        case 'S':
        case 's':
        case 'D':
        case 'd':
        case 'Q':
        case 'q':
            return choice;
            break;
        default:
            cout << "You did not enter a valid choice for this program, please try again...\n";
            mainMenu();
    }

}

double purchase(int inventory[], int inventoryCost[], double unitPrice[])
{
    char choice;

    //build function here


    switch (choice)
    {
        case 'P':
        case 'p':
            purchase(inventory, inventoryCost, unitPrice);
            break;

        case 'S':
        case 's':
            sell(inventory, inventoryCost, unitPrice);
            break;

        case 'D':
        case 'd':
            display(inventory, inventoryCost, unitPrice);
            break;

        case 'Q':
        case 'q':
            return (0);
            break;
    }
}

double sell(int inventory[], int inventoryCost[], double unitPrice[])
{

    char choice;
    int productChoice, quantity;
    productsMenu();

    cout << "Enter the coresponding ID number of the product you wish to sell";
    cin >> productChoice;

    cout << "Enter the quantity you wish to sell: ";
    cin >> quantity;

    if (quantity > inventory[productChoice - 1])
    {
        cout << "The value you entered exceeds the current inventory of product " << productChoice;
    }
    else
    {
        inventory[productChoice - 1] -= quantity;
    }


    cout <<  "Inventory: " << inventory[productChoice -1] << endl;

    //Build Function here

    choice = mainMenu();

    switch (choice)
    {
        case 'P':
        case 'p':
            purchase(inventory, inventoryCost, unitPrice);
            break;

        case 'S':
        case 's':
            sell(inventory, inventoryCost, unitPrice);
            break;

        case 'D':
        case 'd':
            display(inventory, inventoryCost, unitPrice);
            break;

        case 'Q':
        case 'q':
            return (0);
            break;
    }

}

double display(int inventory[], int inventoryCost[], double unitPrice[])
{
    int productChoice;
    char choice;

    productsMenu();

    cout << "Enter 9 to see inventory for all products\n";
    cout << "Enter the coresponding ID number to view the inventory and inventory cost of the product: ";
    cin >> productChoice;

    if (productChoice < 9)
    {
        cout << "\nTotal inventory: " << inventory[productChoice - 1] << "\tInventory cost: $" << inventoryCost[productChoice - 1] << "\n\n";
    }
    else if (productChoice == 9)
    {
        for (int i = 0; i < 8; i++)
        {
            cout << "\nProduct number: " << i + 1 << "\tTotal inventory: " << inventory[i] << "\tInventory cost: $" << inventoryCost[i] << "\n";
        }

    }

    choice = mainMenu();

    switch (choice)
    {
        case 'P':
        case 'p':
            purchase(inventory, inventoryCost, unitPrice);
            break;

        case 'S':
        case 's':
            sell(inventory, inventoryCost, unitPrice);
            break;

        case 'D':
        case 'd':
            display(inventory, inventoryCost, unitPrice);
            break;

        case 'Q':
        case 'q':
            return (0);
            break;


    }


    main();
}

void productsMenu()
{
    //nifty little display
    cout << "Product\t\t|\tNumber\n\n"
    "Coors Lite:\t-\t1\n"
    "Molson Coors:\t-\t2\n"
    "Samuel Adams:\t-\t3\n"
    "Budweiser:\t-\t4\n"
    "Corona:\t\t-\t5\n"
    "Asahi:\t\t-\t6\n"
    "Tsingo:\t\t-\t7\n"
    "Heinken:\t-\t8\n"
    "\n";

    //go back!!! :P
    return;


}
