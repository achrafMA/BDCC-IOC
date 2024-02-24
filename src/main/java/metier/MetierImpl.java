package metier;

import dao.DaoImpl;
import dao.IDao;

public class MetierImpl implements IMetier {
    //Couplage faible
    private IDao dao;

    public MetierImpl(DaoImpl d) {

    }


    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t*23;
        return res;
    }

    public MetierImpl() {
    }

    /*Pour injecter dans la variable dao un objet
     * d'une class qui impliment l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
