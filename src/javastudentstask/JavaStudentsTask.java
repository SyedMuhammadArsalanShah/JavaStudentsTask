/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastudentstask;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class JavaStudentsTask {

    /**
     * @param args the command line arguments
     */
    static boolean isPalindrome(String str) {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 1, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }
// factorial Program with iteration 

    static int factorial(int n) {
        int fact = 1, i;
        for (i = 2; i <= n; i++) {
            fact = fact * i;// fact *= i;
        }
        return fact;
    }
// factorial Program with recursion

    static int factorialrecursive(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // TODO code application logic here

        boolean Prime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");

        int num = scan.nextInt();
        System.out.println("****** Prime Number Program ******");
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                Prime = false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if (Prime) {
            System.out.println(num + " is  a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }

        System.out.println("****** Factorial Program ******\nFactorial of " + num
                + " is " + factorial(num));
        System.out.println("Factorial of " + num
                + " is " + factorialrecursive(num));
        System.out.println("****** Palindrome Program ******");
        scan.nextLine();//for line breaking
        System.out.println("Enter String ");
        String str = scan.nextLine();
        // scan.nextLine();
        if (isPalindrome(str)) {
            System.out.println("it is Palindrome : " + str);
        } else {
            System.out.println("it is not Palindrome : " + str);
        }
        System.out.println("****** String Reverse Program ****** \nString Buffer Class ");
        StringBuffer sbr = new StringBuffer(str);
        // To reverse the string
        sbr.reverse();
        System.out.println("Reverse of " + str + " is: " + sbr);

        System.out.println("Without String Buffer Method ");

        String reverse = "";
        for (int j = str.length() - 1; j >= 0; j--) {
            reverse = reverse + str.charAt(j);
        }
        System.out.println("Reverse of " + str + " is: " + reverse);
    }

}
//run:
//Enter any number:
//5
//****** Prime Number Program ******
//5 is  a Prime Number
//****** Factorial Program ******
//Factorial of 5 is 120
//Factorial of 5 is 120
//****** Palindrome Program ******
//Enter String 
//aamna
//it is not Palindrome : aamna
//****** String Reverse Program ****** 
//String Buffer Class 
//Reverse of aamna is: anmaa
//Without String Buffer Method 
//Reverse of aamna is: anmaa
//BUILD SUCCESSFUL (total time: 17 seconds)
