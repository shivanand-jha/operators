import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        int a=0 ,b=1,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        System.out.print(a+","+b+",");
        for (int i = 0; i < n-2; i++) {
            c =a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}
