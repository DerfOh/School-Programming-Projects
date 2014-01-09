#include <iostream>
#include <fstream>  //to use file streams
#include <string>   //to read in line by line
#include <sstream>
#include <cstring>
#include <cstdlib>
#include <cctype>   //checks input values for chars IE spaces, lower, upper, alpha ect.

using namespace std;



struct subscriberRecord
{
    string lastName;
    string firstName;
    string streetAddress;
    string city;
    string state;
    string country;
    string zipString;
    string expirationString;
    string subscriberNumString;

};

int stringToInteger(string s);  //declaration of converter for strings to integers
                                //this can be used to convert the subscriber number to an integer.
void spaceToZero(string& maybeSpacy); //use this to change any spaces in a string to a Zero character


void toOutput(int i, subscriberRecord& subscriber); //used to output to the OUTPUT_FILE.txt, pass variables as such: toOutput(i, subscriber);
void toInvalid(int i, subscriberRecord& subscriber);
void toExpiry(int i, subscriberRecord& subscriber);
bool compareDates(int currentDate, string date);
bool validity(string date);

int main()
{
    //strings to be pulled from the input file
    subscriberRecord subscriber;

    int i = 1, currentDate;

    bool isInvalid, isExpired;


    ifstream inFile;

    ofstream expiredAccounts;


    inFile.open("INPUT_DATA.txt");


    if (inFile.fail())
    {
        cout << "\nFailed open! \n\n";
        exit(1);
    }

    cout << "Enter the current date in YYMMDD format: ";
    cin >> currentDate;

    while (getline (inFile, subscriber.lastName))  //retrieve info from input file.
    {

        //getline (inFile, lastName);
        getline (inFile, subscriber.firstName);
        getline (inFile, subscriber.streetAddress);
        getline (inFile, subscriber.city);
        getline (inFile, subscriber.state);
        getline (inFile, subscriber.country);
        getline (inFile, subscriber.zipString);
        getline (inFile, subscriber.expirationString);
        getline (inFile, subscriber.subscriberNumString);

        isInvalid = false;

        spaceToZero(subscriber.expirationString);

       //Begin troubleshooting
        int length = subscriber.expirationString.length();
        cout << "Length: " << length << endl;

        cout << "String:" << subscriber.expirationString << endl;
        for (int count=0; count <= length; count++)
        {
\
            if (isalpha(subscriber.expirationString[count]))
            {
                isInvalid = true;
                cout <<"Entry " << count + 1 << " is invalid" << "\n";
            }
            else
            {
                cout << "OK\n";
            }
        }
        //end troubleshooting

        //isInvalid = validity(subscriber.expirationString);



//        expDate = stringToInteger(subscriber.expirationString);
        isExpired = compareDates(currentDate, subscriber.expirationString);

        if (isInvalid)
            {
                toInvalid(i, subscriber);
            }

        else if (isExpired)
            {
                toExpiry(i, subscriber);
            }
        else
            {
                toOutput(i, subscriber);
            }


    }
//        toInvalid(i, subscriber);
//        toOutput(i, subscriber);
//        toExpiry(i, subscriber);
       i++;



    inFile.close();
}



int stringToInteger(string s)
{
    //use object string stream
    stringstream ss;
    int num;
    ss.clear();
    ss.str ("");
    ss << s; //push to string the value of the year
    ss >> num;

    //return number value
    return num;
}

void spaceToZero(string& maybeSpacy)
    {
        for (int i = 0; i < maybeSpacy.length(); i++) //length checks the length of the string
        {

            if (isspace(maybeSpacy[i]))
            {
                maybeSpacy[i] = '0';
            }
        }
    }

void toOutput(int i, subscriberRecord& subscriber)
{
    ofstream outputFile;
    if (i == 1)
        outputFile.open("OUTPUT_FILE.txt");
    else
        outputFile.open("OUTPUT_FILE.txt", ofstream::app);

    outputFile << "Entry: " << i << endl; //Remove this when we no longer need it
    outputFile << "\t" << subscriber.firstName << " " << subscriber.lastName << endl;
    outputFile << "\t" <<  subscriber.streetAddress << endl;
    outputFile << "\t" <<  subscriber.city <<", " << subscriber.state << " " << subscriber.country << endl;
    outputFile << "\t" <<  subscriber.zipString << endl;
    outputFile << "Exp " << subscriber.expirationString << "\t\t#" << subscriber.subscriberNumString;
    outputFile << " \n\n" << endl;
    outputFile.close();
    return;

}

void toInvalid(int i, subscriberRecord& subscriber)
{
    ofstream outputFile;
    if (i == 1)
        outputFile.open("INVALID_FILE.txt");
    else
        outputFile.open("INVALID_FILE.txt", ofstream::app);

    outputFile << "Entry: " << i << endl; //Remove this when we no longer need it
    outputFile << subscriber.lastName << endl;
    outputFile << subscriber.firstName << endl;
    outputFile << subscriber.streetAddress << endl;
    outputFile << subscriber.city << endl;
    outputFile << subscriber.state << endl;
    outputFile << subscriber.country << endl;
    outputFile << subscriber.zipString << endl;
    outputFile << subscriber.expirationString << endl;
    outputFile << subscriber.subscriberNumString << endl;
    outputFile << " \n" << endl; //Remove this when done
    outputFile.close();
    return;

}

void toExpiry(int i, subscriberRecord& subscriber)
{
    ofstream outputFile;
    if (i == 1)
        outputFile.open("EXPIRY_FILE.txt");
    else
        outputFile.open("EXPIRY_FILE.txt", ofstream::app);

    outputFile << "Entry: " << i << endl; //Remove this when we no longer need it
    outputFile << subscriber.lastName << endl;
    outputFile << subscriber.firstName << endl;
    outputFile << subscriber.streetAddress << endl;
    outputFile << subscriber.city << endl;
    outputFile << subscriber.state << endl;
    outputFile << subscriber.country << endl;
    outputFile << subscriber.zipString << endl;
    outputFile << subscriber.expirationString << endl;
    outputFile << subscriber.subscriberNumString << endl;
    outputFile << " \n" << endl;//remove this when done
    outputFile.close();
    return;
}

bool compareDates(int currentDate, string date)
{

    int dateNum = stringToInteger(date);
    //cout << dateNum <<endl;
    if(currentDate <= dateNum)
    {
        return false;
    }
    else
    {
        return true;
    }

}

bool validity(string date)
{
    cout << date << endl;
    for (int i = 0; i <date.length(); i++)
    {
        cout << "Index: "<< i;
        cout << date[i] << endl;
        if (isalpha(date[i]))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
