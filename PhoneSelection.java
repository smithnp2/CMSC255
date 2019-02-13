/* PhoneSelection.java
*******************************************

* develop an algorithm that takes an input
* as a single letter and displays the 
* corresponding digit on the telephone

*******************************************

* Nathaniel Smith &&  Asish Boyapati
* 2/13/19
* CMSC 255-004

*******************************************
*/

import java.util.Scanner;

public class PhoneSelection
{
	public static void main(String[] args)
	{
	
	/***************************
	* get input from user
	***************************/
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Input a single letter: ");
	String inputletter = input.next();
	char letter = inputletter.charAt(0);
	
	/***************************
	* if and print statements for number
	* associated with letter
	***************************/
	
	if (letter == 'a' || letter == 'b' || letter == 'c')
	{
		System.out.println("The digit 2 corresponds to the letter " + letter + " on the telephone.");
	}
	else if (letter == 'd' || letter == 'e' || letter == 'f')
	{
		System.out.println("The digit 3 corresponds to the letter " + letter + " on the telephone.");
	}
	else if (letter == 'g' || letter == 'h' || letter == 'i')
	{
		System.out.println("The digit 4 corresponds to the letter " + letter + " on the telephone.");
	}
	else if (letter == 'j' || letter == 'k' || letter == 'l')
	{
		System.out.println("The digit 5 corresponds to the letter " + letter + " on the telephone.");
	}
	else if (letter == 'm' || letter == 'n' || letter == 'o')
	{
		System.out.println("The digit 6 corresponds to the letter " + letter + " on the telephone.");
	}
	else if (letter == 'p' || letter == 'q' || letter == 'r' || letter == 's')
	{
		System.out.println("The digit 7 corresponds to the letter " + letter + " on the telephone.");
	}
	else if (letter == 't' || letter == 'u' || letter == 'v')
	{
		System.out.println("The digit 8 corresponds to the letter " + letter + " on the telephone.");
	}
	else if (letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z')
	{
		System.out.println("The digit 9 corresponds to the letter " + letter + " on the telephone.");
	}
	
	/* error check*/
	else
	{
		System.out.println("Error!");
	}
	}
	}

	
	
	
	