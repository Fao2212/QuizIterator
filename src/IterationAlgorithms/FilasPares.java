package IterationAlgorithms;

import model.Estructura;
import model.EstructuraIterator;

public class FilasPares extends EstructuraIterator {
    protected FilasPares(Estructura estructura) {
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
