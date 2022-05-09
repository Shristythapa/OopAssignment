
//Write a program to print following :
//i)
//**********
//**********
//**********
//**********
class pone {
    public static void main(String[] args) {
        for (int i=1; i<=4; i++){
            for (int j=1; j<=10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//ii)
//*
//**
//***
//****
//*****
class ptwo{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//iii)
//    *
//   **
//  ***
// ****
//*****
class pthree{
    public static void main(String[] args) {
        for(int i =1; i<=5;i++){
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//iv)
//    *
//   ***
//  *****
// *******
//*********
class pfour{
    public static void main(String[] args) {
        for (int i=1; i<=5;i++){
            for (int j=i; j<=5;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=1; j<i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
//v)
//   1
//  222
// 33333
// 4444444
//555555555
class pfive{
    public static void main(String[] args) {
        for (int i=1; i<=5;i++){
            for (int j=i; j<=5;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            for (int j=1; j<i;j++){
                System.out.print(i);
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
//vi)
//    1
//   212
//  32123
// 4321234
//54321234
class psix{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for (int j=i;j<=5;j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1;j--){
                System.out.print(j);
            }
            for (int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}