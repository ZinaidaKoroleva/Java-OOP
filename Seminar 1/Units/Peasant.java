package Units;

public class Peasant extends Unit{

    public Peasant(String name) {
        super(name, 8, 8, 1, 1);
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
       return name + "HP: " + hp + " MaxHP: " + maxHP + " Speed: " + speed + " Damage: " + damage;
    }
}
