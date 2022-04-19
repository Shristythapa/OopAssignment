import java.util.Scanner;

public class Qn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char s = scanner.next().charAt(0);

        if(Character.isAlphabetic(s)){
            System.out.println("The number is a alphabet");
        }

        else{
            System.out.println("It is not a alphabet");
        }
    }
}
