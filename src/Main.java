import model.EnumAlgoritmo;
import model.Estructura;
import model.FactoryIterator;

public class Main {
    public static void main(String[] args) {
        FactoryIterator.initFactory();
        Estructura e = new Estructura(6,6);
//        e.sumatoria(EnumAlgoritmo.DIAGONAL);
        //e.sumatoria(EnumAlgoritmo.UNACOLUMNA,4);
//        e.sumatoria(EnumAlgoritmo.FILASIMPARES);
//        e.sumatoria(EnumAlgoritmo.COLUMNASPARES);
//        e.sumatoria(EnumAlgoritmo.UNACOLUMNA, 2);
        e.sumatoria(EnumAlgoritmo.FILASPARES);
//        System.out.println("\n\n");
//        System.out.println((0%2));
//        for (int x = 0; x<e.getMaxX(); x++){
//            for (int y = 0; y<e.getMaxY(); y++){
//                System.out.println(x + " "+ y);
//                System.out.println(e.getPos(x, y));
//            }
//        }
    }
}
