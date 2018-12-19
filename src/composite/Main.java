package composite;

import composite.menu.Menu;
import composite.menu.MenuComponent;
import composite.menu.MenuItem;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        MenuComponent mainMenu = new Menu();
        mainMenu.addItem(new MenuItem("item 1",100));
        mainMenu.addItem(new MenuItem("item 2",300));
        mainMenu.addItem(new MenuItem("item 3",200));


        Iterator iterator = mainMenu.createIterator();
        while (iterator.hasNext()){
            System.out.println(((MenuComponent)iterator.next()).getName());
        }

    }
}
