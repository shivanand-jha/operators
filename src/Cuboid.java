import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        int length, breadth, height;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length,breadth,height");
        length = sc.nextInt();
        breadth=sc.nextInt();
        height =sc.nextInt();
        float vol ,TotalArea;
        vol = length*breadth*height;
        TotalArea = 2*(length*breadth+breadth*height+length*height);
        System.out.println("volume and TotalArea : "+vol+" "+TotalArea);
    }

}
