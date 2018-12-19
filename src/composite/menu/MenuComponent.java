package composite.menu;

import composite.iterators.Iterable;

public abstract class MenuComponent implements Iterable {
    abstract public void addItem(MenuComponent menuComponent);
    abstract public String getName();
    abstract public int getPrice();
}
