package Units;

import java.util.ArrayList;

public class Warlock extends Magician{
    public Warlock(ArrayList<Unit> team, String name){
        super(team, name, 15, 15, 2, 1, 30,30);
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
       return name + " HP: " + hp + " MaxHP: " + maxHP + " Speed: " + speed + " Damage: " + 
       damage + " Mana: " + mana + " Max mana: " + maxMana;
    }
}
