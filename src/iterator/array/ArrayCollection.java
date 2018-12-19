package iterator.array;

import iterator.Iterators;

import java.util.Iterator;

public class ArrayCollection implements Iterators {
    private int array[];

    public ArrayCollection(int[] array) {
        this.array = array;
    }


    @Override
    public Iterator createIterator() {
        return new ArrayIterator(array);
    }
}
