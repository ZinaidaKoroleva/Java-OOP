package Units;

import java.util.ArrayList;

public class Spearman extends Warrior{
    public Spearman(ArrayList<Unit> team, String name, int x, int y){
        super(3,team, name, 18, 18, 2, 2,2, x, y);
    }
    @Override
    public String toString(){
    return "Spearman "+ name;
    }
    void roundKick(){
        
    }
    @Override
    public void step() {
       
    }
    @Override
    public String getInfo() {
       return "Spearman "+ name + " HP: " + hp + " MaxHP: " + maxHP + " Speed: " + speed + " Damage: " + damage + " Armor: " + armor;
    }
}
