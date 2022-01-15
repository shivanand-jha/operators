import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev =0 , m=n;
        while (n>0){
            rev= rev*10+ n%10;
            n /=10;
        }
        if(rev == m){
            System.out.println("number is palindrome");
        }else System.out.println("number is not palindrome");
    }
}
