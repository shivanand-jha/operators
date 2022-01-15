import java.util.Scanner;

public class APSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number till AP get printed ");
        int n= sc.nextInt();
        System.out.println("enter the basic difference for AP");
        int d= sc.nextInt();
        for (int i = 1; i < n; i=i+d) {
            System.out.println(i);
        }
    }
}
