package composite.menu;

import composite.iterators.MenuIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
    private ArrayList<MenuComponent> menuComponents;

    public Menu() {
        this.menuComponents = new ArrayList<>();
    }

    @Override
    public   void addItem(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public String getName() {
        return "Top level menu";
    }

    @Override
    public int getPrice() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator createIterator() {
        return new MenuIterator(menuComponents);
    }
}
