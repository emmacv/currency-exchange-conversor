package org.conversor.ui;

import org.conversor.models.MenuItem;

import java.util.List;
import java.util.Scanner;

public class Menu {


    private List<MenuItem> items;
    private Scanner stdin = new Scanner(System.in);


    public Menu(List<MenuItem> items) {
        this.items = items;
        System.out.println("<<<<<<<<<<<<<< Currency Converter >>>>>>>>>>>>>>");
    }

    public int showMenu() {
        System.out.println();
        System.out.println("0. Exit");
        items.forEach(System.out::println);
        System.out.print("Your option is: ");
        int option = stdin.nextInt();

        if (option == 0)
            System.out.println("Goodbye!");
        else if (option < 0 || option > items.size()) {
            System.out.println("Invalid option. Try again.");
            option = -1;
        }

        return option;
    }
}
