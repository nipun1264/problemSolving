/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdigit;

/**
 *      861568688536788 100000
 * @author User
 */
public class SuperDigit {

public int superDigit(String n, int k){
    String m=n;

    for(int i=0;i<k;i++){
        m=m+n;
    }
     char[] c=m.toCharArray();
     int sum=0;
    


while(c.length>1){
    sum = 0;
    for(int i=0;i<c.length;i++){
       
        sum=sum+Integer.parseInt(String. valueOf(c[i]));
    }
    c=Integer.toString(sum).toCharArray();
}


sum=Integer.parseInt(String. valueOf(c[0]));
return sum;
}
    
}
