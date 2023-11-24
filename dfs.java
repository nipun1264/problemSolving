/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankproblems;
import java.util.*;
/**
 *
 * @author User
 */
public class dfs {
    
    //graph creation
   
   ArrayList<Integer>[] master;
    boolean[] visited;
    int totalNode;
    int totalEdge;
    
    
    dfs(int noOfNode , int edge){
        visited=new boolean[noOfNode];
        master=new ArrayList[noOfNode];
        
        for(int i=0;i<noOfNode;i++){
            master[i]=new ArrayList<Integer>();
        }
     
        
        totalNode=noOfNode;
        totalEdge=edge;
        
    }
        
        public void makeEdge(int src, int dest){
       
            System.out.println("Connecting "+src+" with Dest" + dest);
            
            master[src].add(dest);
            master[dest].add(src);
     
      
        
            
        }
    
        public void status(){
            for(int i=0;i<totalNode;i++){
                System.out.print(i+" -- >");
                for(int j=0;j<master[i].size();j++){
                    System.out.print(master[i].get(j) + " , ");
                }
                System.out.println();
        }
 
        }
    
    public static void main(String[] args){
        dfs d=new dfs(9,9);
        
        
        d.makeEdge(0, 1);
        d.makeEdge(0, 7);
        d.makeEdge(1,2);
        d.makeEdge(2, 3);
        d.makeEdge(3, 4);
        d.makeEdge(3, 5);
        d.makeEdge(3, 6);
        d.makeEdge(6, 7);
        d.makeEdge(6, 8);
        d.makeEdge(7, 0);
        
      
        
        
        d.status();
        
        
      
    }
    
}
