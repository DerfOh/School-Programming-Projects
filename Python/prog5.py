# This program will ask the user for 5 test scores, will average them and
#display a letter grade for each

def main():
    # Call Standard output header
    header()

    # Greet the user
    print 'This is the test average program for 5 Tests'

    # Define testScores dataset
    testScores = []
    
    # Retrieve scores and append them to the testScores dataset
    testScores.append(input('Enter test score 1 '))
    testScores.append(input('Enter test score 2 '))
    testScores.append(input('Enter test score 3 '))
    testScores.append(input('Enter test score 4 '))
    testScores.append(input('Enter test score 5 '))

    # Call calc_average with the testScores dataset arguement and assign the
    #returned scoreAverage to the variable
    scoreAverage = calc_average(testScores)

    
    # Call determineGrade function to find the letter grade of the testScores' values and
    #assign the letterGrade dataset to the letterGrade dataset in main
    letterGrade = determineGrade(testScores, scoreAverage)
    
    # Call the averageLetterGrade function with the score average variable and assign the
    #returned string to the averageLetter variable
    averageLetter = averageLetterGrade(scoreAverage)

    # Call the outputTable function with the testScores, scoreAverage, letterGrade,
    #and the averageLetter for output to the user
    outputTable(testScores, scoreAverage, letterGrade, averageLetter)
    
# This function calculates the average test score
def calc_average(testScores):
    #use the sum, float, and lenghth functions determine the average score of the sets
    scoreAverage = sum(testScores) / float(len(testScores))

    # Return the score average to main
    return scoreAverage

# Finds the letter grades for the test scores
def determineGrade(testScores, scoreAverage):
    letterGrade = []

    # Evaluate the letter grade for each score in the testScores data set and append
    #the values to the letterGrade data set
    for i in testScores:
        if i >= 90:
            letterGrade.append('A')
        if i >= 80 and i < 90:
            letterGrade.append('B')
        if i >= 70 and i < 80:
            letterGrade.append('C')
        if i >= 60 and i < 70:
            letterGrade.append('D')
        if i < 60:
            letterGrade.append('F')

    #return the letterGrade dataset to the main function
    return letterGrade

# Finds the letter grade of the score average
def averageLetterGrade(scoreAverage):
    if scoreAverage >= 90:
        averageLetter = 'A'
    if scoreAverage >= 80 and scoreAverage < 90:
        averageLetter = 'B'
    if scoreAverage >= 70 and scoreAverage < 80:
        averageLetter = 'C'
    if scoreAverage >= 60 and scoreAverage < 70:
        averageLetter = 'D'
    if scoreAverage < 60:
        averageLetter = 'F'

    #return the letter grade of the average grades to the main function
    return averageLetter


#Creates an easily readable table for the user
def outputTable(testScores, scoreAverage, letterGrade, averageLetter):
    print '\n\nTest Number\t\tTest Score\tLetterGrade'
    print '----------------------------------------------------'
    print '1\t\t\t', testScores[0], '\t\t', letterGrade[0]
    print '2\t\t\t', testScores[1], '\t\t', letterGrade[1]
    print '3\t\t\t', testScores[2], '\t\t', letterGrade[2]
    print '4\t\t\t', testScores[3], '\t\t', letterGrade[3]
    print '5\t\t\t', testScores[4], '\t\t', letterGrade[4]
    print '----------------------------------------------------'
    print 'Average test Score\t', scoreAverage, '\t\t', averageLetter
    

        
def header():
    print 'CSC 122-02 - Program #5'
    print 'By Fredrick Paulin'
    print 'Due 11-29'
    print '************************\n\n'
    

main()
