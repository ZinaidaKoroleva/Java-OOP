package Units;

public class Thief extends Warrior {
    
    public Thief(String name){
        super(name, 12, 12, 3, 2,1);
    }
    @Override
    public String toString(){
    return "Thief "+ name;
    }
    void dodge(){
    }

    void trueStrike(){   
    }
}
