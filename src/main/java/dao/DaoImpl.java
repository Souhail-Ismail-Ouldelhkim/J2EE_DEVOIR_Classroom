package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getdata() {
        /*
        Se connecter à la BD pour récupérer la température
        */
        System.out.println("version Base De Données");
        double temp=Math.random()*40;
        return temp;
    }
}
