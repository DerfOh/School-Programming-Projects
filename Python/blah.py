def main():
    print 'hello maddie'
    gameChoice = raw_input('would you like to play a game? ')
    if gameChoice == 'y':
        game()
    else:
        main()

def game():
    print ' haha you loose'
    count = 0
    while count < 100:
        print 'Ham ', count
        count += 1
    
main()
