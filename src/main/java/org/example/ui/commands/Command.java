package org.example.ui.commands;
import org.example.ui.Console;

public class Command {
    private Console console;

    public Command(Console console) {
        this.console = console;
    }

    public Console getConsole() {
        return console;
    }

}