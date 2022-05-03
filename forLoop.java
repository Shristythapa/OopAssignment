import java.util.Scanner;

//wap to print the first 10 multiples of 2
class one {
    public static void main(String[] args) {
        for (int i = 2;i<=20;i+=2){
            System.out.println(i);
        }
    }
}
//WAP to take your name and age as user input and print it 5 times.
class two{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age:: ");
        String age = scanner.nextLine();
        for (int i = 1 ; i<=5 ; i++){
            System.out.println("My name is "+name+". I am "+age+" Years old.");
        }

    }
}
//3.	WAP to take the initialization and condition for the for loop and print the even numbers present in between it.

class three{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial even number:: ");
        int is = scanner.nextInt();

        System.out.print("Enter the end number in condition:: ");
        int num = scanner.nextInt();
        if(is%2!=0){
            is=is+1;
        }

        for(int i=is; i<=num; i+=2){
            System.out.println(i);
        }
    }
}
//4.	WAP to take the initialization and condition for the for loop and print the sum of all the even numbers present in between it.
class four{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial number:: ");
        int is = scanner.nextInt();

        System.out.print("Enter the end number of the sum:: ");
        int ends = scanner.nextInt();

         int sum=0;

        for (int i=is;i<=ends;i++){
            sum+=i;

        }
        System.out.print("The sum is "+sum+".");
    }
}