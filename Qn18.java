import java.util.Scanner;

public class Qn18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost price: ");
        int cp = scanner.nextInt();

        System.out.print("Enter the selling price: ");
        int sp = scanner.nextInt();

        if(sp>cp){
            int profit = sp-cp;
            System.out.println("The profit is "+profit+".");
        }
        else if(cp>sp){
            int loss = cp-sp;
            System.out.println("The loss is"+loss+".");
        }
        else if(cp==sp){
            System.out.println("The loss is 0.");
        }
    }
}
