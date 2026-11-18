/*Author: Margarita Mercado 
 * Date: October 14, 2026 (re-submission November 3,2026)
 * Course: 1250C Programming 1 T/TH 11:00-12:15
 * 
 * Assignment 3
 * This program is for keeping track of shopping for ingredients, creating a loop until user exits.
 * 
 */

package bcbagels;

import java.util.Scanner;

public class bcbagels {
	
    public static void main(String[] args) {
   
    	Scanner keyboard = new Scanner(System.in);
        
        // Track quantities for each item
        int bagelCount = 0;
        int butterCount = 0;
        int creamCheeseCount = 0;
        int eggsCount = 0;
        int baconCount = 0;
        
        int choice = 0;
        
        // Continue loop until user chooses Exit (#6)
        while (choice != 6) {
            System.out.println("Please choose an item from the menu below:");
            System.out.println("1) Bagel \t $1.00");
            System.out.println("2) Butter \t $0.50");
            System.out.println("3) Cream Cheese \t $1.00");
            System.out.println("4) Eggs \t $2.75");
            System.out.println("5) Bacon \t $2.25");
            System.out.println("6) Exit");
            System.out.print("Enter your choice here: ");
            
            choice = keyboard.nextInt();
            
            if (choice == 1) {
                bagelCount++;
            } else if (choice == 2) {
                butterCount++;
            } else if (choice == 3) {
                creamCheeseCount++;
            } else if (choice == 4) {
                eggsCount++;
            } else if (choice == 5) {
                baconCount++;
            } else if (choice == 6) {
            	break;
            } else {  // Exit condition handled by loop check
           
                System.out.println("Invalid. You must choose 1-6 from the menu.");
            }
        }
        
        // Calculate sub totals
        double bagelSub = bagelCount * 1.00;
        double butterSub = butterCount * 0.50;
        double creamCheeseSub = creamCheeseCount * 1.00;
        double eggsSub = eggsCount * 2.75;
        double baconSub = baconCount * 2.25;
        
        double subtotal = bagelSub + butterSub + creamCheeseSub + eggsSub + baconSub;
        double tax = subtotal * 0.07;
        double total = subtotal + tax;
        
        // Display final bill header
        
        System.out.println("\nItem \t\t Quantity \t Subtotal");
        System.out.println("-------------------------------------------------");
        
        // Display items ordered 
        if (bagelCount > 0) {
            System.out.printf("%-17s%-15d  $%.2f%n", "Bagel", bagelCount, bagelSub);
        }
        if (butterCount > 0) {
            System.out.printf("%-17s%-15d  $%.2f%n","Butter",butterCount,butterSub);
        }
        if (creamCheeseCount > 0) {
            System.out.printf("%-17s%-15d  $%.2f%n","Cream Cheese",creamCheeseCount,creamCheeseSub);
        }
        if (eggsCount > 0) {
            System.out.printf("%-17s%-15d  $%.2f%n","Eggs",eggsCount,eggsSub);
        }
        if (baconCount > 0) {
            System.out.printf("%-17s%-15d  $%.2f%n","Bacon",baconCount,baconSub);
        }
        
       

        // Display financial totals
        System.out.printf("             %-20s $%.2f%n", "Subtotal:", subtotal);
        System.out.printf("             %-20s $%.2f%n", "Tax:", tax);
        System.out.printf("             %-20s $%.2f%n", "Total:", total);
        keyboard.close();
    }
 {
	
 
 }

}
