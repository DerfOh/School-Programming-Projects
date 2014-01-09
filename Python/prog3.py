import time         #import the time function for the suspensful pause in the changeGame function

pennie = 0.01               #Set Global variables for the cent values of the currancies 
nickle = 0.05
dime = 0.10
quarter = 0.25
dollar = 1.00

def name():                                     #define the name function
    print 'CSC 122-02 - program 3'
    print 'By Fredrick Paulin'
    print 'Due Oct 31, 2011'
    print 'This program is a game that prompts the user to make a dollar using their inputed amount of coins \n\n'
   



def main():                                     #define the main function

    name()
    print 'Hello player!'
    print 'Welcome to the change game :-)'                           #greet the user
    pennieGuess = input('\n\nEnter the number of pennies: ')                #Get the number of pennies
    nickleGuess = input('Enter the number of nickles: ')                #Get the number of nickles
    dimeGuess = input('Enter the number of dimes: ')                    #Get the number of dimes
    quarterGuess = input('Finally enter the number of quarters: ')      #Get the number of quarters




    changeCalculator(pennieGuess, nickleGuess, dimeGuess, quarterGuess)             #Call the changeCalculator function


def changeCalculator(pennieG, nickleG, dimeG, quarterG):    #define the changeCalculator function and rename arguements truncating Guess to just G

    
    pennieTotal = pennieG * pennie                  #Calculate the total amounts of each guess                                    
    nickleTotal = nickleG * nickle
    dimeTotal = dimeG * dime
    quarterTotal = quarterG * quarter

    totalChange = pennieTotal + nickleTotal + dimeTotal + quarterTotal      #Calculate the total of the change

    changeGame(totalChange)                               #Call the changeGame function


def changeGame(totalChange):                    #define the changeGame function


    if totalChange == dollar:                                                               #find wether the amount is over, under, or equal to $1.00 and then output the results to the user

        print '--------------------------------------------------------------'
        time.sleep(3)       #sleep for 3 seconds to create suspense
        print "\n\nCongradulations! You've won!"
        
    elif totalChange > dollar:
        howMuchOver = totalChange - dollar          #find how much the player is over
        time.sleep(3)
        print '--------------------------------------------------------------'
        print '\n\nThe total is more than $1.00, you are over by $%.2f' % howMuchOver

    elif totalChange < dollar:
        howMuchUnder = dollar - totalChange         #find how much the player is under
        time.sleep(3)
        print '--------------------------------------------------------------'
        print '\n\nThe Total is less than $1.00, you are under by $%.2f' % howMuchUnder

main()      #call the main function
        

    
