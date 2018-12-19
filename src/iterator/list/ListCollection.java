package iterator.list;

import iterator.ListIterator;
import iterator.Iterators;

import java.util.Iterator;
import java.util.List;

public class ListCollection implements Iterators {
    private List<String> list;

    public ListCollection(List<String> list) {
        this.list = list;
    }


    @Override
    public Iterator createIterator() {
        return new ListIterator(list);
    }
}
