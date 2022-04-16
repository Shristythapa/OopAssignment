import javax.swing.*;

class Qn1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"Enter your name: ");
        String batch_no = JOptionPane.showInputDialog(null,"Enter you batch number: ");
        String address = JOptionPane.showInputDialog(null,"Enter your address: ");
        JOptionPane.showMessageDialog(null,"Name: "+name+"\nBatch no: "+batch_no+"\nAddress: "+address);

    }
}
class Qn2{
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"enter the first number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"enter the second number: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null,"enter the third number: "));
        int d = Integer.parseInt(JOptionPane.showInputDialog(null,"enter the fourth number: "));
        int sum =a+b+c+d;
        JOptionPane.showMessageDialog(null,"The sum is "+sum+".");

    }
}
class Qn3{
    public static void main(String[] args) {
        float first = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter your percentage in first sub: "));
        float second = Float.parseFloat(JOptionPane.showInputDialog(null,"Second sub: "));
        float third = Float.parseFloat(JOptionPane.showInputDialog(null,"Third sub: "));
        float fourth = Float.parseFloat(JOptionPane.showInputDialog(null,"Fourth sub: "));
        float total_marks = first+second+third+fourth;
        float percentage = total_marks/4;
        JOptionPane.showMessageDialog(null,"Your total marks is "+total_marks+" and total percentage is "+percentage+".");
    }
}
class  Qn4{
    public static void main(String[] args) {

    int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the first number: "));
    int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the second number: "));
    int sum = a+b;
    int product = a*b;
    JOptionPane.showMessageDialog(null,"Sum: "+sum+"\nProduct: "+product);

    }
}
class Qn5{
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the first number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the second number: "));
        int sum = a+b;
        int product = a*b;
        JOptionPane.showMessageDialog(null,"Sum: "+sum+"\nProduct: "+product);
    }
}
class Qn6{
    public static void main(String[] args) {
    Double length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length: "));
    Double breadth = Double.parseDouble(JOptionPane.showInputDialog("Enter the breadth: "));
    double area = length*breadth;
    int i_area=(int) area;
    JOptionPane.showMessageDialog(null,"The area of the rectangle is "+i_area+".");

    }
}
class Qn7{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        String roll = JOptionPane.showInputDialog("Enter your roll no: ");
        String field_int = JOptionPane.showInputDialog("Enter your fields of interest: ");
        JOptionPane.showMessageDialog(null,"Hey, my name is "+name+" and my roll no is "+roll+"."+"My field of interest are "+field_int+"." );
    }
}
class Qn8A{
    public static void main(String[] args) {
        float length = Float.parseFloat(JOptionPane.showInputDialog("Enter the length of the sides of the square "));
        float area = length*length;
        float perimeter = 4*length;
        JOptionPane.showMessageDialog(null,"Area: "+area+"\nPerimeter: "+perimeter);
    }
}
class  Qn8B{
    public static void main(String[] args) {

    int p = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the principle: "));
    int t = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the time: "));
    float r = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the rate: "));
    float si = (p*t*r)/100;
    JOptionPane.showMessageDialog(null,"The Simple Interest is "+si);
    }
}
class Qn8C{
    public static void main(String[] args) {
     float length = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the length of the triangle "));
     float breadth = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the breadth of the triangle "));
     float area = (length*breadth)*1/2;
     JOptionPane.showMessageDialog(null,"The area of triangle is "+area+".");
    }
}
class Qn8d{
    public static void main(String[] args) {
        float length = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the length of the sides of cube: "));
        float volume = length*length*length;
        JOptionPane.showMessageDialog(null,"The volume of cube is "+volume+".");
    }
}
class  Qn8e{
    public static void main(String[] args) {
        float length = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the length of cuboid: "));
        float breadth = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the breadth of the cuboid: "));
        float height = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the height of the cuboid: "));
        float volume = length*breadth*height;
        JOptionPane.showMessageDialog(null,"The volume of cuboid is "+volume+".");
    }
}
class Qn9{
    public static void main(String[] args) {
        float num=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the number you want the square of: "));
        float square = num*num;
        JOptionPane.showMessageDialog(null,"The square of "+num+" is "+square+".");
    }
}
class  Qn10{
    public static void main(String[] args) {
        String first = JOptionPane.showInputDialog(null, "Enter the first string: ");
        String second = JOptionPane.showInputDialog(null, "Enter the second string: ");
        JOptionPane.showMessageDialog(null, first + " " + second);
    }
}
class Qn11{
    public static void main(String[] args) {
        Float a= Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the first number: "));
        Float b= Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the second number: "));
        Float c= Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the third number: "));
        String result= (a==b&&b==c)?"All the numbers are equal!!":(a==b)?"First and second number are equal!!":(a==c)?"First and third number are equal!!":(b==c)?"Second and third number are equal!!":"All numbers are different!!";
        JOptionPane.showMessageDialog(null,"Answer: "+result);
    }
}
class Qn12{
    public static void main(String[] args) {
        Float a= Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the first num: "));
        Float b= Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the second num: "));
        String result = (a<50&&a<b)?"Both condition are true!!":"Both condition are not true!!";
        JOptionPane.showMessageDialog(null,"Answer: "+result);
    }
}
class Qn13{
    public static void main(String[] args) {
        float first =Float.parseFloat(JOptionPane.showInputDialog(null,"Hey Robort!!\nEnter your percentage in first sub: "));
        float second = Float.parseFloat(JOptionPane.showInputDialog(null,"Second sub: "));
        float third = Float.parseFloat(JOptionPane.showInputDialog(null,"Third sub: "));
        float total_marks=first+second+third;
        float percentage=total_marks/3;
        JOptionPane.showMessageDialog(null,"Total marks: "+total_marks+"\nPercentage: "+percentage);
    }
}