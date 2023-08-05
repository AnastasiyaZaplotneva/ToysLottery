package org.example.ui.commands;
import org.example.ui.Console;

public class Frequency extends Command implements Options{

    private Console console;
    public Frequency(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Изменить частоту выпадения игрушки";
    }

    @Override
    public void run() {
        getConsole().frequency();
    }
}