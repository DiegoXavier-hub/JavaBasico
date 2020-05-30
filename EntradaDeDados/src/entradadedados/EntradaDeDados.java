package entradadedados;

import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o Nome do Aluno: ");
        String nome = teclado.nextLine();
        
        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        
        System.out.format("A nota do aluno %s é: %.2f\n", nome, nota);
    }
    
}
