import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import Units.*;

public class Game {
    public static void main(String[] args) {
        // Sniper neo = new Sniper("Neo");
        // System.out.println(neo);
        // Crossbowman legolas = new Crossbowman("Legolas");
        // System.out.println(legolas.getInfo());
        // Monk shaolin = new Monk("Shao-lin");
        // System.out.println(shaolin.getInfo());
        // Peasant mikola = new Peasant("Mikola");
        // System.out.println(mikola.getInfo());
        // Spearman gomer = new Spearman("Gomer");
        // System.out.println(gomer);
        // Thief assasin = new Thief("Assasin");
        // System.out.println(assasin);
        // Warlock merlin = new Warlock("Merlin");
        // System.out.println(merlin);

        ArrayList <Unit> team1 = new ArrayList<>();
        for (int i  = 1; i < 11; i++) {
            switch (new Random().nextInt(4)){
                case 0:
                    team1.add(new Sniper(team1, getName()), 1, i);
                    break;
                case 1:
                    team1.add(new Crossbowman(team1, getName()), 1, i);
                    break;
                case 2:
                    team1.add(new Monk(team1, getName()), 1, i);
                    break;
                case 3:
                    team1.add(new Warlock(team1, getName()), 1, i);
                    break;
                case 4:
                    team1.add(new Peasant(team1, getName()), 1, i);
                    break;    
            }
        }

        ArrayList <Unit> team2 = new ArrayList<>();
        for (int i  = 1; i < 11; i++) {
            switch (new Random().nextInt(5)){
                case 0:
                    team2.add(new Spearman(team2, getName()), 10, i);
                    break;
                case 1:
                    team2.add(new Crossbowman(team2, getName()), 10, i);
                    break;
                case 2:
                    team2.add(new Thief(team2, getName()), 10, i);
                    break;
                case 3:
                    team2.add(new Warlock(team2, getName()), 10, i);
                    break; 
                case 4:
                    team2.add(new Peasant(team2, getName()), 10, i);
                    break;  
            }
        }
        System.out.println("Team 1: ");
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("Team 2: ");
        team2.forEach(n -> System.out.println(n.getInfo()));
        team1.forEach(n-> n.step());

        System.out.println("Team 1 step: ");
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("Team 2 step: ");
        team2.forEach(n -> System.out.println(n.getInfo()));
        team2.sort(Unit::compareTo);
        System.out.println(team2);
    }

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}
