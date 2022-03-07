import java.util.Scanner;

public class codeChef {


        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new  Scanner(System.in);
            int t=sc.nextInt();
            while(t>0)
            {
                int s=sc.nextInt();
                int v=sc.nextInt();
                int x=21-s-v;
                if(x>=0 && x<=10)
                    System.out.println(x);
                else
                    System.out.println("-1");
                t--;
            }
        }
    }


