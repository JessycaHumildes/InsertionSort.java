/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author Jessyca Humildes
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        
        for(int firstUnsortedIndex = 1; firstUnsortedIndex <intArray.length;
                firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            
            int i;
            
            //looking for the correct position to insert elements
            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--){
                intArray[i] = intArray[i - 1];
            }
            
            //shifting
            intArray[i] = newElement;
        }
        
        
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    
}
