import java.util.Scanner;

public class ToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String lowerCaseString = input.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseString);

        scanner.close();
    }
}
