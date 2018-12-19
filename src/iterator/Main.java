package iterator;

import iterator.array.ArrayCollection;
import iterator.list.ListCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayCollection arrayCollection = new ArrayCollection(new int[]{1, 2, 3, 4, 5, 6});
        Iterator iteratorArray = arrayCollection.createIterator();

        ListCollection listCollection = new ListCollection(Arrays.asList(new String[]{"11", "22", "33"}));
        Iterator iteratorList = listCollection.createIterator();

        ArrayList<Iterator> iterators = new ArrayList<>();
        iterators.add(iteratorArray);
        iterators.add(iteratorList);

        for (Iterator i : iterators) {
            while (i.hasNext()) {
                System.out.println(i.next());
            }
        }
    }
}
