/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tower_breakers;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tower_Breakers {

    /**
     * @param args the command line arguments
     */
    public static int towerBreakers(int n, int m) {
    // Write your code here
            if(n%2==0||m==1){
                System.out.println("2");
            }
            else{
                System.out.println("1");
            }
    return 0;
            }
    
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int loop =s.nextInt();
        
        for(int i=0;i<loop;i++){
            int n=s.nextInt();
            int m=s.nextInt();
            Tower_Breakers.towerBreakers(n, m);
        }
    }
    
}
