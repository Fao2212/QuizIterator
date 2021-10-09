package model;

import java.util.HashMap;

import IterationAlgorithms.Diagonal;
import IteratorPattern.Iterator;

public class FactoryIterator {

    static HashMap<EnumAlgoritmo,Iterator<Integer>> iterators;

    public static void initFactory(){
        //Todo:Agregar todos los iterators
        //iterators.put(EnumAlgoritmo.UNACOLUMNA,new UnaColumna());
    }

    public static Iterator<Integer> get(Estructura estructura,EnumAlgoritmo tipo){
        switch(tipo){
            case DIAGONAL:
                return new Diagonal(estructura);
            case COLUMNASIMPARES:
            case COLUMNASPARES:
            case COLUMNASPORFILAS:
            case DIAGONALINVERTIDA:
            case FILASIMPARES:
            case FILASPARES:
            case FILASPORCOLUMNAS:
            case UNACOLUMNA:
                //return new UnaColumna(estructura,0);
            case UNAFILA:
                //return new UnaFila(estructura,0);
        }
        return null;
    } 
    public static Iterator<Integer> get(Estructura estructura,EnumAlgoritmo tipo,int number){
        switch(tipo){
            case UNACOLUMNA:
                //return new UnaColumna(estructura,number);
            case UNAFILA:
                //return new UnaFila(estructura,number);
            default:
                return get(estructura,tipo);
        }
    } 
}
