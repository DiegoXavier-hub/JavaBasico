package tiposprimitivos;

public class TiposPrimitivos {

    public static void main(String[] args) {

        float nota = 8.5f;
        float nota1 = (float) 8.6;
        Float nota2 = new Float(8.7);
        
        String nome = "Diego";
        String nome1 = (String) "Gustavo";
        String nome2 = "João";
        
        System.out.printf("A nota do %s é: %.2f \n", nome, nota);
    }
    
}
