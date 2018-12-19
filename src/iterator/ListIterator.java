package iterator;

import java.util.Iterator;
import java.util.List;

public class ListIterator implements Iterator {
    private List<String> list;
    private int position = 0;

    public ListIterator(List<String> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (position<= list.size()-1){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (position> list.size()-1){
            throw new ArrayIndexOutOfBoundsException();
        }

        return list.get(position++);
    }

    @Override
    public void remove() {

    }
}
