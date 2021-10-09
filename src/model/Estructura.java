package model;

import IteratorPattern.IAgreggate;
import IteratorPattern.Iterator;


public class Estructura implements IAgreggate{

    int[][] matriz;

    public Estructura(int largo,int ancho){
        matriz = new int[largo][ancho];
        initMatriz();
    }

    public void initMatriz(){
        for (int i = 0;i<matriz.length;i++) {
            for(int j = 0;j<matriz[i].length;j++){
                System.out.print(j);
                matriz[i][j] = j;
            }
            System.out.println();
        }
    }

    public int getPos(int x,int y){
        return matriz[x][y];
    }

    @Override
    public Iterator getIterator(EnumAlgoritmo tipo) {
        return FactoryIterator.get(this,tipo);
    }
    @Override
    public Iterator getIterator(EnumAlgoritmo tipo,int number) {
        return FactoryIterator.get(this,tipo,number);
    }

    public int sumatoria(EnumAlgoritmo tipo) {
        Iterator<Integer> iterator = getIterator(tipo);
        return sumatoria(iterator);
    }

    public int sumatoria(EnumAlgoritmo tipo,int numero){
        Iterator<Integer> iterator = getIterator(tipo,numero);
        return sumatoria(iterator);
    }

    private int sumatoria(Iterator<Integer> iterator){
        int sumatoria = 0;
        while (iterator.hasNext()){
            sumatoria += iterator.next();
        }
        System.out.println("Result Sum:"+sumatoria);
        return sumatoria;
    }

    //Retorna  el largo de las columnas
    public int getMaxX() {
        return matriz.length;
    }

    //Retorna el largo de las filas
    public int getMaxY() {
        return matriz[0].length;
    }
}
