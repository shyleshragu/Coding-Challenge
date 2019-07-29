package ca.jrvs.apps;

import java.util.HashSet;
import java.util.Set;

/**
 * Count the number of prime numbers less than a non-negative number
 */
public class CountPrimes {
    public static void main(String[] args) {
        countPrime(10);
    }
    public static void countPrime(int n){
        Set<Integer> primefactors = new HashSet<>();
        long copyOfInput = n;
        int prime = 0;
        for (int i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                primefactors.add(i);
                // prime factor
                copyOfInput /= i;
                i--;
                prime++;
            }
        }
        System.out.println("# of primes: "+prime);
    }
}
