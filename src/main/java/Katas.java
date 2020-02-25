import java.util.Scanner;

public class Katas {

    public static void hello(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Katas.hello();
    }

}


