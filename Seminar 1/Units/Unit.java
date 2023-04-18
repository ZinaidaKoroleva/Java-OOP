package Units;

public class Unit {
    protected String name;
    protected int speed,damage, hp, maxHP;

    public Unit(String name, int hp, int maxHP, int speed, int damage) {
        this.name = name;
        this.hp = hp;
        this.maxHP = maxHP;
        this.speed = speed;
        this.damage = damage;
    }
    
    public void attack(){

    }
    public void await(){
        
    }
    public void defend(){
        
    }
    public void walk(){
        
    }
    void dead(){
        
    }
}
