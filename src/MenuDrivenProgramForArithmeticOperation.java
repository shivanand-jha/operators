import java.util.Locale;
import java.util.Scanner;

public class MenuDrivenProgramForArithmeticOperation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("Add");
        System.out.println("Sub");
        System.out.println("Mul");
        System.out.println("Div");
        System.out.println("Enter two numbers");
        int x =sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("enter option in words");
        String str = sc.nextLine();
        str = str.toUpperCase(Locale.ROOT);
        switch (str){
            case "ADD" -> System.out.println("The sum is : "+(x+y));
            case "SUB" -> System.out.println("The subtraction is : "+(x-y));
            case "MUL" -> System.out.println("The multiplication is : "+(x*y));
            case "DIV" -> System.out.println("The Division is : "+(x/y));
            default -> System.out.println("nothing");

        }
    }

}
