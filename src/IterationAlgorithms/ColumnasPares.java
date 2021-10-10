package IterationAlgorithms;

import model.Estructura;
import model.EstructuraIterator;

public class ColumnasPares extends EstructuraIterator {
    public ColumnasPares(Estructura estructura){
        super(estructura);
    }

    @Override
    public Object next() {
        if (y % 2 == 0 && x == 0)
            y++;
        // CREO QUE ESTÁN INVERTIDAS LAS X Y LAS Y.
        int pos = estructura.getPos(y, x);
        System.out.println("X:"+x+" Y: "+y+" Pos: "+ pos);
        x++;
        if (x == estructura.getMaxY()){
            x = 0;
            y++;
        }

        return pos;
    }

    @Override
    public boolean hasNext() {
        if(estructura.getMaxY() % 2 == 0)
            return y < estructura.getMaxY() && x < estructura.getMaxX();
        else {
            return y < estructura.getMaxX()-1 && x < estructura.getMaxX();
        }
    }
}
