package org.example.ui.commands;
import org.example.ui.Console;

public class ExitMenu extends Command implements Options{

    public ExitMenu(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Завершить работу";
    }

    @Override
    public void run() {
        System.exit(0);

    }
}