#include <iostream>
using namespace std;

struct team_struct
{
    string name;
    int players;
    double value;

};


void display_team(team_struct team_in);

int main()
{
    int total_players = 0;
    double total_value = 0;

    team_struct team1 = {"Team 1", 50, 23};
    team_struct team2 = {"Team 2", 25, 25};
    team_struct team3 = {"Team 3", 75, 55};

    total_players = team1.players + team2.players + team3.players;
    total_value = team1.value + team2.value + team3.value;

//    cout << "" << total_players;
//    cout << "" << total_value;
    display_team(team1);
    display_team(team2);
    display_team(team3);
    cout << "===========" << endl
        << "Total Number of players is " << total_players << endl
        << "Total Value is " << total_value << endl;


}

void display_team(team_struct team_in)
{
    cout << "=================" << endl;
    cout << "Team " << team_in.name << " has " << team_in.players << " and is valued at " << team_in.value << endl;
}
