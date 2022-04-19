import java.util.Scanner;

public class Qn19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float physics, chemistry, biology, mathematics, computer;

        System.out.print("Enter physics marks: ");
        physics = scanner.nextFloat();

        System.out.println("Enter chemistry marks: ");
        chemistry = scanner.nextFloat();

        System.out.println("Enter biology marks: ");
        biology = scanner.nextFloat();

        System.out.println("Enter mathematics marks: ");
        mathematics = scanner.nextFloat();

        System.out.println("Enter computer marks: ");
        computer = scanner.nextFloat();

        float per = (physics+chemistry+biology+mathematics+computer)/5;

        if (per>=90){
            System.out.println("Grade A");
        }
        else if(per>=80){
            System.out.println("Grade B");
        }
        else if(per>=70){
            System.out.println("Grade C");
        }
        else if(per>=60){
            System.out.println("Grade D");
        }
        else if(per>=40){
            System.out.println("Grade E");
        }
        else if(per<40){
            System.out.println("Grade F");
        }
    }
}
