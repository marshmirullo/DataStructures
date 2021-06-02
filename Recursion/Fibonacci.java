/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter an index for the fibonacci number : ");
        int index = sc.nextInt();
        
        System.out.println("The fibonacci number at index " + index + " is " + fib(index));
    }
    
    public static long fib(long index){
        if(index == 0){ // Base Case
            return index;
        }
        else if(index == 1){ //Base case
            return 1;
        }
        else //Reduction and recursive calss
            return fib(index-1) + fib(index-2);
    }
}
