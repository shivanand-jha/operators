import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev;
        while (n>0){
            rev= n%10;
            n /=10;
            System.out.print(rev);
        }
    }
}
