/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.*;

public class Mapantas_TLA4 {

    public static void main(String[] args) {
        
        Stack<String> actions = new Stack<>();
        Scanner s = new Scanner(System.in);
        boolean run = true;
        System.out.println("Enter an action (tyoe 'u' to undo and 'q' to quit)");
        
        while (run) {
            System.out.print("action : ");
            String action = s.nextLine().trim();
            
            if (action.equalsIgnoreCase("q")) {
                System.out.println("Exiting program...");
                run = false;
            } else if (action.equalsIgnoreCase("u")) {
                
                if (actions.isEmpty()) {
                    System.out.println("There is no action in the stack");
                } else {
                    String undoAction = actions.pop();
                    System.out.println("You undid " + undoAction);
                }
                
                
            } else {
                actions.push(action);
                System.out.println("You " + action);
            }
            
        }
        
    }
    
}
