/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author diego
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3,4,8,2};
        int p = Arrays.binarySearch(vet, 8);
        System.out.format("Encontrei o valor 8 na posição %d\n", p);
        
    }
    
}
