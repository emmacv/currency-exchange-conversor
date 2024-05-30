package org.conversor;

import org.conversor.api.CurrencyConvertor;
import org.conversor.models.MenuItem;
import org.conversor.ui.Menu;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Menu frame;

    public static void main(String[] args) {
        List<MenuItem> menuItems = new LinkedList<>();
        Scanner stdin = new Scanner(System.in);

        menuItems.add(new MenuItem(1, "USD", "MXN"));
        menuItems.add(new MenuItem(2, "MXN", "USD"));
        menuItems.add(new MenuItem(3, "USD", "COP"));
        menuItems.add(new MenuItem(4, "COP", "USD"));

        Menu menu = new Menu(menuItems);

        do {
            int option = menu.showMenu();
            if (option == 0) break;
            if (option == -1) continue;

            System.out.println("How much? ");
            float amount = stdin.nextFloat();
            MenuItem pair = menuItems.get(option - 1);

            CurrencyConvertor.convertCurrencies(pair.from(), pair.to(), amount);
        } while(true);
    }
}