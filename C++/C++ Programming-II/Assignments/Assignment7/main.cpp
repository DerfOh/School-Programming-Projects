//
//  main.cpp
//  Programming_Assignment_7
//
//  Created by Fredrick Paulin on 11/20/13.
//  Copyright (c) 2013 Fredrick Paulin. All rights reserved.
//

#include <iostream>
#include "Player.h"
#include "HumanPlayer.h"
#include "ComputerPlayer.h"


using namespace std;

bool checkForWin(int guess, int answer);
void play(Player &player1, Player &player2);

int main()
{
    int mode = 0;
    cout << "1. Human vs Human \n2. Human vs Computer \n3. Computer vs Computer" << endl;
    cin >> mode;
    
    HumanPlayer hPlayer1, hPlayer2;
    ComputerPlayer cPlayer1, cPlayer2;

    switch (mode)
    {
        case 1:
        {
            Player *m1player1 = &hPlayer1;
            Player *m1player2 = &hPlayer2;
            play(*m1player1, *m1player2);
            break;
        }
        case 2:
        {
            Player *m2player1 = &hPlayer1;
            Player *m2player2 = &cPlayer2;
            play(*m2player1, *m2player2);
            break;
        }
        case 3:
        {
            Player *m3player1 = &cPlayer1;
            Player *m3player2 = &cPlayer2;
            play(*m3player1, *m3player2);
            break;
        }
        default:
        {
            cout << "Invalid choice...";
            main();
            break;
        }
    };
    
    
}

bool checkForWin(int guess, int answer)
{
    if (answer == guess)
    {
        cout << "You're right! You Win!\n" << endl;
        return true;
    }
    else if (answer<guess)
        cout << "Your guesss is too high.\n" << endl;
    else
        cout << "Your guess is too low.\n" << endl;
    return false;
}


void play(Player &player1, Player &player2)
{
    int answer = 0, guess = 0;
    answer = rand()*time(0) % 100;
    bool win = false;
    while (!win) {
        cout << "Player 1's turn to guess." << endl;
        guess = player1.getGuess();
        win = checkForWin(guess, answer);
        if (win) {
            return;
        }
        cout << "Player 2's turn to guess." << endl;
        guess = player2.getGuess();
        win = checkForWin(guess, answer);
    }
}

