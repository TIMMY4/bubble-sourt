/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;
import java.util.*;
/**
 *
 * @author Ryan.Wanner
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random rand= new Random();
       List<Integer> randomList= new ArrayList();
       List<Integer> sortList= new ArrayList();
       int end=0;
       int first=0;
       for(int i =0; i<10; i++){
           randomList.add(rand.nextInt(51));
          // System.out.println(randomList.get(i));
       }
      do{
          for(int i=0;i<randomList.size()-1; i++){
              if(randomList.get(i)<randomList.get(i+1)){
                first= randomList.set(i, randomList.get(i+1));
                randomList.set(i+1, first);
                  
              }
              System.out.println(randomList.get(i));
              
          }
          
      }while(end==randomList.size());
               
    }
    
}
