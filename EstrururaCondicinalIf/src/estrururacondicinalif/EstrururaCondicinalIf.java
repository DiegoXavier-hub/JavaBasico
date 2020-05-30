/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrururacondicinalif;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class EstrururaCondicinalIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Digite a primeira Nota: ");
        float nota = teclado.nextFloat();
        
        System.out.print("Digite a segunda Nota: ");
        float nota1 = teclado.nextFloat();
        
        float media = (float)(nota + nota1)/2;
        
        System.out.println("Sua média foi: " + media);
        
        if (media>=9){
            System.out.println("Parabéns!");
        }else{
            System.out.println("Estude mais!!!");
        }
    }
    
}
