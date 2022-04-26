import java.util.Scanner;

class QuestionOneS{
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
class QuestionTwoS{
      public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number:: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number:: ");
        double b = scanner.nextDouble();

        switch ((a>b)?1:(a<b)?2:0){
            case 1:
                System.out.print(a+" is is greater than "+b);
                break;
            case 2:
                System.out.print(b+" is greater than "+a);
                break;
        }
      }
}
class QuestionThreeS{
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
            break;
        case 2:
            System.out.print(b+" is greatest");
            break;
        case 3:
            System.out.print(c+" is greatest");
            break;
    }
    }
}
class  QuestionFourS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number:: ");
        int a = scanner.nextInt();;

        switch ((a%5==0)&&(a%11==0)?1:2){
            case 1:
                System.out.print("The number is divisible by both 5 and 11");
                break;
            case 0:
                System.out.print("The number is not divisible by both.");
                break;
        }
    }
}
class QuestionFiveS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year:: ");
        int year = scanner.nextInt();

        switch (((year%4==0)||(year%400==0))?1:2){
            case 1:
                System.out.print("The year is a leap year.");
                break;
            case 2:
                System.out.print("The year is not a leap year.");
                break;
        }
    }
}
class QuestionSixS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character:: ");
        char ch = scanner.next().charAt(0);

        switch((Character.isAlphabetic(ch))?1:0){
            case 1:
                System.out.print(ch+" is an alphabet.");
                break;
            case 0:
                System.out.print(ch+" is not an alphabet.");
                break;
            default:
                System.out.print("Invalid");
        }

    }
}
class QuestionSevenS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character:: ");
        char ch = scanner.next().charAt(0);

        switch ((ch =='a'|| ch =='e' || ch =='i'|| ch =='o'||ch =='u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == '0' || ch == 'U' )?1:0){
            case 1:
                System.out.print("The character is a vowel.");
                break;
            case 0:
                System.out.print("The character is a constant.");
                break;
            default:
                System.out.print("Invalid");
        }

    }
}
class QuestionEightS{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character:: ");
        char a = scanner.next().charAt(0);

        switch((Character.isAlphabetic(a)?1:Character.isDigit(a)?2:0)){
            case 1:
                System.out.print("The character is a alphabate");
                break;
            case 2:
                System.out.print("The character is a Digit.");
                break;
            case 3:
                System.out.print("The character is s special character.");
                break;
            default:
                System.out.print("Invalid");
        }

    }
}
class  QuestionNineS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character:: ");
        char ch = scanner.next().charAt(0);

        switch ((Character.isLowerCase(ch)?1:Character.isUpperCase(ch)?2:0)){
            case 1:
                System.out.print("The character is lower case.");
                break;
            case 2:
                System.out.print("The character is Upper case.");
                break;
            case 0:
                System.out.print("The character is invalid.");
                break;
            default:
                System.out.print("Invalid");
        }
    }
}
class QuestionTenS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the week number:: ");
        int a = scanner.nextInt();

        switch (a){
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
            case 7:
                System.out.print("Saturday");
                break;
            default:
                System.out.print("The number is invalid.");

        }
    }
}

class QuestionElevenS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month=null;
        int days=0;

        System.out.print("Enter the month number:: ");
        int m = scanner.nextInt();
        switch (m){
            case 1:
                month = "January";
                days=31;
                break;
            case 2:
                month="February";
                switch ((m%400==0)||(m%4==0)?100:200){
                    case 100:
                        days=29;
                        break;
                    case 200:
                        days = 28;
                        break;
                }
            case 3:
                month="march";
                days=31;
                break;
            case 4:
                month = "April";
                days = 30;
                break;
            case 5:
                month = "May";
                days = 31;
                break;
            case 6:
                month = "June";
                days = 30;
                break;
            case 7:
                month = "july";
                days = 31;
                break;
            case 8:
                month = "August";
                days = 31;
                break;
            case 9:
                month = "September";
                days = 30;
                break;
            case 10:
                month = "October";
                days = 31;
                break;
            case 11:
                month = "November";
                days = 30;
                break;
            case 12:
                month = "December";
                days = 31;
                break;
            default:
                System.out.print("Invalid");
        }
        System.out.print("The month "+month+" has "+days+" days.");

    }
}
class QuestionTwelveS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amt , value,note;
        System.out.print("Enter the amount of money:: ");
        amt = scanner.nextInt();
        System.out.print("Enter the value of each note:: ");
        value = scanner.nextInt();

       switch (value){
           case 5:
               note = amt/5;
               System.out.print("The number of notes are "+note+".");
               break;
           case 10:
               note = amt/10;
               System.out.print("The number of notes are "+note+".");
               break;
           case 20:
               note = amt/20;
               System.out.print("The number of notes are "+note+".");
               break;
           case 50:
               note = amt/50;
               System.out.print("The number of notes are "+note+".");
               break;
           case 100:
               note = amt/100;
               System.out.print("The number of notes are "+note+".");
               break;
           case 500:
               note = amt/500;
               System.out.print("The number of notes are "+note+".");
               break;
           case 1000:
               note = amt/1000;
               System.out.print("The number of notes are "+note+".");
               break;
           default:
               System.out.print("Invalid");
       }

    }
}
class QuestionThirteenS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree of first angle:: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double c = scanner.nextDouble();

        switch ((a+b>c)||(a+c>b)||(b+c>a)?1:2){
            case 1:
                System.out.print("The triangle is valid.");
                break;
            case 2:
                System.out.print("The triangle is not valid.");
        }

    }
}
class QuestionFourteenS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree of first angle:: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double c = scanner.nextDouble();

        switch ((a==b&&b==c)?1:(a==b||b==c||c==a)?2:3){
            case 1:
                System.out.print("The triangle is a equilateral triangle. ");
                break;
            case 2:
                System.out.print("The triangle is a isosceles triangle. ");
                break;
            case 3:
                System.out.print("The triangle is a scalene triangle. ");
        }
    }
}
class QuestionFifteenS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a,b,c;
        double root1,root2;

        System.out.print("Enter the first number a: ");
        a=scanner.nextDouble();

        System.out.print("Enter the second number b: ");
        b = scanner.nextDouble();

        System.out.print("Enter the third number c: ");
        c = scanner.nextDouble();

        double determinant = b * b - 4 * a * c;

        switch ((determinant>0)?1:(determinant==0)?2:(determinant<0)?3:0){
            case 1:
                root1 = (-b + Math.sqrt(determinant)) / (2 * a);
                root2 = (-b - Math.sqrt(determinant)) / (2 * a);
                System.out.print("The roots are real and different.\nroot1="+root1+"\nroot2="+root2);
                break;
            case 2:
                root1 = root2 = -b / (2 * a);
                System.out.print("The roots are real and equal.\nroot1 and root2 = "+root1);
                break;
            case 3:
                double real = -b / (2 * a);
                double imaginary = Math.sqrt(-determinant) / (2 * a);
                System.out.print("The roots are complex and distinct.\nreal = "+real+"\"" +"\nimaginary= "+imaginary);
                break;
            case 0:
                System.out.print("Invalid");
        }
    }
}
class QuestionSixteenS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the selling price: ");
        double sp = scanner.nextDouble();

        System.out.print("Enter the cost price: ");
        double cp = scanner.nextDouble();

        switch ((cp>sp)?1:(sp>cp)?2:0){
            case 1:
                double loss = cp-sp;
                System.out.print("The loss is "+loss);
                break;
            case 2:
                double profit = sp-cp;
                System.out.print("The profit is "+profit);
                break;
            case 0:
                System.out.print("Both cp and sp are equal");
        }
    }
}
class QuestionSeventeenS{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Physic: ");
        double physics=scanner.nextDouble();

        System.out.println("Chemistry : ");
        double chemistry=scanner.nextDouble();

        System.out.println("Biology : ");
        double biology=scanner.nextDouble();

        System.out.println("math : ");
        double maths=scanner.nextDouble();

        System.out.println("computer : ");
        double computer=scanner.nextDouble();


        double total=(physics+chemistry+biology+maths+computer);
        double per=total/5;

        System.out.println("Total percentage is "+per);
        System.out.println("Total  is "+total);

        switch ((per>=90)?0:(per>=80 && per<90)?1:(per>=70 && per<=80)?2:(per>=60 && per<70)?3:(per>=40 && per<60)?4:5){


            case 0:
                System.out.println("grade A");
                break;
            case 1:
                System.out.println("grade B");
                break;
            case 2:
                System.out.println("grade C");
                break;
            case 3:
                System.out.println("grade D");
                break;
            case 4:
                System.out.println("grade E");
                break;
            case 5:
                System.out.println("grade F");
                break;
        }

    }

}

class QuestionEighteenS{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your basic salary: ");
        double salary=scan.nextDouble();

        double HRA,DA;

        switch ( (salary<=10000)?1:(salary<=20000 && salary>10000)?2:(salary>20000)?3:0 ){

            case 1:
                System.out.println("Gross salary is "+ (salary+(0.2*salary)+(0.8*salary)));
                break;

            case 2:
                System.out.println("Gross salary is "+ (salary+(0.25*salary)+(0.9*salary)));
                break;

            case 3:
                System.out.println("Gross salary is "+ (salary+(0.3*salary)+(0.95*salary)));
                break;

            case 0:
                System.out.println("no thing");
                break;


        }

    }
}
class QuestionNineteenS{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        double amount,add,bill;

        System.out.println("Enter the electricity unit charges:");
        double unit= scanner.nextDouble();

        switch ( (unit<=50)?1:(unit<=150)?2:(unit<=250)?3:0){


            case 1:
                amount=unit*0.5;
                add=amount*0.2;
                bill=amount+add;
                System.out.println("The total bill is "+ bill);
                break;

            case 2:
                amount=25+(unit-50)*0.75;
                add=amount*0.2;
                bill=amount+add;
                System.out.println("the total bill is"+bill);
                break;

            case 3:
                amount=25+75+(unit-150)*1.20;
                add=amount*0.2;
                bill=amount+add;
                System.out.println("total bill is "+bill);
                break;

            case 4:
                amount=25+75+150+(unit-250)*1.50;
                add=amount*0.2;
                bill=amount+add;
                System.out.println("total bill is "+bill);
                break;

            default:
                System.out.println("invalid");

        }

    }
}
class QuestionTwentyS {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double quiz, mid, final_term,p;
        System.out.println("Enter the quiz_term marks: ");
        quiz=scanner.nextDouble();
        System.out.println("Enter the mid_term marks: ");
        mid=scanner.nextDouble();
        System.out.println("Enter the final_term marks: ");
        final_term=scanner.nextDouble();

        p=(quiz+mid+final_term)/3;
        System.out.println("the total percent is "+p);

        switch ((p>=90)? 0:(p>=70&& p<90)? 1:(p>=50&& p<70)?2:3){
            case 0:
                System.out.println("Grade A");
                break;
            case 1:
                System.out.println("Grade B");
                break;
            case 2:
                System.out.println("Grade C");
                break;
            case 3:
                System.out.println("Grade F");
                break;
            default:
                System.out.println("not valid");
        }

    }
}
class QuestionTwentyOneS{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double hours, minutes;
        System.out.println("enter the total hours: ");
        hours=scanner.nextDouble();

        System.out.println("enter the total minutes: ");
        minutes=scanner.nextDouble();

        double min_in_hr=minutes/60;
        double t_hours=min_in_hr+hours;

        switch((t_hours>0 &&t_hours<=11)? 1:(t_hours>=12 &&t_hours<24?2:3)){
            case 1:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is AM.");
                break;
            case 2:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is PM.");
                break;
            case 3:
                System.out.println("invalid input");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
class QuestionTwentyTwoS{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the number: ");
        double num=scanner.nextDouble();

        switch((num<0)?1:(num>0)?2:3){
            case 1:
                System.out.println("you enter the negative no ");
                System.out.println("so it positive no is "+(num*-1));
                break;
            case 2:
                System.out.println("you enter the positive no ");
                System.out.println("so its negative no is "+(num*-1));
                break;
            case 3:
                System.out.println("you enter the invalid no or zero ");
                break;
            default:
                System.out.println("invalid input");
        }

    }
}
class QuestionTwentyThreeS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        System.out.println("Enter the first no:");
        double a=scanner.nextDouble();
        System.out.println("Enter the second no:");
        double b=scanner.nextDouble();
        temp=a;
        a=b;
        b=temp;
        switch((a!=b)?1:(a==b)?2:3){
            case 1:
                System.out.println("a="+a);
                System.out.println("b="+b);
                break;
            case 2:
                System.out.println("Don't take two same no");
                break;
            case 3:
                System.out.println("invalid");
                break;
        }


    }
}
class QuestionTwentyFourS{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the number:");
        int num=scanner.nextInt();

        switch(num%2){
            case 0:
                System.out.println(num+" is an even number");
                System.out.println("And it's upper nearest odd number is "+ (num+1));
                break;
            case 1:
                System.out.println("Don't enter the odd number");
                break;
            default:
                System.out.println("invalid");
        }
    }
}