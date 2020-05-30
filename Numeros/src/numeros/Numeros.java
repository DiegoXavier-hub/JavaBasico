/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num,s = 0;
        String resp;
        do{
            System.out.print("Digite um número: ");
            num = teclado.nextInt();
            s += num;
            System.out.println("Quer Continuar? [S ou N]");
            resp = teclado.next();
        } while(resp.equals("S"));
        System.out.println("A soma de todos os valores é: " + s);
    }
    
}
