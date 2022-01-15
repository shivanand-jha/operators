import java.util.Scanner;

public class GPSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the starting point of number");
        int a = sc.nextInt();
        System.out.println("enter the number till GP get printed ");
        int n= sc.nextInt();
        System.out.println("enter the basic difference for AP");
        int d= sc.nextInt();
        for (int i = a ; i < n; i=i*d) {
            System.out.println(i);
        }
    }
}
