package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import algoritmos.HeapSortHelper;
import algoritmos.SortHelper;

public class Main {

    public static void main(String[] args) throws Exception {
        
        String filePath = new File("").getAbsolutePath()+"/src/data/saidaAleatoria.txt";
        // String filePath = new File("").getAbsolutePath()+"/src/data/saidaInvertida.txt";
        // String filePath = new File("").getAbsolutePath()+"/src/data/saidaOrdenada.txt";

        BufferedReader csvReader = new BufferedReader(new FileReader(filePath));
        String row;
        int quantity = 500;
        int line = 0;
        int[] array = new int[quantity];        
        while ((row = csvReader.readLine()) != null && line < quantity) {
          String[] data = row.split(",");
          array[line++] = Integer.parseInt(data[0]);
        }
        csvReader.close();
        
        // SortHelper helper = new InsertionHelper(quantity);
        // SortHelper helper = new SelectionSortHelper(quantity);
        // SortHelper helper = new QuickSortHelper(quantity, 0, quantity - 1);
        // SortHelper helper = new ShellSortHelper(quantity);
       
        SortHelper helper = new HeapSortHelper(quantity);
        helper.setArray(array);
        helper.sort();
    }
}