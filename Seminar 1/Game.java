import Units.*;

public class Game {
    public static void main(String[] args) {
        Sniper neo = new Sniper("Neo");
        System.out.println(neo);
        Crossbowman legolas = new Crossbowman("Legolas");
        System.out.println(legolas);
        Monk shaolin = new Monk("Shao-lin");
        System.out.println(shaolin);
        Peasant mikola = new Peasant("Mikola");
        System.out.println(mikola);
        Spearman gomer = new Spearman("Gomer");
        System.out.println(gomer);
        Thief assasin = new Thief("Assasin");
        System.out.println(assasin);
        Warlock merlin = new Warlock("Merlin");
        System.out.println(merlin);
    }
}
