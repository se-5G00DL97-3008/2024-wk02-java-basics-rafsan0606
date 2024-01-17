import java.util.Scanner;

class E06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which multiplication table to show?");
        int inputNumber = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            int result = i * inputNumber;
            System.out.println(i + " x " + inputNumber + " = " + result);
        }

        scanner.close();

    }
}
