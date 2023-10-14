/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankproblems;
import java.util.*;
import java.io.*;
public class Problem01 {
     public static void main(String []argh)
    {

          byte b=Byte.MAX_VALUE;
          byte b2=Byte.MIN_VALUE;
            short s=Short.MAX_VALUE;
            short s2=Short.MIN_VALUE;
           
            int in=Integer.MAX_VALUE;
            int in2=Integer.MIN_VALUE;
            long l=Long.MAX_VALUE;
            long l2=Long.MIN_VALUE;
            String object=" ";
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
           
                
            sc.nextLine();
            
            try
            {
                long x=sc.nextLong();
               
                System.out.println(x+" can be fitted in:");
                  if(x>=b2 && x<=b)
                    System.out.println("* byte");
                
                if( x>=s2 && x<=s)
                    System.out.println("* short");
                
                   if(x>=in2 && x<=in)
                    System.out.println("* int");
                    
                     
                    System.out.println("* long");
                      
                    
                       
                   
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            
            }
            
            
          
            

        }
    }
    
}
