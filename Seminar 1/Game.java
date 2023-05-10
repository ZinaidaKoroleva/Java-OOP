import java.util.ArrayList;
import java.util.Random;

import Units.*;

public class Game {
    public static void main(String[] args) {
        Sniper neo = new Sniper("Neo");
        // System.out.println(neo);
        Crossbowman legolas = new Crossbowman("Legolas");
        // System.out.println(legolas.getInfo());
        Monk shaolin = new Monk("Shao-lin");
        // System.out.println(shaolin.getInfo());
        Peasant mikola = new Peasant("Mikola");
        // System.out.println(mikola.getInfo());
        Spearman gomer = new Spearman("Gomer");
        // System.out.println(gomer);
        Thief assasin = new Thief("Assasin");
        // System.out.println(assasin);
        Warlock merlin = new Warlock("Merlin");
        // System.out.println(merlin);

        ArrayList <Unit> team1 = new ArrayList<>();
        for (int i  = 0; i < 10; i++) {
            switch (new Random().nextInt(4)){
                case 0:
                    team1.add(new Sniper(getName()));
                    break;
                case 1:
                    team1.add(new Crossbowman(getName()));
                    break;
                case 2:
                    team1.add(new Monk(getName()));
                    break;
                case 3:
                    team1.add(new Warlock(getName()));
                    break;   
            }
        }

        ArrayList <Unit> team2 = new ArrayList<>();
        for (int i  = 0; i < 10; i++) {
            switch (new Random().nextInt(4)){
                case 0:
                    team2.add(new Sniper(getName()));
                    break;
                case 1:
                    team2.add(new Crossbowman(getName()));
                    break;
                case 2:
                    team2.add(new Monk(getName()));
                    break;
                case 3:
                    team2.add(new Warlock(getName()));
                    break;   
            }
        }
        System.out.println("Team 1: ");
        team1.forEach(unit -> System.out.println(unit.getInfo()));
        System.out.println("Team 2: ");
        team2.forEach(unit -> System.out.println(unit.getInfo()));
        team2.forEach(unit -> unit.step());
    }
    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}
