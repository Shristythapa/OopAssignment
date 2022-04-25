import java.util.Scanner;

class QuestionOne{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks of physics:: ");
        double physics= scanner.nextDouble();

        System.out.print("Enter the marks of chemistry:: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter the marks of biology:: ");
        double biology = scanner.nextDouble();

        System.out.print("Enter the marks of mathematics:: ");
        double mathematics = scanner.nextDouble();

        System.out.print("Enter the marks of computer:: ");
        double computer = scanner.nextDouble();

        double marks = (computer+mathematics+biology+chemistry+physics)/5;

        switch((marks>=90)?1:(marks>=80)?2:(marks>=70)?3:(marks>=60)?4:(marks>=40)?5:(marks<40)?5:0){

            case 1:
                System.out.print("Grade A");
                break;
            case 2:
                System.out.print("Grade B");
                break;
            case 3:
                System.out.print("Grade C");
                break;
            case 4:
                System.out.print("Grade D");
                break;
            case 5:
                System.out.print("Grade E");
                break;
            case 6:
                System.out.print("Grade F");
                break;

        }

    }
}
class QuestionTwo{
      public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number:: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number:: ");
        double b = scanner.nextDouble();

        switch ((a>b)?1:(a<b)?2:0){
            case 1:
                System.out.print(a+" is is greater than "+b);
            case 2:
                System.out.print(b+" is greater than "+a);
        }
      }
}
class QuestionThree{
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first number:: ");
    double a = scanner.nextDouble();

    System.out.println("Enter the second number:: ");
    double b = scanner.nextDouble();

    System.out.println("Enter the third number:: ");
    double c = scanner.nextDouble();

    switch((a>b&&b>c)?1:(b>c&&c>a)?2:(c>b&&b>a)?3:0){
        case 1:
            System.out.print(a+" is greatest");
        case 2:
            System.out.print(b+" is greatest");
        case 3:
            System.out.print(c+" is greatest");
    }
    }
}
class  QuestionFour{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number:: ");
        int a = scanner.nextInt();;

        switch ((a%5==0)&&(a%11==0)?1:2){
            case 1:
                System.out.print("The number is divisible by both 5 and 11");
            case 0:
                System.out.print("The number is not divisible by both.");
        }
    }
}
class QuestionFive{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year:: ");
        int year = scanner.nextInt();

        switch (((year%4==0)||(year%400==0))?1:2){

        }
    }
}
class QuestionSix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character:: ");
        char ch = scanner.next().charAt(0);

        switch((Character.isAlphabetic(ch))?1:0){
            case 1:
                System.out.print(ch+" is an alphabet.");
            case 0:
                System.out.print(ch+" is not an alphabet.");

        }

    }
}
