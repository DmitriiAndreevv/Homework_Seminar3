import java.util.ArrayList;
import java.util.Collections;


public class Task3 {

    public static void main(String[] args) {
        ArrayList<Integer> even = new ArrayList<>();
        even.add(10);
        even.add(4);
        even.add(5);
        even.add(6);
        even.add(7);
        even.add(2);
        even.add(2);
        even.add(9);
        System.out.println(even);

        int j = 0;
        for (Integer integer : even) {
            if (integer % 2 == 0) {
                even.add(integer);
            }
        }
        Collections.sort(even);
        for (int i = 0; i < even.size(); i++) {
            if (even.get(i) % 2 == 0) {
                even.set(i, even.get(j));
                j++;
            }
        }
        System.out.println(even);


    }
}
