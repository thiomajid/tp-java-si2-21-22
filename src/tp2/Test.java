package tp2;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Adresse a1 = new Adresse("Monastir", 5000);

        Personne p1 = new Personne("01111111", "Kbayer", "Jasser", "Jendouba", 8160);
        Personne p2 = new Personne("02222222", "Smida ", "Ghayth", a1);
        Personne p3 = new Personne("01111111", "Smida", "Jasser", a1);
        Personne p4 = new Personne("02222222", "Kbayer", "Ghayth", "Jendouba", 8160);
        Personne p5 = new Personne("01111111", "Kbayer", "Jesser", a1);
        Personne p6 = new Personne("02222222", "Smida ", "Ghayth", "Jendouba", 8160);

        ArrayList<Personne> myList = new ArrayList<Personne>(Arrays.asList(p1, p2, p3, p4, p5, p6));


        for (Personne someone : myList)
            System.out.println(someone.toString());
    }
}

