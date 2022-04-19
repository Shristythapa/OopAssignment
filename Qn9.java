import java.util.Scanner;

public class Qn9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character: ");
        char c = scanner.next().charAt(0);

        if(Character.isAlphabetic(c)){
            System.out.println("The character is a alphabet.");
        }

        else if(Character.isDigit(c)){
            System.out.println("The character is a digit.");
        }

        else {
            System.out.println("The character is a special character.");
        }

    }
}
