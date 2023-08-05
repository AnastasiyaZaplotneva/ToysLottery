package org.example.model;
import org.example.model.Toy;
import org.example.model.ToyShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
public class ToysForLottery {
    private final Queue<Toy> lotteryToys = new LinkedList<>();

    // Перечень игрушек для розыгрыша, учитывающий частоту
    public ToysForLottery(ToyShop toyShop) {
        ArrayList<Toy> toysForLottery = new ArrayList<>();
        for (Toy toy : toyShop.getToys()) {
            for (int i = 0; i < toy.getFrequency(); i++) {
                toysForLottery.add(toy);
            }
        }
        Collections.shuffle(toysForLottery);
        lotteryToys.addAll(toysForLottery);
    }

    public int size() {
        return lotteryToys.size();
    }

    public Toy poll() {
        return lotteryToys.poll();
    }
}
