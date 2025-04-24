
import java.util.ArrayList;
import java.util.Collections;

class Sort{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(9);
        list.add(1);
        Collections.sort(list);
        System.out.println(list);
    }
}