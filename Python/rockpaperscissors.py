# A simple rock paper scissors game
import random
import time
def scoreaccum():
    score = 0
    main(score)
    
def main(score):
    print '\n\nr = Rock, p = Paper, s = scissors'
    #The guess by the computer is determined as: 1 = Rock, 2 = Paper, 3 = Scissors
    compGuess = random.randint(1, 4)
    #usrGuess = theGuesser()

    choice = raw_input('Enter your choice... ')
    if choice == 'r':
        usrGuess = 1
        #return(uG)
        
    elif choice == 'p':
        usrGuess = 2
        #return(uG)
    
    elif choice == 's':
        usrGuess = 3
        #return(uG)


    else:
        print 'Enter a valid guess plox... '
        theGuesser()
    

    if compGuess == usrGuess:
        print 'It was a draw... \n'
        print '\nYour score: ', score
        main(score)

    elif compGuess == 1 and usrGuess == 2:
        print 'Paper Covers Rock!'
        score += 1
        print '\nYour score: ', score
    
        main(score)
        
        
    elif compGuess == 1 and usrGuess == 3:
        print 'Rock Destroys Scissors!'
        score -= 1
        print '\nYour score: ', score
  
        main(score)
        

    elif compGuess == 2 and usrGuess == 3:
        print 'Scissors cut paper'
        score += 1
        print '\nYour score: ', score
        
        main(score)
        
        

    elif compGuess == 2 and usrGuess == 1:
        print 'Paper covers rock'
        score -= 1
        print '\nYour score: ', score
   
        main(score)
       
        

    elif compGuess == 3 and usrGuess == 1:
        print 'Rock Destroys Scissors'
        score += 1
        print '\nYour score: ', score
        
        main(score)
       
        

    elif compGuess == 3 and usrGuess == 2:
        print 'Scissors Cut Paper'
        score -= 1
        print '\nYour score: ', score
        
        main(score)


    
    


#def theGuesser():
    


scoreaccum()
        
