import java.util.Scanner;

public class Isosceles{

    public void IsoscelesTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number greater than 1 to print isosceles triangle");
        int max = input.nextInt();
         for(int i = 0; i< max;i++) {
             for (int j = 2; j >=i ; --j) {
                 System.out.print(" ");
             }
                 for (int k =1; k <=(2*i);k++){
                     System.out.print("#");
                 }
             System.out.println("#");

         }
         }
    public static void main(String[] args) {
        Isosceles iso = new Isosceles();
        iso.IsoscelesTriangle();

    }
}

