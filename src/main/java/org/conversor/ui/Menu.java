package org.conversor.ui;

import org.conversor.models.MenuItem;

import java.util.List;
import java.util.Scanner;

public class Menu {

    private int option;
    private List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        this.items = items;
        init();
    }
    private void init() {
        System.out.println("<<<<<<<<<<<<<< Currency Converter >>>>>>>>>>>>>>");

        items.forEach(System.out::println);
    }

    public void showMenu() {
        Scanner stdin = new Scanner(System.in);

        do {
            System.out.println("Your option is: ");
            option = stdin.nextInt();

            if (option == 0) continue;

            System.out.println("How much? ");
            float amount = stdin.nextFloat();


        } while (option != 0);

        System.out.println("Good bye!");
    }
}
