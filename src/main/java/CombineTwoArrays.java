import java.lang.reflect.Array;
import java.util.ArrayList;

public class CombineTwoArrays {
    public static void TwoArrays(){
        int [] Array1 = {11,12,13};
        int [] Array2 = {1,2,3};
        ArrayList<Integer> ints = new ArrayList<>();

        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < 1; j++) {

                ints.add(Array1[i]);
                ints.add(Array2[i]);

            }

        }
        System.out.println(ints);
    }

    public static void main(String[] args) {

        CombineTwoArrays.TwoArrays();

    }
}
