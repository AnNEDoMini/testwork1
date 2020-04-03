import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

    public static void main (String[] args) {
        //Just stub list
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        ArrayList<LinkedList<Integer>> result = filterList(list);
        System.out.println("Result lists: " + result);
    }

    private static ArrayList<LinkedList<Integer>> filterList(LinkedList<Integer> inputList) {
        System.out.println("Input list: " + inputList); // 1,2,3,4,5,6,7,8,9

        LinkedList<Integer> evenList = new LinkedList<>();
        LinkedList<Integer> oddList = new LinkedList<>();

        //filtering
        inputList.forEach((i) -> {
            if(i % 2 == 0)
                evenList.addFirst(i);
            else
                oddList.addFirst(i);
        });

        ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>() {{ // cant create generic arrays -> ArrayList
            add(oddList);
            add(evenList);
        }};
        return result;
    }
}
