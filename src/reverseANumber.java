import java.util.Scanner;

public class reverseANumber {
    public static void main(String[] args) {
        int n , rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n =sc.nextInt();
        System.out.println("original number"+n);
        while (n!=0){
            int digit = n%10;
            rev = rev*10 +digit;
            n /=10;
        }
        System.out.println("reversed number"+rev);
    }
}
