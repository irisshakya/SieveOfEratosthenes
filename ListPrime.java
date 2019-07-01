/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listprime;
import java.util.Scanner;

/**
 *
 * @author junk
 */
public class ListPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //variable initialisation for user input
        int n;
                      
        //taking in the user input
        System.out.println("Enter the ending number: ");
        n = kb.nextInt();
        
        SieveOfEratosthenes g = new SieveOfEratosthenes();
        
        System.out.println("The prime numbers less than " + 
                n + " are ");
        g.sieveOfEratosthenes(n);
         }
}


