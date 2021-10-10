import model.EnumAlgoritmo;
import model.Estructura;
import model.FactoryIterator;

public class Main {
    public static void main(String[] args) {
        FactoryIterator.initFactory();
        Estructura e = new Estructura(5,5);
//        e.sumatoria(EnumAlgoritmo.DIAGONAL);
        //e.sumatoria(EnumAlgoritmo.UNACOLUMNA,4);
//        e.sumatoria(EnumAlgoritmo.FILASIMPARES);
        e.sumatoria(EnumAlgoritmo.COLUMNASPARES);
    }
}
