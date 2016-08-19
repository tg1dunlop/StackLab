
import java.util.Scanner;
import java.util.Stack;

public class mainStack {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Please enter a math equation:  ");
			String userInput = scan1.nextLine();

			for (int i = 0; i < userInput.length(); i++) {
				char input = userInput.charAt(i);
				
				switch (input) {
				case '*':

					if (s.size() == 2) {
						int x = s.pop();
						int y = s.pop();
						s.push(x * y);
					}
					break;
				
				case '/':
					if (s.size() == 2) {
						int x = s.pop();
						int y = s.pop();
						s.push(y / x);
					}
					break;
				
				case '+':
					if (s.size() == 2) {
						int x = s.pop();
						int y = s.pop();
						s.push(x + y);
					}
					break;
				
				case '-':
					if (s.size() == 2) {
						int x = s.pop();
						int y = s.pop();
						s.push(y - x);
					}
					break;
				
				default:

					int inputConv = Character.getNumericValue(input);

					s.push(inputConv);

					break;
				}
			}
			System.out.println(s.pop());
			System.out.println("Continue? (y/n)");

			choice = scan1.nextLine();
			System.out.println("Goodbye!");
		}

	}

}
