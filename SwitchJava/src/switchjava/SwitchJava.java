/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchjava;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class SwitchJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o número de pernas do animal: ");
        int pernas = teclado.nextInt();
        String tipo;
        
        switch (pernas){
        case 1 :
            tipo = "Saci";
            break;
        case 2 :
            tipo = "Bípede";
            break;
        case 3 :
            tipo = "Tripé";
            break;
        case 4 :
            tipo = "Quadrúpede";
            break;
        case 6:
            tipo = "Inseto;";
            break;
        case 8 :
            tipo = "Aracnídeo ou crustáceo";
            break;
        default :
            tipo = "ET";
            break;
    }
        System.out.format("\nO tipo do ser é um(a): %s\n", tipo);
    }
    
}
