import java.util.Scanner;

public class Qn1 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a= scanner.nextInt();
        System.out.println("enter the second value: ");
        b=scanner.nextInt();
        if (a>b) {
            System.out.println("first number is greater");
        }
        else if(b>a){
            System.out.println("Second number is greater");
        }
        else if(a==b){
            System.out.println("Both number are equal");
        }

    }
}
