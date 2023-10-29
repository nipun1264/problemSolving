/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankproblems;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class countingSort {
    
    public static List<Integer> countingSort(List<Integer> arr) {
        int x=0;
        int y=0;
    // Write your code here
    List<Integer> count = new ArrayList<Integer>();
    for(int i=0;i<100;i++){
        count.add(0);
        
    }
    System.out.println(count);
    for(int i=0;i<arr.size();i++){
        x=arr.get(i);
        
        y=count.get(x);
        y++;
      
        count.set(x, y);
        
    }
    
for(int i=0;i<count.size();i++){
        System.out.print(count.get(i)+" ");
        
    }
    return count;
    }
    
}
