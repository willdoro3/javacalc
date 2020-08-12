import java.util.*;

public class BasicCalculator {

	
	public static void main(String[] args) {
		
		Scanner calc = new Scanner(System.in);
		
		int num1;
		int num2;
		double ans = 0;
		char op;
		
		System.out.println("Enter two integers: ");
		num1 = calc.nextInt();
		num2 = calc.nextInt();
		
		System.out.println("Enter an operator (+, -, *, /): ");
		op = calc.next().charAt(0);
		
		switch (op) {
			case '+':
				ans = num1 + num2;
				break;
			case '-':
				ans = num1 - num2;
				break;
			case '*':
				ans = num1 * num2;
				break;
			case '/':
				ans = num1 / num2;
				break;
			default:
				System.out.println("Error!");	
		}
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
	}
	
}
