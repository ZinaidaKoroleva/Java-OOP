package Units;

import java.util.ArrayList;

public class Sniper extends Shooter{
    public Sniper( ArrayList<Unit> team, String name, int x, int y){
        super(4, team, name, 10, 10, 2, 2, 6, 15, 15, 0.5f, x, y);
    }
    @Override
    public String toString(){
        return "Sniper "+ name;
    }
    void headShot(){
        
    }

    @Override
    public String getInfo() {
       return "Sniper "+ name + " HP: " + hp + " MaxHP: " + maxHP + " Speed: " + speed + " Damage: " + damage +
       " Distanse: " + distanse + " Max count bullet: " + maxcoutBullet + " Current bullet: " + currentCountBullet +
       " Accuracy: " + accuracy;
    }
}
