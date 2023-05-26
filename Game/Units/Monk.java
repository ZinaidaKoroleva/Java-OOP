package Units;

import java.util.ArrayList;

public class Monk extends Magician{
    
    public Monk(ArrayList<Unit> team, String name, int x, int y){
        super(2,team, name, 20, 20, 3, 1, 20,20, x, y);
    }

    @Override
    public String toString(){
    return "Monk "+ name;
    }
    void heal(){

    }

    @Override
    public void step() {
       
    }
    @Override
    public String getInfo() {
       return "Monk "+ name + " HP: " + hp + " MaxHP: " + maxHP + " Speed: " + speed + " Damage: " + 
       damage + " Mana: " + mana + " Max mana: " + maxMana;
    }
}
