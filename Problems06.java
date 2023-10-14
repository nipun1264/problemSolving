/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankproblems;

import java.io.*;
import java.util.*;

public class Problems06 {

   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    if(s.trim().isEmpty()) {
        System.out.println(0);
    }
    else {
        System.out.println(s.trim().split("[!,?. @_']+").length);
        for(String a : s.trim().split("[!,?. @_']+")){
            System.out.println(a);
            }
        }
    scan.close();
    }
}