package cs201.edu;

/*
Bryce DeBilzan
HOMEWORK 3 PROBLEM 8- "Palindromes"
Prompts user to enter a 5 digit number.
If number entered is not 5 digits, displays error message to the user and exits program.
If number is a 5 digit number, then verifies if number is palindrome or not.
Displays message indicating whether or not number entered is a palindrome.
*/

import java.util.Scanner;

public class HW03P08{
	public static void main(String[] args) {
		//Creates Scanner object
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a 5 digit number: ");
		int usersNumberInput = in.nextInt();
		
		if ((usersNumberInput > 99999) || (usersNumberInput < 10000))
			{
				System.out.println(usersNumberInput + " is not a 5 digit number!");
				System.out.println("Program will now exit!");
				System.exit(1);
			}
			
		//Declares digits and separates digits in the five digit number
		int digit1 = usersNumberInput / 10000;
      	int digit2 = usersNumberInput / 1000 % 10;
      	int digit3 = usersNumberInput % 1000 / 100 % 10;
      	int digit4 = usersNumberInput % 10000 % 1000 % 100 / 10;
     	int digit5 = usersNumberInput % 10000 % 1000 % 100 % 10;
     	
     	//Calculates/prints whether or not users number input is a palindrome
     	if (digit1 == digit5 && digit2 == digit4)
     	{
          System.out.println(usersNumberInput + " is a palindrome!");
        }
      	else
      	{
          System.out.println(usersNumberInput + " is not a palindrome!");
        }	
		}
	}