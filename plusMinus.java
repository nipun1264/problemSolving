/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class plusMinus {
    public static void plusMinus(List<Integer> arr) {
    float length=arr.size();
    float plus=0;
    float minus=0;
    float zero=0;
    
    for(int i=0;i<length;i++){
        if(arr.get(i) == 0){
            zero++;
        }
        else if(arr.get(i) > 0){
            plus++;
        }
        else {
            minus++;
        }
    }
    
    System.out.printf("%.6f", (plus/length));
    System.out.println();
    System.out.printf("%.6f", (minus/length));
    System.out.println();
    
    System.out.printf("%.6f", (zero/length));

    }
    
    
    
  
}


