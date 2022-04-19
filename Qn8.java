import java.util.Scanner;

public class Qn8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character.");
        String a;
        a = scanner.next();
        String v= "aeiou";
        if(v.contains(a)){
            System.out.println("The number is a vowel.");
        }
        else {
            System.out.println("The number is a consonant");
        }
    }
}
