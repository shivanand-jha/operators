import java.util.Scanner;

public class pattern
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of terms :");
        int n = sc.nextInt();
        int count=0;
//        for (int i = 0; i <=n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print(j+"  ");
//            }
//            System.out.println();
//        }
//        5
//        1  2  3  4  5
//        1  2  3  4  5
//        1  2  3  4  5
//        1  2  3  4  5
//        1  2  3  4  5
//        1  2  3  4  5
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print(i+"  ");
//            }
//            System.out.println();
//     }
//        1  1  1  1  1
//        2  2  2  2  2
//        3  3  3  3  3
//        4  4  4  4  4
//        5  5  5  5  5
//        for (int i = 1; i <=n; i++) {
//
//            for (int j = 1; j <= n; j++) {
//                ++count;
//                System.out.format("%02d  ",count);
//            }
//            System.out.println();
//        }
//        5
//        01  02  03  04  05
//        06  07  08  09  10
//        11  12  13  14  15
//        16  17  18  19  20
//        21  22  23  24  25
//        for (int i = 1; i <=n; i++) {
//
//            for (int j = 1; j <= i; j++) {
//
//                System.out.format(j+"  ");
//            }
//            System.out.println();
//        }
//        1
//        1  2
//        1  2  3
//        1  2  3  4
//        1  2  3  4  5
//
//        for (int i = 1; i <=n; i++) {
//
//            for (int j = 1; j <= i; j++) {
//                ++count;
//                System.out.format("%02d  ",count);
//            }
//            System.out.println();
//        }
//        5
//        01
//        02  03
//        04  05  06
//        07  08  09  10
//        11  12  13  14  15
//        for (int i = 1; i <=n; i++) {
//
//            for (int j = 1; j <= i; j++) {
//
//                System.out.format(" * ");
//            }
//            System.out.println();
//        }
// *
// *  *
// *  *  *
// *  *  *  *
// *  *  *  *  *
//        for (int i = 1; i <=n; i++) {
//
//            for (int j =1; j <=n-i+1; j++) {
//
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        *  *  *  *  *
//        *  *  *  *
//        *  *  *
//        *  *
////      *
    }
}
