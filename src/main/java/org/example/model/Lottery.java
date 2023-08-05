package org.example.model;

import org.example.model.Toy;
import org.example.model.ToysForLottery;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Math.min;
public class Lottery {
    private final ArrayList<String> toysWin = new ArrayList<>();

    // Разыгрываем призы
    public Lottery(int count, ToysForLottery toysForLottery) {
        for (int i = 0; i < count; i++) {
            Toy currentToy = toysForLottery.poll();
            toysWin.add(currentToy.getName());
        }
    }

    public void winToysList(String filePath) {
        try {
            FileWriter w = new FileWriter(filePath, true);
            w.write("\n  Разыгранные игрушки:\n=========================");
            for (int i = 0; i < toysWin.size(); i++) {
                w.write("\n " + (i + 1) + ". " + toysWin.get(i));
            }
            w.write("\n\n");
            w.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл!");
            return;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n  Разыгранные игрушки:\n=========================");
        for (int i = 0; i < toysWin.size(); i++) {
            sb.append("\n ").append(i + 1).append(". ").append(toysWin.get(i));
        }
        return sb.toString();
    }
}
