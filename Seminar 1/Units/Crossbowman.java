package Units;

public class Crossbowman extends Shooter{
    public Crossbowman(String name){
        super(name, 12, 12, 2, 3, 3, 15, 15, 0.5f);
    }
    @Override
    public String toString(){
    return "Crossbowman "+ name;
    }
    void recharge(){

    }
}
