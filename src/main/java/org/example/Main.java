package org.example;

import org.example.model.Toy;
import org.example.model.ToyShop;
//import org.example.model.Toy;
//import org.example.model.ToyShop;
import org.example.presenter.Presenter;
import org.example.ui.Console;
import org.example.ui.View;

public class Main {
    public static void main(String[] args) {

        View view = new Console();
        ToyShop toyShop = new ToyShop();
        new Presenter(view, toyShop);

        Toy toy1 = new Toy(1,"Конструктор", 20);
        Toy toy2 = new Toy(2, "Робот", 20);
        Toy toy3 = new Toy(3, "Кукла", 60);

        toyShop.add(toy1);
        toyShop.add(toy2);
        toyShop.add(toy3);

        view.start();

    }
}