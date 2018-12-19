package composite.iterators;

import composite.menu.MenuComponent;
import composite.menu.MenuItem;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {

    public NullIterator(MenuItem menuItem) {

    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException();
    }

    @Override
    public MenuComponent next()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
