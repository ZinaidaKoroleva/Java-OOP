package Units;

public class Warlock extends Magician{
    public Warlock(String name){
        super(name, 15, 15, 2, 1, 30,30);
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
       return name + "HP: " + hp + " MaxHP: " + maxHP + " Speed: " + speed + " Damage: " + 
       damage + " Mana: " + mana + " Max mana: " + maxMana;
    }
}
