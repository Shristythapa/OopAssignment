import java.util.Scanner;

public class Qn3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("Enter the number");
        a= scanner.nextInt();
        if (a>0){
            System.out.println("The number is positive");
        }
        else if(a<0){
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is zero");
        }

    }
}
