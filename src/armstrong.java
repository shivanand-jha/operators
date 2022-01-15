import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 ;
        int m = n;
        while(n>0) {
            int r = n % 10;
            sum = sum + r * r * r;
            n /=10;
        }
        if (sum == m){
                System.out.println(m+" is an armstrong number");
            }
        else System.out.println(m+" is not armstrong number");
        }
    }

