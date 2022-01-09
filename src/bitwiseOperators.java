import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class bitwiseOperators {
    public static void main(String[] args) {
        int a,b,and,or,exor,lsft,rsft,not;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        and =a&b;
        or =a|b;
        exor=a^b;
        not = ~a;
        lsft =a<<2;
        rsft =a<<3;
        System.out.println("All bitwise operation "+and+" "+or+" "+exor+" "+lsft+" "+rsft);
        System.out.println("not opertion of a "+not);
    }
}
