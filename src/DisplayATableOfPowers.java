import java.util.Scanner;

/**
 * 
 */

/**
 * @author Harley Quinn
 *
 */
public class DisplayATableOfPowers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int choice = 1;
		String cont = "y";
		// int squaredResult = 1;
		// int cubedResult = 1;
		// int myInt = 0;
		
		

		while (cont.matches("^[yY]$") ) {
			System.out.println("Learn your squares and cubes!");
			System.out.println("");
			System.out.print("Enter an integer: ");
			choice = scanner.nextInt();
			
			
			
			/* Error handling
			 * Scanner scanner = new Scanner(System.in);
				while (!scanner.hasNextInt()) {
   				System.out.println("Please enter integers only");
   				sc.nextLine();
				}
				int num = scanner.nextInt();
				System.out.println("Thank you! (" + num + ")");
			 */
			
			/*// Error handling
			 * 
			 * while (!input.hasNextInt()
			 * System.out.println("Integer, please!");
			 * input.next();
			 */
			
			System.out.println("");
			System.out.println("Number\tSquare\tCubed ");
			System.out.println("======\t======\t===== ");
			
		    /*// Another way of formatting
		     * (you must import java.util.Formatter)
		     * System.out.printf("%d %10d %10d", i, i*i, i*i*i);
		     * System.out.println(fmt);
		     * 
		     */
		
			for (i = 1; i <= choice ; i++) {
			System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));
			/*
			 Another way of doing the math for exponents
			 for (j = 1; j <= 3; j++) {
			 squaredResult = i * i;
			 cubedResult = squaredResult * i
		 	 }
			 */
			
			/*
			 * Yet another way of doing the math for exponents
			 * System.out.printf("%10.0f", Math.pow (x,n));
			 */
		}
			System.out.println();
			System.out.print("Continue? (y/n): ");
			cont = scanner.next();
			System.out.println();
		}
		System.out.println("Goodbye!");
		scanner.close();

	}
	
}
	
