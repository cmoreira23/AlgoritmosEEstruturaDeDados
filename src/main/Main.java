package main;

import java.io.BufferedReader;
import java.io.FileReader;

import algoritmos.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        // String filePath = "/home/zephiros/Projects/AlgoritmosEEstruturaDeDados/src/data/saidaAleatoria.txt";
        String filePath = "/home/zephiros/Projects/AlgoritmosEEstruturaDeDados/src/data/saidaInvertida.txt";
        // String filePath = "/home/zephiros/Projects/AlgoritmosEEstruturaDeDados/src/data/saidaOrdenada.txt";

        BufferedReader csvReader = new BufferedReader(new FileReader(filePath));
        String row;
        int quantity = 10;
        int line = 0;
        int[] array = new int[quantity];        
        while ((row = csvReader.readLine()) != null && line < quantity) {
          String[] data = row.split(",");
          array[line++] = Integer.parseInt(data[0]);
        }
        csvReader.close();
        
        // SortHelper helper = new InsertionHelper(quantity); // Trocas e comparações - OK/OK
        // SortHelper helper = new SelectionSortHelper(quantity); // Trocas e comparações - OK/OK

        // SortHelper helper = new QuickSortHelper(quantity, 0, quantity - 1); // Trocas e comparações - OK
        SortHelper helper = new ShellSortHelper(quantity); // Trocas e comparações - OK
        // SortHelper helper = new HeapSortHelper(quantity); // Trocas e comparações - OK
        helper.setArray(array);
        
        helper.debugArray();
        helper.sort();
        helper.debugArray();
    }
}