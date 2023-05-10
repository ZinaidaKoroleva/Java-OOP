package Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Unit implements GameInterface{
    protected String name;
    protected int speed,damage, hp, maxHP;
    protected ArrayList<Unit> team;

    protected Unit(ArrayList<Unit> team, String name, int hp, int maxHP, int speed, int damage) {
        this.team = team;
        this.name = name;
        this.hp = hp;
        this.maxHP = maxHP;
        if(new Random().nextBoolean()) this.hp/=2;
        this.speed = speed;
        this.damage = damage;
    }
    
   @Override
   public void step(){

   }

}
