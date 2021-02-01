package controlFlow;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		// System.out.println("Hello World");
		// System.out.println("Numbers:");
		

		
		System.out.println("Numbers:");
		AsciiChars.printNumbers();
		System.out.println("Lowercase letters:");
		AsciiChars.printLowerCase();
		System.out.println("Uppercase letters:");
		AsciiChars.printUpperCase();
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String inputName = userInput.nextLine();
		System.out.printf("Hello %s\n", inputName);
		
		System.out.println("Do you wish to continue to the interactive portion? (y/n)");
		String userResponse = userInput.nextLine();
		
		if(userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
			boolean continueVar = true;
			do {
				System.out.println("What is your favorite pet's name?:");
				String petName;
				//while (!Character.isLetter(userInput.nextLine().trim().charAt(0)))
				//	System.out.printf("Enter a string please!");
				//	if (Character.isLetter(userInput.nextLine().trim().charAt(0)))
				//		petName = userInput.nextLine(); 
					
				petName = userInput.nextLine();
				
				System.out.println("What is your favorite pet's age?: ");
				String petAge_s = userInput.nextLine();
				int petAge = Integer.parseInt(petAge_s);
				System.out.println("What is your lucky number?");
				String luckyNum_s = userInput.nextLine();
				int luckyNum = Integer.parseInt(luckyNum_s);
				System.out.println("Do you have a favorite quarterback? (y/n)");
				String ifQuarterback = userInput.nextLine();
				String quarterNum_s = "5"; //so it can be taken out of the conditional
				int quarterNum = 5;        //so it can be taken out of the conditional
				if (ifQuarterback.equalsIgnoreCase("y") || ifQuarterback.equalsIgnoreCase("yes")) {
					System.out.println("What is their jersey number?: ");
					quarterNum_s = userInput.nextLine();
					quarterNum = Integer.parseInt(quarterNum_s);
				}
			
				System.out.println("What is the first name of your favorite actor?: ");
				String actorName = userInput.nextLine();
				System.out.println("What is the two digit model year of your car?: ");
				Integer modelYear = userInput.nextInt();
				System.out.println("Enter a random number between 1 and 50 (whole number): ");
				Integer randomNum = userInput.nextInt();
				Random rand = new Random();
				int upperbound = 10; 
				int rand1 = rand.nextInt(upperbound);
				int rand2 = rand.nextInt(upperbound);
				int rand3 = rand.nextInt(upperbound);
				int magicBall; 
				if (ifQuarterback == "y" || ifQuarterback == "yes") {
					magicBall = quarterNum*rand1;
				} else {
					magicBall = luckyNum*rand1;
				} if (magicBall > 75) 
					magicBall = magicBall - 75; 
			
				char thirdLetter = petName.charAt(2);
				int num1 = (int) thirdLetter; 
				int num2 = modelYear + luckyNum; 
				int num3 = rand.nextInt(51) - rand2;
				int num4 = (int) actorName.charAt(0);
				int num5 = 42; 
				int[] numbers = {num1, num2, num3, num4, num5};
				for (int m=0; m<5; m++) {
					if (numbers[m] > 75)
						numbers[m] = numbers[m]%75; 
					if (numbers[m]< 0)
						numbers[m] = numbers[m]+75;
				}
				Arrays.sort(numbers);
				String num_1 = Integer.toString(numbers[0]);
				String num_2 = Integer.toString(numbers[1]);
				String num_3 = Integer.toString(numbers[2]);
				String num_4 = Integer.toString(numbers[3]);
				String num_5 = Integer.toString(numbers[4]);
				
				System.out.println("Lottery numbers: "+num_1+", "+num_2+", "+num_3+", "+num_4+", "+num_5+", "+"Magic Number: "+Integer.toString(magicBall));
				//System.out.println();
				String dummyVar = userInput.nextLine(); //So the input from the next question would save. 
				System.out.println("Do you want to play again? (y/n) ");
				String playAgain = userInput.nextLine();
				if (playAgain.equalsIgnoreCase("y") || playAgain.equalsIgnoreCase("yes"))
					continueVar = true;
				else
					System.out.println("Thank you for playing!");
					continueVar = false;
				} while (continueVar);
			} else { // anything other than y or yes response goes to exit
			System.out.printf("Okay %s, please return later to complete the survey.\n", inputName);
			userInput.close();
			System.exit(0);
		}
		
		userInput.close();



}		

}
