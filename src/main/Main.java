package main;

import algoritmos.InsertionHelper;
import algoritmos.SortHelper;

public class Main {
    public static void main(String[] args) throws Exception {
        
    	int quantity = 5;
        SortHelper helper = new InsertionHelper(quantity);
        helper.sort();

       
    }
}