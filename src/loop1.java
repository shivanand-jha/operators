public class loop1 {
    public static void main(String[] args) {
        no();
        no1();
        digr();
    }

    public static void no(){
        int i =1 ,n = 100;
        while (i<n){
            System.out.println(i);
            i *=2;
        }
    }
    public static void no1() {
        int i1 = 1, n1 = 20;

        do {
            System.out.println(i1);
            i1 *= 2;
        } while (i1 < n1);
    }
    public static void digr(){
        int a= 25;
        while (a>0){
            int r = a%10;
            a /=10;
            System.out.println(r+" "+a);
        }
    }
}
