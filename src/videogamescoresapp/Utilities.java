/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videogamescoresapp;

import java.util.Scanner;

/**
 *
 * @author olcan
 */
public class Utilities {
    public static int getUserChoice(String prompt) {
    int choice = 0;
    System.out.println(prompt);
    Scanner myScanner = new Scanner(System.in);
    choice = myScanner.nextInt();
myScanner.nextLine();
return choice;

}
    
    
    
    
    
    
    }
    

