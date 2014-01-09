#include <iostream>
#include "Enemy.h"
#include "Ninja.h"
#include "Monster.h"
#include "Clown.h"

using namespace std;

int main()
{


    Ninja n;
    Monster m;
    Clown c;

    Enemy *enemy1 = &n;
    Enemy *enemy2 = &m;
    Enemy *enemy3 = &c;

    enemy1 -> Attack();
    enemy2 -> Attack();
    enemy3 -> Attack();
}
