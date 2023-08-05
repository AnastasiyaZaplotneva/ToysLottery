package org.example.ui.commands;
import org.example.ui.Console;
import org.example.ui.Console;

public class AddToy extends Command implements Options{

    private Console console;
    public AddToy(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавить игрушку в магазин";
    }

    @Override
    public void run() {
        getConsole().add();

    }
}