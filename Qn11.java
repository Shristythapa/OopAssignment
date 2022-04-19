import java.util.Scanner;

public class Qn11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number form 1 to 7 to get the respective weekday: ");
        int i = scanner.nextInt();

        if (i==1){
            System.out.println("Sunday");
        }
        else if (i==2){
            System.out.println("Monday");
        }
        else if (i==3){
            System.out.println("Tuesday");
        }
        else if (i==4){
            System.out.println("Wednesday");
        }
        else if (i==5){
            System.out.println("Thursday");
        }
        else if (i==6){
            System.out.println("Friday");
        }
        else if (i==7){
            System.out.println("Saturday");
        }
        else{
            System.out.println("Enter the correct value");
        }
    }
}
