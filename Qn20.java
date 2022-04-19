import java.util.Scanner;

public class Qn20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the salary: ");
        int salary = scanner.nextInt();

        if(salary<=10000){
            System.out.println("HRA=20%\nDA=80%");
        }
        else if(salary<=20000){
            System.out.println("HRA=25%\nDA=90%");
        }
        else if(salary>20000){
            System.out.println("HRA=30%\nDA=95%");
        }
    }
}
