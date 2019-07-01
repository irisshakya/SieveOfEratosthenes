/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listprime;

/**
 *
 * @author junk
 */
class SieveOfEratosthenes{
    void sieveOfEratosthenes(int n){
    //create a boolean ARRAY "prime[0..n] and initialise
    //all entries as true. a value in priem[i] will 
    //be false if i is not a not a prime, else true
    boolean prime[] = new boolean[n+1];
    for(int i=0;i<n;i++)
        prime[i] = true;        //all entries initialised as TRUE
    
    for(int p = 2; p*p<=n; p++){
        //if prime[p] is not changed, then it is a prime
        if(prime[p] == true){
            //update all multiples of p
            for(int i = p*p; i<=n; i += p)
            prime[i] = false;
        }
    }
    
    //display all prime numbers
    for(int i = 2;i<=n;i++){
        if(prime[i] == true)
            System.out.println(i + " ");
    }
    }


}
