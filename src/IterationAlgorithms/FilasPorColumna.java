package IterationAlgorithms;

import model.Estructura;
import model.EstructuraIterator;

public class FilasPorColumna extends EstructuraIterator {

    protected FilasPorColumna(Estructura estructura) {
        super(estructura);
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
