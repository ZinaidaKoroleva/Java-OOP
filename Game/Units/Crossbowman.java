package Units;

import java.util.ArrayList;

public class Crossbowman extends Shooter{
    public Crossbowman(ArrayList<Unit> team, String name, int x, int y){
        super(4,team, name, 12, 12, 2, 3, 3, 15, 15, 0.5f, x, y);
    }
    @Override
    public String toString(){
    return "Crossbowman "+ name;
    }
    void recharge(){

    }

    
    @Override
    public String getInfo() {
       return "Crossbowman "+ name + " HP: " + hp + " MaxHP: " + maxHP + " Speed: " + speed + " Damage: " + damage +
       " Distanse: " + distanse + " Max count bullet: " + maxcoutBullet + " Current bullet: " + currentCountBullet +
       " Accuracy: " + accuracy;
    }
}
