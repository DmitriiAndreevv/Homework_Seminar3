import java.util.ArrayList;
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> Arrlist1 = new ArrayList<>();
        ArrayList<Integer> ArrList2 = new ArrayList<>();
        Arrlist1.add(1);
        Arrlist1.add(2);
        Arrlist1.add(1);
        Arrlist1.add(1);
        System.out.println(Arrlist1);
        ArrList2.add(1);
        ArrList2.add(2);
        ArrList2.add(1);
        ArrList2.add(2);
        System.out.println(ArrList2);
        System.out.println(equals(Arrlist1, ArrList2));
    }
    private static boolean equals(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() == list2.size()) {
            int j = 0;
            for (int i = 0; i < list1.size(); i++) {
                while (j < list2.size()) {
                    if (list1.get(i) != list2.get(j)) {
                        return false;
                    } else {
                        j += 1;
                        break;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}