package org.conversor;

import org.conversor.models.MenuItem;
import org.conversor.ui.Menu;

import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Menu frame;

    public static void main(String[] args) {
        List<MenuItem> menuItems = new LinkedList<>();

        menuItems.add(new MenuItem(1, "USD", "MXN"));
        menuItems.add(new MenuItem(2, "MXN", "USD"));
        menuItems.add(new MenuItem(3, "USD", "COP"));
        menuItems.add(new MenuItem(4, "COP", "USD"));

        Menu menu = new Menu(menuItems);

        menu.showMenu();
    }
}