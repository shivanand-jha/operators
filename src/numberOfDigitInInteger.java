import java.util.Scanner;

public class numberOfDigitInInteger {
    public static void main(String[] args) {
        int  count =0 , n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n!=0){
            n /= 10;
            ++count;
        }
        System.out.println(count);
    }

}
