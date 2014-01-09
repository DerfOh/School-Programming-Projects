//************************************************************************************
//*Name:              Fredrick Paulin & Thomas Lhota
//*Program:           CSC 175 Assignment 4
//*Due Date:          Apr 16, 2013
//*Program Function:  A program that sorts subscriber records according to their date
//************************************************************************************

#include <iostream>
#include <fstream>  //to use file streams
#include <string>   //to read in line by line
#include <sstream>
#include <cstring>
#include <cstdlib>
#include <cctype>   //checks input values for chars, more specifically so we can check the dates with the isAlpha() tool

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

int stringToInteger(string s);          //declaration of converter for strings to integers
void spaceToZero(string& maybeSpacy);   //use this to change any spaces in a string to a Zero character


void toOutput(int i, subscriberRecord subscriber);     //used to output to the OUTPUT_FILE.txt document
void toInvalid(int i, subscriberRecord subscriber);    //used to output to the INVALID_FILE.txt document
void toExpiry(int i, subscriberRecord subscriber);     //used to output to the EXPIRY.txt document
bool compareDates(int currentDate, string date);        //compares dates by converting the subscriber.expirationString into an int
bool validity(string date);                             //checks every character in the subscriber.expirationString for alphanumaric characters
                                                        //returns value to bool isInvalid

int main()
{
    //strings to be pulled from the input file named via struct, use subscriber.RECORDNAME to access string
    subscriberRecord subscriber;

    int i = 0, currentDate;
    bool isInvalid, isExpired;


    ifstream inFile;
    inFile.open("INPUT_DATA.txt");
    if (inFile.fail())
    {
        cout << "\nFailed to open file! Please make sure you have the correct file name 'INPUT_DATA.TXT' \n\n";
        exit(1);
    }


    cout << "Enter the current date in YYMMDD format: ";
    cin >> currentDate;


    while (getline (inFile, subscriber.lastName))  //retrieve info from input file, if it cannot retieve a new line the loop will break
    {
        getline (inFile, subscriber.firstName);
        getline (inFile, subscriber.streetAddress);
        getline (inFile, subscriber.city);
        getline (inFile, subscriber.state);
        getline (inFile, subscriber.country);
        getline (inFile, subscriber.zipString);
        getline (inFile, subscriber.expirationString);
        getline (inFile, subscriber.subscriberNumString);

        spaceToZero(subscriber.expirationString);
        isInvalid = false;

        isInvalid = validity(subscriber.expirationString);
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

        i++;


    }
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

void toOutput(int i, subscriberRecord subscriber)
{
    ofstream outputFile;
    if (i == 1)
        outputFile.open("OUTPUT_FILE.txt");
    else
        outputFile.open("OUTPUT_FILE.txt", ofstream::app);

    //outputFile << "Entry: " << i << endl; //Remove this when we no longer need it
    outputFile << "\t" << subscriber.firstName << " " << subscriber.lastName << endl;
    outputFile << "\t" <<  subscriber.streetAddress << endl;
    outputFile << "\t" <<  subscriber.city <<", " << subscriber.state << " " << subscriber.country << endl;
    outputFile << "\t" <<  subscriber.zipString << endl;
    outputFile << "Exp " << subscriber.expirationString << "\t\t#" << subscriber.subscriberNumString;
    outputFile << "\n" << endl;
    outputFile.close();
    return;

}

void toInvalid(int i, subscriberRecord subscriber)
{
    ofstream outputFile;
    if (i == 1)
        outputFile.open("INVALID_FILE.txt");
    else
        outputFile.open("INVALID_FILE.txt", ofstream::app);

    //outputFile << "Entry: " << i << endl; //Remove this when we no longer need it
    outputFile << subscriber.lastName << endl;
    outputFile << subscriber.firstName << endl;
    outputFile << subscriber.streetAddress << endl;
    outputFile << subscriber.city << endl;
    outputFile << subscriber.state << endl;
    outputFile << subscriber.country << endl;
    outputFile << subscriber.zipString << endl;
    outputFile << subscriber.expirationString << endl;
    outputFile << subscriber.subscriberNumString << endl;
    //outputFile << " \n" << endl; //Remove this when done
    outputFile.close();
    return;

}

void toExpiry(int i, subscriberRecord subscriber)
{
    ofstream outputFile;
    if (i == 1)
        outputFile.open("EXPIRY_FILE.txt");
    else
        outputFile.open("EXPIRY_FILE.txt", ofstream::app);

    //outputFile << "Entry: " << i << endl; //Remove this when we no longer need it
    outputFile << subscriber.lastName << endl;
    outputFile << subscriber.firstName << endl;
    outputFile << subscriber.streetAddress << endl;
    outputFile << subscriber.city << endl;
    outputFile << subscriber.state << endl;
    outputFile << subscriber.country << endl;
    outputFile << subscriber.zipString << endl;
    outputFile << subscriber.expirationString << endl;
    outputFile << subscriber.subscriberNumString << endl;
    //outputFile << " \n" << endl;//remove this when done
    outputFile.close();
    return;
}

bool compareDates(int currentDate, string date)
{
    int dateNum = stringToInteger(date);
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
    bool isInvalid = false;
    for (int i = 0; i <date.length(); i++)
    {
        if (isalpha(date[i]))
        {
            isInvalid = true;
        }
            if (isInvalid)
            {
                return isInvalid;
            }
        else
        {
            isInvalid = false;
        }
    }
    return isInvalid;
}
