package composite.iterators;

import composite.menu.MenuComponent;

import java.util.Iterator;

public interface Iterable {
    Iterator<MenuComponent> createIterator();
}
