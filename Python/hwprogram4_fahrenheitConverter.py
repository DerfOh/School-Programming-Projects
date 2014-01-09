#This program will calculate the fahrenheit values for the celcius temperatures
# 0 to 25

# My name and stuff
def standardOutputHeaderInformation():
    print 'CSC 122 program #4\nBy Fredrick Paulin\nDue Nov, 15 By Midnight'

# Define main function
def main():

    # Print out a header for the user
    print '\nWelcome to the Celcius/Fahrenheit table :D'
    print '\nCelcius\t\tFahrenheit'
    print '----------------------------\n\n'

    #For loop that evaluates the fahrenheit temperature for the values up-to
    #but not including 26. cel = celcius, fah = fahrenheit 
    for cel in range(0, 26):
        fah = float(9.00/5.00 * cel + 32)

        #outputs the values to the user with a float of two decimals points
        print "%.2f" % cel, '\t\t%.2f' % fah

#call the standard output header information function
standardOutputHeaderInformation()
#call main function
main()
        
    
