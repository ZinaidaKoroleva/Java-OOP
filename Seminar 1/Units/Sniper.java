package Units;

public class Sniper extends Shooter{
    public Sniper(String name){
        super(name, 10, 10, 2, 2, 6, 15, 15, 0.5f);
    }
    @Override
    public String toString(){
        return "Sniper "+ name;
    }
    void headShot(){
        
    }
    @Override
    public void step() {
       
    }
    @Override
    public String getInfo() {
       return name + "HP: " + hp + " MaxHP: " + maxHP + " Speed: " + speed + " Damage: " + damage +
       " Distanse: " + distanse + " Max count bullet: " + maxcoutBullet + " Current bullet: " + currentCountBullet +
       " Accuracy: " + accuracy;
    }
}
