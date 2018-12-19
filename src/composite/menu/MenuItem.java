package composite.menu;


import composite.iterators.NullIterator;

import java.util.Iterator;

public class MenuItem extends MenuComponent {

    private String name;
    private int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public  void addItem(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator(this);
    }
}
