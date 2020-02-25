import com.sun.imageio.plugins.jpeg.JPEGImageWriterSpi;

import java.util.Scanner;

public class DrawSquare {

    public void square(){

        Scanner user = new Scanner(System.in);
        System.out.println("enter number");
        int num = user.nextInt();


        for(int i=0; i<num;i++) {


        for (int y = 0; y <num; y++)

         System.out.print("# ");

            System.out.println();

            }

        }
    public static void main(String[] args) {

        DrawSquare sqr = new DrawSquare();
        sqr.square();
    }

    }

