import java.util.Scanner;
class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int num1 = scanner.nextInt();

        System.out.println("Give a number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int multiplication = num1 * num2;
        int substraction = num1 - num2;
        int division = num1 / num2;

        System.out.println("\n" + num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " - " + num2 + " = " + substraction);
        System.out.println(num1 + " / " + num2 + " = " + division);

        scanner.close();
    }
}
