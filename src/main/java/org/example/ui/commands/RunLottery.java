package org.example.ui.commands;
import org.example.ui.Console;

public class RunLottery extends Command implements Options {

    private Console console;
    public RunLottery(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Устроить розыгрыш призов";
    }

    @Override
    public void run() {
        getConsole().runLottery();

    }
}