package example;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Main {
    public static void main(String[] args) {
        /*
 Injection des dépandances par une instanciation statiques => new et (new == couplage Fort) Mauvaise habitude
         */
        // Instanciation Statique
        DaoImpl2 dao=new DaoImpl2();
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Resultat = " + metier.calcul());
    }
}