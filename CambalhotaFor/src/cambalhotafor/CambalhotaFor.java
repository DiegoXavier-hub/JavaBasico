/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambalhotafor;

/**
 *
 * @author diego
 */
public class CambalhotaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int aa=1; aa<=5; aa++){
            for (int cc=1; cc<=5; cc++){
                System.out.format("%dº-Cambalhota\n", cc);
            }
            System.out.println(aa+"º");
        }
    }
    
}
