#include <iostream>
//void getinput (&int age, &int nameLetters);
//void decideLifespan (&int age, &int nameLetters, &int lifespan);
//void output (&int age, &int nameLetters, &int lifespan);
//
int main()
{
    int age, nameLetters, lifespan;
    void getinput(&int age, &int nameLetters), decideLifespan(age, nameLetters, lifespan), output(age, nameLetters, lifespan);

    getinput(age, nameLetters);
    decideLifespan(age, nameLetters, lifespan);
    output(age, nameLetters, lifespan);
    return 0;

}

void getinput(&int age, &int nameLetters)
{
    using namespace std;
    cout << "Enter your age, and the number of letters in your name"
    cin >> age >> nameLetters;
    return;

}

void decideLifespan (&int age, &int nameLetters, &int lifespan)
{
    lifespan = (age - nameLetters) * (age + nameLetters)
}

void output (&int age, &int nameLetters, &int lifespan)
{
    using namespace std;
    cout << "You are " << age << " years old, and have " << nameLetters << " in your name\n"
    "Your computed lifespan is: " << lifespan << " years total\n"
    "That means you still have " << lifespan - age << " years left to live";

}
