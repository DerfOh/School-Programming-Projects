//
//  HumanPlayer.cpp
//  Programming_Assignment_7
//
//  Created by Fredrick Paulin on 11/20/13.
//  Copyright (c) 2013 Fredrick Paulin. All rights reserved.
//

#include "HumanPlayer.h"
using namespace std;

int HumanPlayer::getGuess()
{
    int guess;
    cout << "Enter a value between 0 and 100" <<endl;
    cin >> guess;
    if ((guess >= 0)||(guess <= 100)) {
        return guess;
    }
    else
    {
        cout << "Invalid input" << endl;
        getGuess();
    }
    return guess;
}