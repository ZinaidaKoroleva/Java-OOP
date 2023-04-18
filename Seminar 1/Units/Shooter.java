package Units;

public class Shooter extends Unit{
    protected int distanse,maxcoutBullet,currentCountBullet;
    protected float accuracy;
    
    public Shooter(String name, int hp, int maxHP, int speed, int damage,int distanse, int maxcoutBullet, int currentCountBullet, float accuracy){
        super(name, hp, maxHP, speed, damage);
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
