package Units;

public class Warrior extends Unit{
    protected int armor;
    public Warrior(String name, int hp, int maxHP, int speed, int damage, int armor){
        super(name, hp, maxHP, speed, damage);
        this.armor = armor;
    }
}
