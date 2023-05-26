package Units;

import java.util.ArrayList;

public class Thief extends Warrior {
    
    public Thief(ArrayList<Unit> team, String name, int x, int y){
        super(3,team, name, 12, 12, 3, 2,1, x, y);
    }
    @Override
    public String toString(){
    return "Thief "+ name;
    }

    void dodge(){
    }

    void trueStrike(){   
    }

    @Override
    public void step() {
       
    }
    @Override
    public String getInfo() {
       return "Thief "+  name + " HP: " + hp + " MaxHP: " + maxHP + " Speed: " + speed + " Damage: " + damage + " Armor: " + armor;
    }
}
