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

public class problem3 {

    public static int arraySum(int[] values, int index) {
        if (index < values.length) {
            return values[index] + arraySum(values, index + 1);
        } else {
            return 0;
        }
    }

    public static int findMaximum(int[] values, int index) {
        if (index == values.length - 1) {
            return values[index];
        } else {
            int max = findMaximum(values, index + 1);

            if (values[index] > max) {
                return values[index];
            } else {
                return max;
            }
        }
    }

    public static int countEven(int[] values, int index) {
        if (index < values.length) {
            if (values[index] % 2 == 0) {
                return 1 + countEven(values, index + 1);
            } else {
                return countEven(values, index + 1);
            }
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        if (size > 0) {

            int[] values = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Enter number: ");
                values[i] = input.nextInt();
            }

            System.out.println("Array Sum: " + arraySum(values, 0));
            System.out.println("Largest Element: " + findMaximum(values, 0));
            System.out.println("Number of Even Elements: " + countEven(values, 0));

        } else {
            System.out.println("Array must contain at least one element.");
        }

        input.close();
    }
}

