import java.util.Scanner;
public class Qn2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first number: ");
        a=scanner.nextInt();
        System.out.println("Enter the second number: ");
        b=scanner.nextInt();
        System.out.println("Enter the third number: ");
        c=scanner.nextInt();
        if (a>b&&b>c){
            System.out.printf("%i is greatest.",a);
        }
        else if(b>c&&c>a){
            System.out.printf("%i is greatest.",b);
        }
        else if (c>b&&b>a){
            System.out.printf("%i is the greatest",c);
        }
        else if(a==b&&b==c){
            System.out.println("All number are equal");
        }
    }
}

