import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        Iterator<Integer> iter = intList.iterator();

        while(iter.hasNext()){
            int x = iter.next();
            if (x <= 0 || x % 2 != 0)
                iter.remove();
        }

        Collections.sort(intList, Comparator.naturalOrder());

        for (int x: intList)
            System.out.printf("%d " ,x);
    }
}
