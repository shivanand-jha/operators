import java.util.Scanner;

public class switchDayNumber {
    public static void main(String[] args) {
        System.out.println("enter the number");
        //day1 = monday
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() % 8;

//        if(n==1){
//            System.out.println("mon");
//        }
//        else if (n==2){
//            System.out.println("tues");
//        }
//        else if (n==3){
//            System.out.println("wed");
//        }
//        else if (n==4){
//            System.out.println("thursday");
//        }
//        else if (n==5){
//            System.out.println("Friday");
//        }
//        else if (n==6){
//            System.out.println("Saturday");
//        }
//        else if (n==7){
//            System.out.println("Sunday");
//        }
//        else {
//            System.out.println("invalid number");
        switch (n) {
            case 1 -> System.out.println("mon");
            case 2 -> System.out.println("tues");
            case 3 -> System.out.println("Wed");
            case 4 -> System.out.println("Thurs");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

        }
    }
}
