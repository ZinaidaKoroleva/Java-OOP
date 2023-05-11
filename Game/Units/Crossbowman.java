package Units;

import java.util.ArrayList;

public class Crossbowman extends Shooter{
    public Crossbowman(ArrayList<Unit> team, String name){
        super(4,team, name, 12, 12, 2, 3, 3, 15, 15, 0.5f);
    }
    @Override
    public String toString(){
    return "Crossbowman "+ name;
    }
    void recharge(){

    }
    @Override
    public void step() {
       
    }
    
    @Override
    public String getInfo() {
       return "Crossbowman "+ name + " HP: " + hp + " MaxHP: " + maxHP + " Speed: " + speed + " Damage: " + damage +
       " Distanse: " + distanse + " Max count bullet: " + maxcoutBullet + " Current bullet: " + currentCountBullet +
       " Accuracy: " + accuracy;
    }
}
