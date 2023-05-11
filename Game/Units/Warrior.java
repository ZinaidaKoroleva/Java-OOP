package Units;

import java.util.ArrayList;

public abstract class Warrior extends Unit{
    protected int armor;

    public Warrior(int initiative, ArrayList<Unit> team, String name, int hp, int maxHP, int speed, int damage, int armor) {
        super(initiative, team, name, hp, maxHP, speed, damage);
        this.armor = armor;
    }

}
