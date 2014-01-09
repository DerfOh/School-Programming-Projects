#include <iostream>
#include <fstream>  //to use file streams
#include <string>   //to read in line by line
#include <sstream>
#include <cstdlib>
#include <cctype>   //checks input values for chars IE spaces, lower, upper, alpha ect.

using namespace std;


int stringToInteger(string s);  //declaration of converter for strings to integers
                                //this can be used to convert the subscriber number to an integer.

void spaceToZero(string& maybeSpacy); //use this to change any spaces in a string to a Zero character

bool validity(string expirationString);    //this checks the expiry date for non-digits (other than spacees), anything that is invalid
                                    //anything that is deemed invalid should be written to the INVALID_FILE.txt

int main()
{
    //strings to be pulled from the input file
    string lastName;
    string firstName;
    string streetAddress;
    string city;
    string state;
    string country;
    string zipString;
    string expirationString;
    string subscriberString;

    int subscriberNumber,
        expirationDate, //in yymmdd format
        currentDate,    //in yymmdd format
        zipCode,
        i = 0;

    bool isInvalid;

    ifstream inFile;
    ofstream inValidFiles;
    ofstream expiredAccounts;


    inFile.open("INPUT_DATA.txt");
    if (inFile.fail())
    {
        cout << "\nFailed open! \n\n";
        exit(1);
    }

    cout << "Enter the current date in YYMMDD format: ";
    cin >> currentDate;

    while (getline (inFile, lastName))  //retrieve info from input file.
    {
        isInvalid = false;
        //getline (inFile, lastName);
        getline (inFile, firstName);
        getline (inFile, streetAddress);
        getline (inFile, city);
        getline (inFile, state);
        getline (inFile, country);
        getline (inFile, zipString);
        getline (inFile, expirationString);
        getline (inFile, subscriberString);

        //Test Table, cpy & pst to test the results of a fn in the consol
//        cout << "\n\nTest Case: " << i <<endl;;
//        cout << lastName << endl;
//        cout << firstName << endl;
//        cout << streetAddress << endl;
//        cout << city << endl;
//        cout << state << endl;
//        cout << country << endl;
//        cout << zipString << endl;
//        cout << expirationString << endl;
//        cout << subscriberString << endl;
//        i++;


        spaceToZero(expirationString);



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
