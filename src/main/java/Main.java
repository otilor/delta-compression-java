import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int [] data = {25626, 25757, 24367, 24267, 16, 100, 2, 7277};
        System.out.println(delta(data));
    }


    public static ArrayList<Integer> delta(int[] array) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(array[0]);

        for (int i=1; i < array.length; i++) {
            res.add(array[i] - array[i-1]);
        }

        return res;
    }
}
