import java.util.Scanner;

public class TypeOfWeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the website url ");
        String url =sc.nextLine();
        String protocol =url.substring(0, url.indexOf(":"));
        if(protocol.equals("http")){
            System.out.println("hypertext transfer protocol");
        }
            else if (protocol.equals("ftp")){
            System.out.println("File transfer protocol");
        }
          String  ext  = url.substring(url.lastIndexOf(".")+1);
        switch (ext) {
            case "com" -> System.out.println("commercial website");
            case "org" -> System.out.println("organisation");
            case "net" -> System.out.println("Network");
        }
    }
}
