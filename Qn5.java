import java.util.Scanner;

public class Qn5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a%2==0){
            System.out.println("The number is even.");
        }
        else {
            System.out.println("Thr number is odd.");
        }
    }
}

