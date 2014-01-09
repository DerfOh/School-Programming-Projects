#include <iostream>
#include <fstream>  //to use file streams
#include <string>   //to read in line by line
#include <sstream>
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

//bool validity(string expirationString);    //this checks the expiry date for non-digits (other than spacees), anything that is invalid
                                    //anything that is deemed invalid should be written to the INVALID_FILE.txt

void toOutput(int i, subscriberRecord& subscriber); //used to output to the OUTPUT_FILE.txt, pass variables as such: toOutput(i, subscriber);
void toInvalid(int i, subscriberRecord& subscriber);
void toExpiry(int i, subscriberRecord& subscriber);

int main()
{
    //strings to be pulled from the input file
    subscriberRecord subscriber;

    int subscriberInt,
        expirationInt, //in yymmdd format
        currentDate,    //in yymmdd format
        zipCode,
        i = 1;

    bool isInvalid;

    ifstream inFile;

    ofstream expiredAccounts;


    inFile.open("INPUT_DATA.txt");
    expiredAccounts.open("EXPIRY_FILE.txt");


    if (inFile.fail())
    {
        cout << "\nFailed open! \n\n";
        exit(1);
    }

    cout << "Enter the current date in YYMMDD format: ";
    cin >> currentDate;

    while (getline (inFile, subscriber.lastName))  //retrieve info from input file.
    {
        isInvalid = false;
        //getline (inFile, lastName);
        getline (inFile, subscriber.firstName);
        getline (inFile, subscriber.streetAddress);
        getline (inFile, subscriber.city);
        getline (inFile, subscriber.state);
        getline (inFile, subscriber.country);
        getline (inFile, subscriber.zipString);
        getline (inFile, subscriber.expirationString);
        getline (inFile, subscriber.subscriberNumString);


        spaceToZero(subscriber.expirationString);
        expirationInt = stringToInteger(subscriber.expirationString);

//        toInvalid(i, subscriber);
//        toOutput(i, subscriber);
//        toExpiry(i, subscriber);
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
