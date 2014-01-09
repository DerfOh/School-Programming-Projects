//
//  ComputerPlayer.cpp
//  Programming_Assignment_7
//
//  Created by Fredrick Paulin on 11/20/13.
//  Copyright (c) 2013 Fredrick Paulin. All rights reserved.
//

#include "ComputerPlayer.h"
#include <ctime>

int ComputerPlayer::getGuess(){
    int guess;
    
    guess = rand() % 100;
    cout << "Computer Guessed: " << guess << endl;
    return guess;
}
