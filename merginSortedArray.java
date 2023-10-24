/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
public class merginSortedArray {
    public static void main(String[] args){
        List<Integer> arr1 = new ArrayList<Integer>();
        List<Integer> arr2 = new ArrayList<Integer>();
        List<Integer> sortedArr = new ArrayList<Integer>();
        
        arr1.add(1);
        arr1.add(3);
        arr1.add(5);
        arr1.add(6);
        arr1.add(7);
        
        arr2.add(2);
        arr2.add(4);
        arr2.add(6);
        arr2.add(8);
        arr2.add(10);
        
        
        int x=0;
        int y=0;
        int total=arr1.size()+arr2.size();
        int min;
        
        for(int i=0;i<total;i++){
           if((arr1.get(x)<arr2.get(y)) && (arr1.size()-1)>=x ){
               System.out.println(x+" "+arr1);
               sortedArr.add(arr1.get(x));
               if((arr1.size())-1>x){
               x++;
               }
               else{
                   arr1.add(100000000);
                   x++;
               }
              
           }
           else if((arr1.get(x)>=arr2.get(y))){
               sortedArr.add(arr2.get(y));
               if((arr2.size()-1)>y){
               y++;
               }
               else{
                   arr2.add(100000000);
                   y++;
               }
           }
        }
        
        
        System.out.print(sortedArr);
    }
}
