/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centerallignednumbers;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CenterAllignedNumbers {

    /**
     * @param args the command line arguments
     */
    public static  void printPascalsTriangle(int n) {
        // Loop for each row
        for (int row = 1; row <= n; row++) {
            // Print leading spaces for formatting
            for (int j = 0; j <= n - row; j++) {
                System.out.print(" ");
            }
 
            int C = 1; // Initialize C (combination) value for the first element in the row
            // Loop to calculate and print values in the current row
            for (int i = 1; i <= row; i++) {
                System.out.print(C + " "); // Print the current value
                C = C * (row - i) / i; // Calculate the next value using the formula
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
 
    // Main method
    public static void main(String[] args)
    {
        int n = 5;
        printPascalsTriangle(n); // Call the method to print Pascal's Triangle
    }
}