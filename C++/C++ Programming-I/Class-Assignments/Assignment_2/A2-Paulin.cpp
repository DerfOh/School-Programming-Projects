cvfzdvf#include <iostream>
using namespace std;

int employeePayroll();


//No constants because they "are a security issue".

int main()
{
    cout << "*******************************************************************\n\
* Name:	Fredrick Paulin\n\
* Program: 	CSC 175 Assignment 2\n\
* Due Date:	Feb 14, 2013\n\
* IDE:  	CodeBlocks\n\
* Program function:  Computes Payroll information\n\
*******************************************************************\n" << endl;
    employeePayroll();
}

int employeePayroll()
{
    int employeeID;
    double hoursWorked, hourlyRate, grossPay, amntTaxed, netPay, totalPayAmnt, averagePayAmnt, overTime, overTimePay, regHours;
    double totalPayroll, averagePayroll, counter;
    //constant value for tax.
    double tax = 0.03625;
    char exitLoop;

    //loop iterates the first time no matter what
    do {
        counter +=1;    //counter to compute the averagePayAmnt


        //prompt user for input for employeeID, hourlyRate, and hours worked
        cout << "\n\nEnter the employee ID: ";
        cin >> employeeID;

        cout << "Enter the hourly rate of employee " << employeeID << ": ";
        cin >> hourlyRate;

        cout << "Enter the hours worked by employee " << employeeID << ": ";
        cin >> hoursWorked;

        //This checks and computes the overtime
        if (hoursWorked > 40)
        {
            overTime = hoursWorked - 40;
            regHours = hoursWorked - overTime;
            overTimePay = (hourlyRate * 1.5) * overTime;
        }
        else
        {
            overTime = 0;
            regHours = hoursWorked;
            overTimePay = 0;
        }

        //Calculates grossPay, amntTaxed, and netPay
        grossPay = (regHours * hourlyRate) + overTimePay;

        amntTaxed = grossPay * tax;

        netPay = grossPay - amntTaxed;

        //output everything to the user
        cout << "\n\nPayroll information for employee: " << employeeID << endl;
        cout << "****************************************************\n\n";
        cout << "Hours worked: \t\t" << hoursWorked << "\n";
        cout << "Overtime hours: \t" << overTime << "\n";

        cout.setf(ios::fixed);
        cout.setf(ios::showpoint);
        cout.precision(2);
        cout << "Hourly Rate: \t\t$" << hourlyRate << "\n";

        cout.setf(ios::fixed);
        cout.setf(ios::showpoint);
        cout.precision(2);
        cout << "Gross Pay: \t\t$" << grossPay << "\n";

        cout.setf(ios::fixed);
        cout.setf(ios::showpoint);
        cout.precision(2);
        cout << "Overtime Pay: \t\t$" << overTimePay << "\n";

        cout.setf(ios::fixed);
        cout.setf(ios::showpoint);
        cout.precision(2);
        cout << tax * 100 << "% Tax: \t\t$" << amntTaxed << "\n";

        cout.setf(ios::fixed);
        cout.setf(ios::showpoint);
        cout.precision(2);
        cout << "Net Pay: \t\t$" << netPay << "\n";
        cout << "****************************************************\n\n";

        //calculate the totalPayroll and averagePayroll
        totalPayroll += grossPay;
        averagePayroll = (totalPayroll / counter);

        //output the Total and Average payroll
        cout.setf(ios::fixed);
        cout.setf(ios::showpoint);
        cout.precision(2);
        cout << "Total Gross Payroll: \t\t$" << totalPayroll;

        cout.setf(ios::fixed);
        cout.setf(ios::showpoint);
        cout.precision(2);
        cout << "\nAverage Payroll: \t\t$" << averagePayroll;


        //loop controller
        cout << "\n\nContinue (C), Exit (X): ";
        cin >> exitLoop;



    } while (exitLoop == 'C' || exitLoop == 'c');

    return 0;

}
