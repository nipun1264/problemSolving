package hackerrankproblems;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();
        char[] big;
        char[] small;
        int flag = 1;
        int flag2 = 0;

        if (a.length() > b.length()) {
            big = new char[a.length()];
             for(int m=0;m<a.length();m++){
                big[m] = a.charAt(m);
            }
      
            small = new char[b.length()];
             for(int m=0;m<b.length();m++){
                small[m] = b.charAt(m);
            }
            
        } else {
            flag = 2;
            big = new char[b.length()];
            for(int m=0;m<b.length();m++){
                big[m] = b.charAt(m);
            }
            small = new char[a.length()];
            for(int m=0;m<a.length();m++){
                small[m] = a.charAt(m);
            }
            
        }

        System.out.println(a.length() + b.length());


        for (int i = 0; i < small.length; i++) {
           
            if ((int) big[i] < (int) small[i] && flag == 1) {
                System.out.println("No");
          flag2=5;
                break;

            } else if ((int) big[i] > (int) small[i] && flag == 1) {
                System.out.println("Yes");
                  flag2=5;
                break;

            } else if ((int) big[i] < (int) small[i] && flag == 2) {
                System.out.println("Yes");
                flag2=5;
                break;

            } else if ((int) big[i] > (int) small[i] && flag == 2) {
                System.out.println("No");
                flag2=5;
                break;

            }
           
          
        }
         if(flag==2 && flag2 ==0){
                   System.out.println("No");
            }
            else if(flag==1 && flag2 == 0){
                   System.out.println("Yes");
            }
        
        
        
        System.out.print((char) (a.charAt(0) - 32));
        for (int p = 1; p < a.length(); p++) {
            System.out.print((char) a.charAt(p));
        }
        System.out.print(" ");
        System.out.print((char) (b.charAt(0) - 32));
        for (int p = 1; p < b.length(); p++) {
            System.out.print((char) b.charAt(p));
        }
    }
}
