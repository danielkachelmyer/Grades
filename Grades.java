/*
 * Take input of doubles
 * and store in array
 * then add up
 * and find avg.
 */
import java.util.Scanner;

public class Grades {
	public static void main (String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		double avg;
		double total = 0;
		int arraySize = 100; //determined by number of grades input by user
		int counter = 0;
		double [] grades;
		grades = new double [arraySize];
		
		//loop to enter grades till -1
		for(int i = 0; i < arraySize; i++ ) {
			counter++;
			System.out.println("Enter grades, enter -1 to quit");
			grades [i] = input.nextDouble();
			
			if (grades[i] == -1) {
				break;
			}
		}
		
		//calc avg
		for(int x = 0; x < (counter - 1); x++) {
			total+= grades[x];
		}
		
		avg = total / (counter - 1);
		
		System.out.println("Number of grades entered is: " + (counter - 1));
		System.out.println("Total is: " + total);
		System.out.printf("avg is: %2.2f" , avg);
		
	}
}
