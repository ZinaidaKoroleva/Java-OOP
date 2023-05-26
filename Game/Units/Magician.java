package Units;
import java.util.ArrayList;

public abstract class Magician extends Unit{
    int mana, maxMana;

    public Magician(int initiative, ArrayList<Unit> team, String name,int hp, int maxHP, int speed, int damage, int mana, int maxMana, int x, int y){
        super(initiative,team, name, hp, maxHP, speed, damage, x, y);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    @Override
    public void step(){
        if(mana < 5) {
            System.out.println("Нет маны");
            return;
        }
        int index_damaged = 0;
        for (int i = 0; i < team.size(); i++) {
            for (int j = i+1; j < team.size()-1; j++) {
                if(team.get(i).hp !=0 || team.get(j).hp !=0){
                    if ((team.get(i).hp / team.get(i).maxHP) < (team.get(j).hp / team.get(j).maxHP)){
                    index_damaged = i;
                    }
                }
            }
        }
        // team.get(index_damaged).healed(new Random().nextInt(this.damage[0], this.damage[1]));
        team.get(index_damaged).healed(this.damage);
        this.mana -=5;
    }
}
