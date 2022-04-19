import java.util.Scanner;

public class Qn4 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        if (a%5==0&&a%11==0){
            System.out.println("The number is divisible by both 5 and 11");
        }
        else{
            System.out.println("The numbers arent divisible by 5 and 11");
        }
    }
}
