/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Digite o Nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Digite o Ano de Nascimento: ");
        int nasc = teclado.nextInt();
        
        System.out.print("Digite o Ano Atual: ");
        int aa = teclado.nextInt();
        
        int idade = aa-nasc;
        
        System.out.format("\nA idade de %s é %d!!\n",nome, idade);
        
        if (aa-nasc>=18){
            System.out.format("%s é maior de Idade!!\n", nome);
        }else{
            System.out.format("%s é menor de Idade!!\n", nome);
        }
    }
    
}
