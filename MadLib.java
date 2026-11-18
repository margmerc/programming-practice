/* Author: Margarita Mercado
 * Date: November 12, 2026
 * Description: This program is a mad lib generator. 
 */
package MadLib;

import java.util.Random;
import java.util.Scanner;


public class MadLib {

	
	//main method 
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		//combine user input and a random adult archetype in a single print line
		System.out.println("\n--- Tonight's Happening ---\n" + getName(scanner) + ", a " 
		+ getAge(scanner) + "-year-old " + getRandomArchetype() + " walked into a " + getAdjective(scanner) +
		" dive bar and ordered a drink for everybody.");
	}
	
	//Method 1: Prompt for a name
	public static String getName(Scanner scanner) {
		System.out.print("Enter Name: ");
		return scanner.nextLine();
	}
	
	//Method 2: prompt for age 
	public static int getAge(Scanner scanner) {
		System.out.print("Enter Age: ");
		return scanner.nextInt();
	}
	
	//Method 3: scanner for user input 
	public static String getAdjective(Scanner scanner) {
		System.out.print("Enter an adjective: ");
		scanner.nextLine();
		return scanner.nextLine();
	}
	//Method 4: Select random from array of archetypes 
	public static String getRandomArchetype() {
		String[] archetypes = {
				"private investigator", 
				"suburban soccer fan",
				"sillicon valley tech guru",
				"chain-smoking ER nurse",
				"sketchy real estate agent"
		};
		Random rand = new Random();
		return archetypes[rand.nextInt(archetypes.length)];
	}
	
	
	

}
