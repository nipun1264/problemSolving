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
public class Result {
    public static List<String> twins(List<String> a, List<String> b) {
        List<String> result=new ArrayList<String>();
        int flag=0;
        char temp;
        
        for(int x=0;x<a.size();x++){
        char[] aa =a.get(x).toCharArray();
        char[] ba =b.get(x).toCharArray();
        if(aa.length==ba.length){
            for(int i=0;i<aa.length;i++){
                if(aa[i]!=ba[i]){
                    for(int k=i;k<aa.length;k=(k+2)){
                        if(aa[i]==ba[k]){
                           
                            flag=5;
                            temp=ba[i];
                            ba[i]=ba[k];
                            ba[k]=temp;
                            break;
                            
                        }
                        else{
                            flag=1;
                        }
                        break;
                    }
                }
            }
        }
        else{
           flag=1;
        }
        if(flag==1){
            result.add("No");
        }
        else{
            result.add("Yes");
        }
        
        
        
        
        
        }  
        
         
        
        
    return result;
    }
    
}
    

