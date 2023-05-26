package Units;

import java.util.ArrayList;

public class Warlock extends Magician{
    public Warlock(ArrayList<Unit> team, String name, int x, int y){
        super(2,team, name, 15, 15, 2, 1, 30,30, x, y);
    }
    @Override
    public String toString(){
    return "Warlock "+ name;
    }

    void terribleSpell(){

    }

    @Override
    public void step() {
       
    }
    @Override
    public String getInfo() {
       return "Warlock "+ name + " HP: " + hp + " MaxHP: " + maxHP + " Speed: " + speed + " Damage: " + 
       damage + " Mana: " + mana + " Max mana: " + maxMana;
    }
}
