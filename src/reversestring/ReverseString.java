/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

import java.util.Scanner;

/**
 *
 * @author bogensberger
 */
public class ReverseString {

    
    // reverse string method - take a string input and reverse it.
    public static String reverseString(String str) {
        String reverse = "";
        for (int i=str.length()-1; i>=0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter string you would like to reverse:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(reverseString(name));
        
    }
    
   
}
