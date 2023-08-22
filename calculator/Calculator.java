import java.util.*;

public class Calculator {
	public static void main(String[] Args) {

		Scanner scan = new Scanner(System.in);

		//take first number
		System.out.print("Enter first number: ");
		double num1 = scan.nextDouble();
		scan.nextLine();

		//take second number 
		System.out.print("Enter second number: ");
		double num2 = scan.nextDouble();
		scan.nextLine();

		System.out.print("Enter operation (+, -, *, /, %, ^): ");
		String operation = scan.nextLine();


		if (operation.equals("+")) {
            double number = num1 + num2;
            System.out.println(number);
        } else if (operation.equals("-")) {
            double number = num1 - num2;
            System.out.println(number);
        } else if (operation.equals("*")) {
            double number = num1 * num2;
            System.out.println(number);
        } else if (operation.equals("/")) {
            double number = num1 / num2;
            System.out.println(number);
        } else if (operation.equals("%")) {
            double number = num1 % num2;
            System.out.println(number);
        } else if (operation.equals("^")) {
            double number = Math.pow(num1, num2);
            System.out.println(number);
        } else {
            System.out.println("No operation to perform");
        }
    }
}