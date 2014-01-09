#include <iostream>

using namespace std;

int handshakes(int numPeople);
int main()
{
    int num_people;
    int num_handshakes;
    cout << "How many people are in the room?" << endl;
    cin >> num_people;
    num_handshakes = handshakes(num_people);
    cout << "If everyone shakes hands once, there will be " <<
    num_handshakes << " handshakes." << endl;
    return 0;
}

int handshakes(int numPeople)
{
    int temp;
    for (int i; i<numPeople; i++)
    {
        temp+=i;
    }
    return temp;
}
