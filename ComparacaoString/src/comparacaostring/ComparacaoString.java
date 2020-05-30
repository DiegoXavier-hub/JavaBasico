/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author diego
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Diego";
        String nome2 = (String) "Diego";
        String res;
        
        res = (nome1.equals(nome2))?"Igual":"Diferente";
        System.out.println(res);
        
    }
    
}
