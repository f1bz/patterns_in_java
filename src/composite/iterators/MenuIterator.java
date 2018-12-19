package composite.iterators;

import composite.menu.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuIterator implements Iterator<MenuComponent> {

    //Stack implementation can be added in order to iterate tree of components

    private ArrayList<MenuComponent> menuComponents;
    public MenuIterator(ArrayList<MenuComponent> menuComponents) {
        this.menuComponents = menuComponents;
    }

    int position=0;

    @Override
    public boolean hasNext()
    {
        return (menuComponents != null && menuComponents.size() > 0 && position<menuComponents.size());
    }

    @Override
    public MenuComponent next() {
        if (position>=menuComponents.size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return menuComponents.get(position++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
