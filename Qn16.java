import java.util.Scanner;

public class Qn16 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the angle of the first angle of triangle: ");
        a= scanner.nextInt();

        System.out.println("The angle of second angle of triangle: ");
        b= scanner.nextInt();

        System.out.println("The angle of third angle of triangle: ");
        c=scanner.nextInt();

        if(a==b&&b==c){
            System.out.println("It is a equivalent triangle.");
        }
        else if(a==b||a==c||b==c){
            System.out.println("It is a isosceles triangle.");
        }
        else {
            System.out.println("It is a scalene triangle.");
        }
    }
}
