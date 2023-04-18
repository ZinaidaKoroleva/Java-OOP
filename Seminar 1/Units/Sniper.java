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
}
