package Units;

import java.util.ArrayList;

public class Peasant extends Unit{

    public Peasant(ArrayList<Unit> team, String name) {
        super(1,team, name, 8, 8, 1, 1);
    }
    @Override
    public String toString(){
    return "Peasant "+ name;
    }
    void run(){
    }

    @Override
    public void step() {
       
    }
    @Override
    public String getInfo() {
       return "Peasant "+ name + " HP: " + hp + " MaxHP: " + maxHP + " Speed: " + speed + " Damage: " + damage;
    }
}
