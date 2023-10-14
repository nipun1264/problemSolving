/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankproblems;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Arraylist {

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
    for (int i=0; i < n; i++)
    {
        int d = sc.nextInt();
        ArrayList<Integer> line = new ArrayList<>();
        for (int j=0; j < d; j++)
        {
            line.add(sc.nextInt());
        }
        lines.add(line);
    }
    int q = sc.nextInt();
   for(int i=0;i<q;i++)
    {
        int x=Integer.parseInt(sc.next());
        int y=Integer.parseInt(sc.next());
        try{
            System.out.println(lines.get(x-1).get(y-1));
        }
        catch(Exception e)
        {
            System.out.println("ERROR!");
        }
    }
}
}
