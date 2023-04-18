package Units;

public class Magician extends Unit{
    int mana, maxMana;

    public Magician(String name,int hp, int maxHP, int speed, int damage, int mana, int maxMana){
        super(name, hp, maxHP, speed, damage);
        this.mana = mana;
        this.maxMana = maxMana;
    }
}
