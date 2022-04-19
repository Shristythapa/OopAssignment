import java.util.Scanner;

public class Qn21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float bill;

        System.out.print("Enter electricity unit: ");
       float unit = scanner.nextFloat();
       if(unit<=50){
           bill= (float) (unit*0.50);
           System.out.println(bill);
       }
       else if(unit<=150){
           bill = (float) ((float) (50*0.50)+((unit-50)*0.75));
           System.out.println(bill);
       }
       else if(unit<=250){
           bill = (float) ((float) (50*0.50)+(100*0.75)+((unit-150)*1.20));
           System.out.println(bill);
       }
       else if(unit>250){
           bill = (float) ((float) (50*0.50)+(100*0.75)+(100*1.20)+((unit-250)*1.50));
           System.out.println(bill);
       }
    }
}
