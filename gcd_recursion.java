/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaRecursion;

/**
 *
 * @author CENTENO_CPE113
 */

import java.util.Scanner;

public class gcd_recursion {

    public static int gcd(int a, int b) {
        if (b > 0) {
            return gcd(b, a % b);
        } else {
            return a;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.out.println("Negative numbers are not allowed.");
        } else if (num1 == 0 && num2 == 0) {
            System.out.println("GCD is undefined.");
        } else {
            int result = gcd(num1, num2);

            System.out.println("Greatest Common Divisor: " + result);
        }

        input.close();
    }
}

