package Units;

import java.util.ArrayList;

public abstract class Shooter extends Unit{
    protected int distanse,maxcoutBullet,currentCountBullet;
    protected float accuracy;
    



public Shooter(int initiative, ArrayList<Unit> team, String name, int hp, int maxHP, int speed, int damage, int distanse,
        int maxcoutBullet, int currentCountBullet, float accuracy, int x, int y) {
    super(initiative, team, name, hp, maxHP, speed, damage, x, y);
    this.distanse = distanse;
    this.maxcoutBullet = maxcoutBullet;
    this.currentCountBullet = currentCountBullet;
    this.accuracy = accuracy;
}

@Override
public void step() {
   if (hp <= 0 && currentCountBullet <= 0){
        return;
   }
}
}
