/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somajava;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class SomaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite um número: ");
        int n1 = teclado.nextInt();
        
        System.out.println("Digite outro número: ");
        int n2 = teclado.nextInt();
        
        int soma = n1 + n2;
        
        System.out.format("A soma é: %d\n", soma);
    }
    
}
