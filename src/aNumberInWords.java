import java.util.Scanner;

public class aNumberInWords {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int rev =0 ;
       String str ="";
       while (n>0){
           rev = n%10;
           n /=10;
           str = str+rev;//convert the reverse number into string

       }
        System.out.println(str);
       char c ;
        for (int i = str.length()-1; i>=0; i--) {
            c =str.charAt(i);//convert string into character
            switch (c)//use of switch for printing number in words
            {
                case '0' -> System.out.print("Zero ");
                case '1' -> System.out.print("One ");
                case '2' -> System.out.print("Two ");
                case '3' -> System.out.print("Three ");
                case '4' -> System.out.print("Four ");
                case '5' -> System.out.print("Five ");
                case '6' -> System.out.print("Six ");
                case '7' -> System.out.print("Seven ");
                case '8' -> System.out.print("Eight ");
                case '9' -> System.out.print("Nine ");
            }
        }
    }
}
