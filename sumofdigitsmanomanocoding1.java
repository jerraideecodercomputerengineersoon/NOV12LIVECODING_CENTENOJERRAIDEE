/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaRecursion;

import java.util.Scanner;

/**
 *
 * @author CENTENO_CPE113
 */
public class sumofdigitsmanomanocoding1 {
    public static int sumsamgadigits(int number) {
        
        
        if  (number ==0){
            return 0;
            }
        
        return(number % 10)+sumsamgadigits(number/10);
    }

public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("");
            int number=  input.nextInt();
            
            int result= sumsamgadigits(number);
            
            System.out.println(result);
        }
        
    }



}


