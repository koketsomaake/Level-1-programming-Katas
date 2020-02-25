import java.util.Scanner;

public class Triangle {
    public void Triangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number");
             int max= input.nextInt();

        for (int i = 0; i <max; i++)

        {
            System.out.println();

            for(int j=0;j<=i;j++)
            {
                System.out.print("#");
            }
        }

    }
    public static void main(String[] args) {
        Triangle trg = new Triangle();
        trg.Triangle();
    }
}
