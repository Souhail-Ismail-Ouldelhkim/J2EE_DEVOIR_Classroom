package ext;

import dao.IDao;

public class DaoImplVWS implements IDao {

    @Override
    public double getdata() {
        System.out.println("Version web service");
        return 90;
    }
}
// ici Nous avons appliquer le principe d'une application ouverte à l'extension et fermer à la Modification
// sans utiliser le freamwork spring boat grace à ce freamwork nous avons gagner beaucoup du temps
// lorsqu'il s'agit d'énormement de classe nous avons fait l'injection des dépandances d'une façon dynamique
