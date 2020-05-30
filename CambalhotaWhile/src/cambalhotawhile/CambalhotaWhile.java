/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambalhotawhile;

/**
 *
 * @author diego
 */
public class CambalhotaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c = 0;
        
        while (c<10){
            c++;
            /*if(c == 5){
                continue;
                //break;
            }else if(c == 7){
                break;
            }*/
            System.out.format("%dº-Cambalhota\n", c);
            
        }
    }
    
}
