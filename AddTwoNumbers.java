import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of the two numbers is: " + sum);

	System.out.println("This is a new line AFTER initial commit");

        scan.close();
    }
}
