package presentaion;
import dao.DaoImpl;
import ext.DaoImplV2;
import metier.MetierImpl;
public class PresentationV1 {
    public static void main(String[] args) {
        /*
        Injection des dependances
         */
        DaoImpl d =new DaoImpl();
        MetierImpl metier = new MetierImpl();//Injection de la dependance via le constructeur
        metier.setDao(d);//Injection via le setter
        System.out.println(metier.calcul());
    }
}
