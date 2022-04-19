import java.util.Scanner;

public class Qn13 {
    public static void main(String[] args) {
        int val , amt;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of each note: ");
        val = scanner.nextInt();

        System.out.print("Enter the total amount: ");
        amt= scanner.nextInt();

        int notes = amt/val;

        System.out.println("The number of notes are "+notes+".");
    }
}
