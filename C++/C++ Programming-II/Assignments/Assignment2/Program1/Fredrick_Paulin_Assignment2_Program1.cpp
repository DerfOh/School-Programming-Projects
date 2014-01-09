#include <iostream>

using namespace std;

//begin classes
class Counter
{
    public:
        Counter();

        int incr1(int amount); //cents
        int incr10(int amount); //tenths of cents
        int incr100(int amount); //dollars
        int incr1000(int amount); //tens
        //int incr10000(int amount); //hundreds
        //int incr100000(int amount); //thousands

        int input();

        void incrementor(int inputValue, int incrementAmount);

        void display();




    private:
        int dollarTotal;
        int centTotal;
        int incrementAmount;
        char inputValue;
        bool overflow;
        bool isOverflow(int valueIn);



};

//begin constructor
Counter::Counter() : dollarTotal(0), centTotal(0), overflow(false), inputValue(' '), incrementAmount(0)
{
    //intentionally left blank
}



//begin class member functions
int Counter::incr1(int amount){centTotal += (1 * amount);};

int Counter::incr10(int amount){centTotal += (10 * amount);};

int Counter::incr100(int amount){dollarTotal += (1 * amount);};

int Counter::incr1000(int amount){dollarTotal += (10 * amount);};

//int Counter::incr10000(int amount){dollarTotal += (100 * amount);};

//int Counter::incr100000(int amount){dollarTotal += (1000 * amount);};

bool Counter::isOverflow(int valueIn)
{
    if (valueIn > 99)
    {
        overflow = true;
        cout <<"\n-------------------------------\nThe amount you entered exceeds the limit of the counter by " << valueIn - 99.99 << "\nThe program will now exit.\n-------------------------------\n";
    }
    return overflow;
}

void Counter::display()
{
    if (centTotal < 10)
    {
        cout << "\n\nCurrent Count: " << dollarTotal << ".0" << centTotal << endl;
    }
    else
    {
        cout << "\n\nCurrent Count: " << dollarTotal << "." << centTotal << endl;
    }
}

int Counter::input()
{
    //get thevalue that the user wishes to change..

        cout << "\na = penies, s = dimes, d = dollars, f = tens of dollars, o = overflow(exits program), x = exit, \nenter any other character to display the current amount: " << endl;
        cout << "Enter the value you wish to increment: ";
        cin >> inputValue;
        if (inputValue != 'a' && inputValue != 's' && inputValue != 'd' && inputValue != 'f' && inputValue != 'o' && inputValue != 'x')
        {
            display();
            input();
        }
        else if (inputValue == 'x' || inputValue == 'X')
        {
            display();
        }
        else if (inputValue == 'o' || inputValue == 'O')
        {
            exit(1);
        }
        else
        {
            //get the amount they wish to change it by
            cout << "How much would you like to increase the value? " << endl;
            cin >> incrementAmount;

            incrementor(inputValue, incrementAmount);
        }

}

void Counter::incrementor(int inputValue, int incrementAmount)
{
    //begin if else structure to decide what to do with these things
    if (incrementAmount >= 0 && incrementAmount <= 9)
    {
        switch (inputValue)
        {
            case 'a':
            case 'A':
                incr1(incrementAmount);
                if (centTotal > 99)
                {
                    incr100(centTotal * 0.01);
                    centTotal -= 100;

                    if (isOverflow(dollarTotal))
                    {
                        exit(1);
                    }
                }

                input();
                break;

            case 's':
            case 'S':
                incr10(incrementAmount);
                if (centTotal > 99)
                {
                    incr100(centTotal * 0.01);
                    centTotal -= 100;

                    if (isOverflow(dollarTotal))
                    {
                        exit(1);
                    }
                }
                else
                {
                input();
                }
                break;

            case 'd':
            case 'D':
                incr100(incrementAmount);
                if (isOverflow(dollarTotal))
                {
                    exit(1);
                }
                else
                {
                    input();
                }
                break;


            case 'f':
            case 'F':
                incr1000(incrementAmount);
                if (isOverflow(dollarTotal))
                {
                    exit(1);
                }
                else
                {
                    input();
                }
                break;

            case 'o':
            case 'O':
                exit(1);
                break;

            default:
                //cout << "You did not enter a proper choice of value to increment. You will be sent back to the input area...\n\n";
                display();
                break;
        }

    }
    else
    {
        cout << "You need to enter a value between 0 and 9...\n\n";
        input();
    }

}

//begin main
int main()
{
    Counter c1;

    c1.input();
}

