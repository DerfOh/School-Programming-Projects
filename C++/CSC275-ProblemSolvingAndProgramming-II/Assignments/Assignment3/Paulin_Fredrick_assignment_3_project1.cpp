#include <iostream>
#include <string>
//#include <cstring>

using namespace std;

class Month
{
    public:
        string input();

        int monthToNumber(string monthLetters);
        string monthToLetters(int monthNumber);


        //mutators
        void inputNumber();
        void inputLetters();
        void incrementOneMonth();

        //accsessors
        void output(){cout << getMonthLetters() << " " << getMonthNumbers() << endl;}
        int getMonthNumbers(){return monthNumber;}
        string getMonthLetters(){return monthLetters;}




        //default constructors
        Month()
        {
            monthLetters = "Jan";
            monthNumber = 1;
        }

        Month(string lettersIn)
        {
            monthLetters = lettersIn;
            monthNumber = monthToNumber(lettersIn);

        }

        Month(int numbersIn)
        {
          monthNumber = numbersIn;
          monthLetters = monthToLetters(numbersIn);
        }

        Month(string lettersIn, int numbersIn)
        {
            monthNumber = numbersIn;
            monthLetters = lettersIn;
        }



    private:
        int monthNumber;
        string monthLetters;
};

int Month::monthToNumber(string monthLetters)
{
    string months[13] = {"zero", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    for(int i = 0; i<13; i++)
    {
        if(monthLetters == months[i])
        {
            return i;
        }
        else
        {
          i++;
        }
    }
}


string Month::monthToLetters(int monthNumber)
{
    string months[13] = {"zero", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    return months[monthNumber];
}


void Month::inputNumber()
{
    cout << "\nEnter a number between 1 and 12 to represent the month" << endl;
    cin >> monthNumber;
}

void Month::inputLetters()
{
    cout << "\nEnter the first three letters of the month" << endl;
    cin >> monthLetters;
}

void Month::incrementOneMonth()
{
    string months[13] = {"zero", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    for(int i = 0; i<13; i++)
    {
        if(monthLetters == months[i])
        {
            i++;
            monthNumber = i;
            monthLetters = months[i];
            return;
        }
        else
        {
            i++;
        }
    }
}

int main()
{
    Month m1;
    Month m2("Feb");
    Month m3(3);
    Month m4("Apr", 4);
    Month m5;

    m1.output();
    m2.output();
    m3.output();
    m4.output();

    m5.inputLetters();
    m5.inputNumber();
    m5.output();

    m5.incrementOneMonth();
    cout << "next month: ";
    m5.output();

}
