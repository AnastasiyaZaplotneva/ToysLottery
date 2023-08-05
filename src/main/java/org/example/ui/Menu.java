package org.example.ui;
import org.example.ui.commands.*;

import java.util.ArrayList;
import java.util.List;


public class Menu {
    private List<Options> commands;
    private Console console;

    public Menu(Console console) {
        this.console = console;
        commands = new ArrayList<Options>();
        commands.add(new AllToys(console));
        commands.add(new AddToy(console));
        commands.add(new Frequency(console));
        commands.add(new RunLottery(console));
        commands.add(new ExitMenu(console));
    }

    void run(int num) {
        Options option = commands.get(num - 1);
        option.run();
    }
    public String printMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("***************************\n");
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(": ");
            stringBuilder.append(commands.get(i).description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public Integer menuSize(){
        return commands.size();
    }
}
