package iterator.array;

import java.util.Iterator;

public class ArrayIterator implements Iterator {
    private int[] array;
    private int position = 0;

    public ArrayIterator(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (position<=array.length-1){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (position>array.length-1){
            throw new ArrayIndexOutOfBoundsException();
        }

        return array[position++];
    }

    @Override
    public void remove() {

    }
}
