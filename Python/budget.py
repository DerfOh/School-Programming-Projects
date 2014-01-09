def main():
    print'Hello Fred'
    budget()
    contin = raw_input('\nWould you like to continue? y/n ')
    if contin == 'y':
        main()
    else:
        print '\n\n\nGoodbye :)    '

        

def budget():
    income = input('How much did you make this week? ')
    savingsLevel = input('what percentage will you be saving? ')
    smoke = input('How much was spent on smoke? ')
    gas = input('How much did gas cost? ')
    income1 = income - gas
    savingsPercent = 0.01 * savingsLevel
    savings = (income1 * savingsPercent) * 1.00
    income2 = income1 - savings
    income3 = income2 - smoke
    yourBudget(income, income1, income2, income3, savings, gas, savingsLevel, smoke)



    
def yourBudget(startingIncome, gasIncome, savingsIncome, smokingIncome, savings, gas, savingsLevel, smoke):
    print "\nyour total income is", startingIncome
    print '-----------------------'
    print '\nafter your paid', gas, 'for gas this week, you should have', gasIncome, 'left over'
    print 'you chose to save', savingsLevel, 'percent, that will be', savings, 'dollars'
    print 'after savings', savingsIncome,'will remain.'
    print 'you spent', smoke,'on smoking'    
    print 'after your smoke you will have',80
    smokingIncome,'left over'


main()
