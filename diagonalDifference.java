/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankproblems;

import java.util.List;

/**
 *
 * @author User
 */
public class diagonalDifference {
    public static int diagonalDifference(int[][] arr) {
    int x=0;
    int y=0;
    int left=0;
    int right=0;
    int p=0;
    
    for(int i=0;i<arr.length;i++){
        left=left+arr[i][i];
    }
    for(int i=arr.length-1;i>=0;i--){
        right=right+arr[p][i];
        p++;
       
    }
    int result=left-right;
    
    System.out.println(Math.abs(result));

    return 0;
    }
}
