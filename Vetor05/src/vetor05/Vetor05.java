/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor05;

import java.util.Arrays;

/**
 *
 * @author diego
 */
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = new int[20];
        Arrays.fill(vet, 8);
        for (int valor: vet){
            System.out.println(valor);
        }
    }
    
}
