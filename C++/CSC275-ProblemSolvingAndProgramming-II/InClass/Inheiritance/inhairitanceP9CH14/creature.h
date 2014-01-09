#ifndef CREATURE_H
#define CREATURE_H


class creature
{
    public:
        creature();//human 10 st 10 hp
        virtual ~creature();
        creature( int newType, newStrenghth, int newHit); //initializecreature to new type, st and hp
        int getDamage();
        //returns amount of damage this creature inflicts in one round of combat

    protected:
    private:
        int type;
        int strength; //how much damage it can inflict
        int hitpoints; //damage it can sustain
        string getSpecies();//returns species type

};

#endif // CREATURE_H
