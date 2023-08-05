package org.example.ui;
import org.example.model.Toy;
import org.example.presenter.Presenter;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Console implements View{

    private Presenter presenter;
    private Scanner scanner;
    private Boolean Flag;
    private Menu menu;

    private Validator validator = new Validator();

    public Console() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter=presenter;
    }

    @Override
    public void start() {
        menu = new Menu(this);
        Flag = true;
        while (Flag) {
            System.out.println("Выберите действие из списка: ");
            System.out.println(menu.printMenu());
            Integer choice = scanner.nextInt();
            if (validator.checkInput(choice, menu.menuSize())) {
                menu.run(choice);
            } else {
                System.out.println("Необходимо ввести корректные данные");
            }
        }

    }

    public void print(){
        System.out.println(presenter.print());
    }

    public void add(){
        System.out.println("\nВведите название игрушки:");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("\nВведите вес игрушки:");
        int frequency = parseInt(scanner.nextLine());
        Counter id = new Counter();
        Toy newToy = new Toy(id.getId(), name, frequency);
        presenter.addToy(newToy);
    }

    public void frequency(){
        scanner.nextLine();
        System.out.println("\nВведите id игрушки, вес которой хотите изменить:");
        int id = parseInt(scanner.nextLine());
        System.out.println("\nВведите вес игрушки:");
        int frequency = parseInt(scanner.nextLine());
        presenter.Frequency(id, frequency);

    }

    public void runLottery(){
        scanner.nextLine();
        System.out.println("\nВведите количество игрушек, которое хотите разыграть:");
        int number = parseInt(scanner.nextLine());
        presenter.runLottery(number);
        System.out.println("\nРезультаты розыгрыша записаны в файл");
    }
}
