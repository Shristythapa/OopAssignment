import java.util.Scanner;

class QnOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you full name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your batch no: ");
        String batch = scanner.nextLine();
        System.out.println("Enter your address: ");
        String address = scanner.nextLine();
        System.out.println("Enter you age: ");
        int age = scanner.nextInt();
        System.out.println("Name: "+name+"\nBatch no: "+batch+"\nAddress: "+address+"\nAge: "+age);
    }
}

class QnTwo {
    public static void main(String[] args) {
        int a , b , c , d , sum;
        System.out.println("Enter any four number: ");
        Scanner scanner= new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        d=scanner.nextInt();
        sum= a+b+c+d;
        System.out.println("Your sum is "+sum+".");
    }
}
class QnThree{
    public static void main(String[] args) {
        float first, second, third, fourth, total;
        System.out.println("Enter you percentage in all four subjects: ");
        Scanner scanner= new Scanner(System.in);
        first=scanner.nextFloat();
        second=scanner.nextFloat();
        third=scanner.nextFloat();
        fourth=scanner.nextFloat();
        total=(first+second+third+fourth)/4;
        String result;
        result = ((total>70)&&(total<100))?"First class":((total>59)&&(total<70))?"Upper Second Class":((total>49)&&(total<59))?"Second Class":((total>39)&&(total<49))?"Third class":"Fail";
        System.out.println("Total Percentage: "+total+"\nDivision: "+result);


    }
}

class QnFour{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a, b, sum;
        System.out.println("Enter the two number you want the sum of: ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        sum=a+b;
        System.out.println("Your sum is "+sum);
    }
}
class QnFive{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a, b, sum, product;
        System.out.println("Enter the two number you want the sum of: ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        sum=a+b;
        product=a*b;
        System.out.println("Your sum is "+sum);
        System.out.println("Your product is "+product);
    }
}
class  QnSix{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double length, breadth;
        System.out.println("Enter the length and breadth in double: ");
        length=scanner.nextDouble();
        breadth=scanner.nextDouble();
        int ll= (int) length;
        int bb = (int) breadth;
        int area = ll*bb;
        System.out.println("The area is "+area);
    }
}
class QnSeven{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your roll number: ");
        int roll = scanner.nextInt();
        System.out.println("Enter your field of interest: ");
        String field_int = scanner.nextLine();
        System.out.println("My name is "+name+"."+"My roll number is "+roll+"."+"My field of interest are "+field_int+".");


    }
}
class QnEightA{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the square: ");
        float length = scanner.nextInt();
        float area = length*length;
        float perimeter = 4*length;
        System.out.println("The area and perimeter of square are "+area+" and "+perimeter+" respectively." );
    }
}
class QnEightB{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p , t;
        float r, si;
        System.out.println("Enter the principle: ");
        p=scanner.nextInt();
        System.out.println("Enter the time: ");
        t=scanner.nextInt();
        System.out.println("Enter the rate: ");
        r=scanner.nextFloat();
        si=(p*t*r)/100;
        System.out.println("The simple interest is "+si);

    }
}
class QnEightC{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float b,h,area;
        System.out.println("Enter the breadth of the triangle: ");
        b=scanner.nextFloat();
        System.out.println("Enter the height of the triangle: ");
        h=scanner.nextFloat();
        area = (b*h)*1/2;
        System.out.println("The area of triangle is "+area+".");
    }
}
class  QnEightD{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float l, area;
        System.out.println("Enter the length of cube: ");
        l=scanner.nextFloat();
        area=l*l*l;
        System.out.println("The area of the cube is "+area+".");
    }
}
class QnEightE{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float l, b, h, area;
        System.out.println("Enter the length of cuboid: ");
        l=scanner.nextFloat();
        System.out.println("Enter the breadth of cuboid: ");
        b=scanner.nextFloat();
        System.out.println("Enter the height of cuboid: ");
        h=scanner.nextFloat();
        area=l*b*h;
        System.out.println("The area of cuboid is "+area+".");
    }
}
class  QnNine{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num,square;
        System.out.println("Enter the number you want the square of: ");
        num=scanner.nextFloat();
        square=num*num;
        System.out.println("The square of "+num+" is "+square+".");
    }
}
class QnTen{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first, second;
        System.out.println("Enter the first string: ");
        first=scanner.nextLine();
        System.out.println("Enter the second string: ");
        second=scanner.nextLine();
        System.out.println(first+" "+second);
    }
}
class QnEleven{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter the first number");
        a=scanner.nextFloat();
        System.out.println("Enter the second number");
        b=scanner.nextFloat();
        System.out.println("Enter the third number");
        c=scanner.nextFloat();
        String result= (a==b&&b==c)?"All the numbers are equal!!":(a==b)?"First and second number are equal!!":(a==c)?"First and third number are equal!!":(b==c)?"Second and third number are equal!!":"All numbers are different!!";
        System.out.println(result);
    }
}
class  QnTwelve{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b;
        System.out.println("Enter the first number");
        a=scanner.nextFloat();
        System.out.println("Enter the second number");
        b=scanner.nextFloat();
        String result = (a<50&&a<b)?"Both condition are true!!":"Both condition are not true!!";
        System.out.println(result);
    }
}
class QnThirteen{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Robert!!");
        System.out.println("Enter your marks in all subject.");
        System.out.println("First sub: ");
        float first = scanner.nextFloat();
        System.out.println("Second sub: ");
        float second = scanner.nextFloat();
        System.out.println("Third sub: ");
        float third = scanner.nextFloat();
        float total_marks = first + second + third ;
        float percentage = total_marks/3;
        System.out.println("Your total marks is "+total_marks+".\nPercentage is "+percentage+".");
    }
}
