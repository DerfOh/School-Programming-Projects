def main():
    print'CSC 122 - Program #2'                         #Print my name, class, and assignment
    print'By Fred Paulin'
    print'Due: October 17, 2011'
    classAseats = 15                                    #Set variables for the rates the seats go for
    classBseats = 12
    classCseats = 9
    countAseats = input('Enter count of A seats: ')     #Find how many of each seats have been sold
    countBseats = input('Enter count of B seats: ')
    countCseats = input('Enter count of C seats: ')
    incomeAseats = classAseats * countAseats            #Compute the amount of money made on each seating class
    incomeBseats = classBseats * countBseats
    incomeCseats = classCseats * countCseats
    

    showIncome(incomeAseats, incomeBseats, incomeCseats)    #Call the Income function



def showIncome(a, b, c):
    totalIncome = a + b + c                             #Calculate the total income and assign the value
    print'Seats A made: %.2f' % a                       #Output the variables a, b, c, and total income to the user
    print'Seats B made: %.2f' % b                       
    print'Seats C made: %.2f' % c
    print'The total income is %.2f' % totalIncome



main()                                                  #Call the main function
