package IterationAlgorithms;

import model.Estructura;
import model.EstructuraIterator;

public class UnaColumna extends EstructuraIterator {
    public int columna;
    public UnaColumna(Estructura estructura, int columna){
        super(estructura);
        this.columna = columna;
        System.out.println("Suma de una columna\n");
    }

    @Override
    public Object next() {

        // CREO QUE ESTÁN INVERTIDAS LAS X Y LAS Y.
        int pos = estructura.getPos(y, columna);
        System.out.println("X:"+x+" Y: "+y+" Pos: "+ pos);
        y++;
        return pos;
    }

    @Override
    public boolean hasNext() {
        return y < estructura.getMaxY();
    }
}
