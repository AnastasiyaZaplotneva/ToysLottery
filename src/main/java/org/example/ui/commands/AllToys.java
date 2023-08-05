package org.example.ui.commands;
import org.example.ui.Console;

public class AllToys extends Command implements Options {

    private Console console;
    public AllToys(Console console) {
        super(console);
    }
    @Override
    public String description() {
        return "Показать список игрушек";
    }

    @Override
    public void run() {
        getConsole().print();

    }
}
