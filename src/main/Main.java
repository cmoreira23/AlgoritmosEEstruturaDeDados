package main;

import algoritmos.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int quantity = 10;
        SortHelper helper = new InsertionHelper(quantity);
        // SortHelper helper = new QuickSortHelper(quantity, 0, quantity - 1);
        helper.debugArray();
        helper.sort();
        helper.debugArray();
    }
}