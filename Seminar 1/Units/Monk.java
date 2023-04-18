package Units;

public class Monk extends Magician{
    
    public Monk(String name){
        super(name, 20, 20, 3, 1, 20,20);
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
       return name + "HP: " + hp + " MaxHP: " + maxHP + " Speed: " + speed + " Damage: " + 
       damage + " Mana: " + mana + " Max mana: " + maxMana;
    }
}
