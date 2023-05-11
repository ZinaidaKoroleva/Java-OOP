package Units;

import java.util.ArrayList;

public abstract class Shooter extends Unit{
    protected int distanse,maxcoutBullet,currentCountBullet;
    protected float accuracy;
    



public Shooter(int initiative, ArrayList<Unit> team, String name, int hp, int maxHP, int speed, int damage, int distanse,
        int maxcoutBullet, int currentCountBullet, float accuracy) {
    super(initiative, team, name, hp, maxHP, speed, damage);
    this.distanse = distanse;
    this.maxcoutBullet = maxcoutBullet;
    this.currentCountBullet = currentCountBullet;
    this.accuracy = accuracy;
}

    void shoot(){  
    }
    void findArrow(){  
    }
}
