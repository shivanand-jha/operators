import java.util.Scanner;
import java.util.SortedMap;

public class Quadratic_Equation {
    public static void main(String[] args)
    {
        int a,b,c;
        double r1,r2;
        System.out.println("enter the value of a,b,c");
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b =sc.nextInt();
        c =sc.nextInt();
        r1 =(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        r2 =(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("roots are :"+r1+"\n"+r2);
    }
}
