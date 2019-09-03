package main;

public class Main {
    public static void main(String[] args) throws Exception {
        int quantity = 10000;
        
        int[] array = new int[quantity];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.random() * quantity;
        }

        long tempoInicial = System.currentTimeMillis();
        SortHelper.insertionSort(array);
        long tempoFinal = System.currentTimeMillis();
    
        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
    }
}