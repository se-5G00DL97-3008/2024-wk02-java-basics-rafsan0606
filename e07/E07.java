import java.util.Scanner;

class E07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which multiplication table to show?");
        int inputNumber = scanner.nextInt();

        System.out.println("Until which multiplier should the table show?");
        int multiplierLimit = scanner.nextInt();
        
        for (int i = 0; i <= multiplierLimit; i++) {
            int result = i * inputNumber;
            System.out.println(i + " x " + inputNumber + " = " + result);
        }

        scanner.close();

    }
}
