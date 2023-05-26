package Units;

import java.util.ArrayList;

public abstract class Warrior extends Unit{
    protected int armor;

    public Warrior(int initiative, ArrayList<Unit> team, String name, int hp, int maxHP, int speed, int damage, int armor, int x, int y) {
        super(initiative, team, name, hp, maxHP, speed, damage, x, y);
        this.armor = armor;
    }

}
