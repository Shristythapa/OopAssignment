import java.util.Scanner;

public class Qn15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sides in the triangle: ");
        int angles = scanner.nextInt();

        if (angles==3){
            System.out.println("The triangle is valid");
        }
        else {
            System.out.println("The triangle is invalid");
        }

    }
}