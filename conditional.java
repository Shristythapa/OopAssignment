import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a= scanner.nextInt();
        System.out.println("enter the second value: ");
        b=scanner.nextInt();
        if (a>b) {
            System.out.println("first number is greater");
        }
        else if(b>a){
            System.out.println("Second number is greater");
        }
        else if(a==b){
            System.out.println("Both number are equal");
        }

    }
}
class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the first number: ");
        a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        b = scanner.nextInt();
        System.out.println("Enter the third number: ");
        c = scanner.nextInt();
        if (a > b && b > c) {
            System.out.printf("%i is greatest.", a);
        } else if (b > c && c > a) {
            System.out.printf("%i is greatest.", b);
        } else if (c > b && b > a) {
            System.out.printf("%i is the greatest", c);
        } else if (a == b && b == c) {
            System.out.println("All number are equal");
        }
    }
}
class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print("Enter the number: ");
        a= scanner.nextInt();
        if (a>0){
            System.out.println("The number is positive");
        }
        else if(a<0){
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is zero");
        }

    }
}
class Question4 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        a=scanner.nextInt();
        if (a%5==0&&a%11==0){
            System.out.println("The number is divisible by both 5 and 11");
        }
        else{
            System.out.println("The numbers arent divisible by 5 and 11");
        }
    }
}
class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = scanner.nextInt();
        if (a%2==0){
            System.out.println("The number is even.");
        }
        else {
            System.out.println("Thr number is odd.");
        }
    }
}
class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        if ((year%100!=0)&&(year%4==0)||(year%400==0)){
            System.out.println("It is a leap year.");
        }
        else{
            System.out.println("It is not a leap year.");
        }
    }
}

class Question7Method1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char s = scanner.next().charAt(0);

        if(Character.isAlphabetic(s)){
            System.out.println("The number is a alphabet");
        }

        else{
            System.out.println("It is not a alphabet");
        }
    }
}
//jdk lai alphabet ra digit feed garko huncha
class Question7Method2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character.");
        char ch = scanner.next().charAt(0);//at 0 indicates first character

        if ((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
            System.out.println(ch+" is a alphabet.");
        }
        else {
            System.out.println(ch+" is not a alphabet.");
        }

    }
}

class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character.");
        char ch = scanner.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}
class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character: ");
        char c = scanner.next().charAt(0);

        if(Character.isAlphabetic(c)){
            System.out.println("The character is a alphabet.");
        }

        else if(Character.isDigit(c)){
            System.out.println("The character is a digit.");
        }

        else {
            System.out.println("The character is a special character.");
        }

    }
}

class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char s = scanner.next().charAt(0);

        if(Character.isUpperCase(s)){
            System.out.println("The character is upper case");

        }
        else if (Character.isLowerCase(s)){
            System.out.println("The character is lower case");
        }
    }
}
class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = null
                ;
        System.out.print("Enter a number form 1 to 7 to get the respective weekday: ");
        int i = scanner.nextInt();

        if (i==1){
            day="Sunday";
        }
        else if (i==2){
            day="Monday";
        }
        else if (i==3){
            day="Tuesday";
        }
        else if (i==4){
            day="Wednesday";
        }
        else if (i==5){
            day="Thursday";
        }
        else if (i==6){
            day="Friday";
        }
        else if (i==7){
            day="Saturday";
        }
        else{
            System.out.println("Enter the correct value");
        }
        System.out.printf("It is %s.%n", day);
    }
}


class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String monthName = null;
        int day=0;
        System.out.println("Enter the year:: ");
        int year=scanner.nextInt();

        System.out.println("Enter the number from 1 to 12 for respective month to print the days in the specific month: ");
        int month = scanner.nextInt();

        if(month==1){
           monthName="Janauary";
           day=31;
        }
        else if(month==2){
            monthName="february";
            if((year%400==0)||(year%4==0)&&(year%100!=0)){
               day=29;
            }
            else{
                day=28;
            }
        }
        else if(month==3){
            monthName="march";
            day=31;
        }
        else if(month==4){
            day=30;
            monthName="april";
        }
        else if(month==5){
            day=31;
            monthName="May";
        }
        else if(month==6){
            day=30;
            monthName="June";
        }
        else if(month==7){
            day=31;
            monthName="July";
        }
        else if(month==8){
            day=31;
            monthName="August";
        }

        else if(month==9){
            day=30;
            monthName="September";
        }
        else if(month==10){
            day=31;
            monthName="October";
        }
        else if(month==11){
            day=30;
            monthName="November";
        }
        else if(month==12){
            day=31;
            monthName="December";
        }
        System.out.printf("The month %s has %d days.", monthName, day);
    }
}

class Question13 {
    public static void main(String[] args) {
        int val , amt;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of each note: ");
        val = scanner.nextInt();

        System.out.print("Enter the total amount: ");
        amt= scanner.nextInt();

        if(val==5)
    }
}
class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the degree of first angle: ");
        int a = scanner.nextInt();

        System.out.println("Enter the degree of second angle: ");
        int b = scanner.nextInt();

        System.out.println("Enter the degree of third angle: ");
        int c = scanner.nextInt();

        if ((a+b>c)||(a+c>b)||(b+c>a)){
            System.out.println("The triangle is valid");
        }
        else {
            System.out.println("The triangle is invalid");
        }

    }
}

class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the degree of first angle: ");
        int a = scanner.nextInt();

        System.out.println("Enter the degree of second angle: ");
        int b = scanner.nextInt();

        System.out.println("Enter the degree of third angle: ");
        int c = scanner.nextInt();

        if ((a+b>c)||(a+c>b)&&(b+c>a)){
            System.out.println("The triangle is valid");
        }
        else {
            System.out.println("The triangle is invalid");
        }

    }
}
class Question16 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the angle of the first angle of triangle: ");
        a= scanner.nextInt();

        System.out.println("The angle of second angle of triangle: ");
        b= scanner.nextInt();

        System.out.println("The angle of third angle of triangle: ");
        c=scanner.nextInt();

        if(a==b&&b==c){
            System.out.println("It is a equivalent triangle.");
        }
        else if(a==b||a==c||b==c){
            System.out.println("It is a isosceles triangle.");
        }
        else {
            System.out.println("It is a scalene triangle.");
        }
    }
}
class Question17{
    public static void main(String[] args) {
        double a,b,c;
        double root1,root2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of A:: ");
        a=scanner.nextDouble();
        System.out.print("Enter the value of b:: ");
        b=scanner.nextDouble();
        System.out.print("Enter the value of c:: ");
        c=scanner.nextDouble();

        double determinant=b*b-4*a*c;

        if(determinant>0){
            //two real and distinct roots
            root1=(-b+Math.sqrt(determinant))/(2*a);
            root2=(-b-Math.sqrt(determinant))/(2*a);
            System.out.format("root1=%2f and root2=%2f",root1,root2);
        }
        else if(determinant==0){
            //real and equal roots
            root1=root2=-b/(2*a);
            System.out.format("root1=root2=%2f",root1);
        }
        else{
            //roots are complex and distinct
            double real = -b/(2*a);
            double imaginary=Math.sqrt(-determinant)/(2*a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);


            System.out.format("root1=%2f+%2f",real,imaginary);
            System.out.format("\nroot2=%2f");
        }
    }
}
class Question18 {
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
class Question19 {
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
class Question20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double HRA ,DA ,gross ;

        System.out.print("Enter the salary: ");
        double salary = scanner.nextInt();

        if(salary<=10000){
            HRA=salary*20/100;
            DA=salary*80/100;
            gross=salary+HRA+DA;
            System.out.println("Your gross salary is "+gross+".");

        }
        else if(salary<=20000){
            HRA=salary*25/100;
            DA=salary*90/100;
            gross=salary+HRA+DA;
            System.out.println("Your gross salary is "+gross+".");
        }
        else if(salary>20000){
            HRA=salary*30/100;
            DA=salary*95/100;
            gross=salary+HRA+DA;
            System.out.println("Your gross salary is "+gross+".");
        }
        
    }
}

class Question21 {
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



