import java.util.Scanner;
import java.lang.*;

public class Qn10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char s = scanner.next().charAt(0);

        if(Character.isUpperCase(s)){
            System.out.println("The character is upper case");

        }
        else if (Character.isLowerCase(s)){
            System.out.println("The character is lower case");
        }
    }
}
