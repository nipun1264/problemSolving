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
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javax.naming.spi.DirStateFactory.Result;


public class MiniMaxSum {
    static long max;
    static long min;
    
public static void miniMaxSum(List<Integer> arr) {
    Collections.sort(arr);   
    for(int i=0; i<arr.size();i++){
        if(i==0){
            min=min+arr.get(i);
        }
        else if(i==(arr.size()-1)){
            max=max+arr.get(i);
        }
        else{
            min=min+arr.get(i);
             max=max+arr.get(i);
        }
        
    }
    System.out.println(min+" "+max);
    }

 public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

       MiniMaxSum.miniMaxSum(arr);

        bufferedReader.close();
    }

    
    }

