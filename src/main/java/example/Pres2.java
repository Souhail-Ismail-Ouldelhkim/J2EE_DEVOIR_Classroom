package example;
import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        // Instanciation Dynamique
        Scanner scanner = new Scanner(new File("config.txt"));


        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName); // Charger La classe en mémoir
        IDao dao=(IDao) cDao.newInstance();
       // System.out.println(dao.getdata());


        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

        //set d'une maniére dynamique

        Method method=cMetier.getMethod("setDao", IDao.class);
        //metier.setDao(dao)
        method.invoke(metier,dao);

        System.out.println("Résultat=>" +metier.calcul());
    }
}
