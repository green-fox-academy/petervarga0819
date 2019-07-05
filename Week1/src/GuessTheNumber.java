import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int a = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number!");
        int b = scanner.nextInt();

        while (a != b) {
            if (a > b) {
                System.out.println("The stored number is higher");
                b = scanner.nextInt();
            } else if (a < b) {
                System.out.println("The stored number is lower");
                b = scanner.nextInt();
            } else {
                System.out.println("You found the number: " + a);
            }

        }
    }
}