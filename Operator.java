class QnOne {
    public static void main(String[] args){
        int age=19;
        String result;
        result=(age>=18)? "You can vote!!" : "You cant vote";
        System.out.println(result);
    }
}
class QnTwoB{
    public static void main(String[] args){
        int b=5;
        int h=10;
        float area;
        area=(b*h)*1/2;
        System.out.println(area);
    }
}
class QnTwoC{
    public static void main(String[] args){
        int l=5;
        int area;
        area=l*l*l;
        System.out.println(area);
    }
}
class QnTwoA{
    public static void main(String[] args){
        int p = 40000;
        int t = 120;
        int r = 5;
        float SI;
        SI=p*t*r/100;
        System.out.println(SI);
    }
}
class QnThree {
    public static void main(String[] args){
        int age=19;
        String result;
        result=(age>=18)? "You can vote!!" : "You cant vote";
        System.out.println(result);
    }
}
class QnFour{
    public static void main (String[] args){
        int firstSub= 70;
        int secondSub = 85;
        int thirdSub = 90;
        int fourthSub = 65;
        float total;
        String result;
        total=(firstSub+secondSub+thirdSub+fourthSub)/4;
        System.out.println(total);
        if(total>=70){
            System.out.println("First Class");
        }
        else if(total>59){
            System.out.println("Upper Second Class");
        }
        else if(total>49){
            System.out.println("Second Class");
        }
        else if(total>39){
            System.out.println("Third Class");
        }
        else{
            System.out.println("Fail!!");
        }
    }
}
class TernaryFour{
    public static void main(String[] args){
        int firstSub= 70;
        int secondSub = 85;
        int thirdSub = 90;
        int fourthSub = 65;
        float total;
        total=(firstSub+secondSub+thirdSub+fourthSub)/4;
        String result;
        result = ((total>70)&&(total<100))?"First class":((total>59)&&(total<70))?"Upper Second Class":((total>49)&&(total<59))?"Second Class":((total>39)&&(total<49))?"Third class":"Fail";
        System.out.println(result);
    }
}