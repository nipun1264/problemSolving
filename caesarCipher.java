/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankproblems;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class caesarCipher {
    public static String caesarCipher(String s, int k) {
        String code = ""; //create new string for return value
        //check if k swift more than whole set of alphabets if yes use modulus to simplify it
        if(k>=26){
            k = k%26;
        }
        
        //use for loop to go through every char in String s
        for(int i=0; i<s.length(); i++){
            char abc = s.charAt(i);     //locate the char in string s and declare it as abc
            int num = abc;  //convert char abc into ascii decimal number
            int extra = 0;
            
            if(abc>64 && abc<91){   //check if the char is uppercase
                if(num + k > 90){   //check if it was out of alphabet range after swifting
                    extra = num + k - 90;   //calculate the extra swift moves, 90 is the last alphabet Z
                    num = 64 + extra;   //add up and start from first alphabet (64+1=65 which is A)
                    code += (char)(num);    //add the char into string
                }
                else{
                    code += (char)(num + k);    //add the char if it is within alphabet range
                }
                
            }
            else if(abc>96 && abc<123){   //check if the char is lowercase
                if(num + k >122){
                    extra = num + k - 122;
                    num = 96 + extra;   //add up and start from first alphabet (96+1=97 which is a)
                    code += (char)(num);
                }
                else{
                    code += (char)(num + k);
                }
            }
            else{   //add everything other than alphabet (in real world might cause some injection problem)
                code += (char)(num);
            }
        }
        //return as string
        return code;
    }
}