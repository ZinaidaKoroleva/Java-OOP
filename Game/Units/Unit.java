package Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Unit implements GameInterface, Comparable{
    protected String name;
    protected int speed,damage, hp, maxHP, initiative;
    protected ArrayList<Unit> team;
    protected Coordinate coordinate;
    protected ArrayList<Unit> enemy;

    protected Unit(int initiative, ArrayList<Unit> team, String name, int hp, int maxHP, int speed, int damage, int x, int y) {
        this.initiative = initiative;
        this.team = team;
        this.name = name;
        this.hp = hp;
        this.maxHP = maxHP;
        this.speed = speed;
        this.damage = damage;
        this.coordinate = new Coordinate(x, y);
    }
    
   @Override
   public void step(){

   }

   protected void healed(int koeff) {
    this.hp =  koeff + this.hp > this.maxHP ? this.maxHP : this.hp + koeff;
   }

   @Override
   public int compareTo(Object o){
        Unit unit = (Unit)o;
        return  unit.initiative-this.initiative;
   }
}
