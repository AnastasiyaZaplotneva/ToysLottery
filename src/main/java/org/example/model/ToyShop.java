package org.example.model;
import org.example.model.Toy;

import java.util.ArrayList;

public class ToyShop {
    private ArrayList<Toy> toys;

    public ToyShop(){
        toys = new ArrayList<Toy>();
    }

    public void add(Toy toy){
        toys.add(toy);
    }

    public ArrayList<Toy> getToys() {
        return toys;
    }

    public void changeFrequency(int id, int frequency) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setFrequency(frequency);
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nСписок игрушек:\n");
        for (Toy toy : this.toys) {
            sb.append("\t").append(toy.getId()).append(". ").append(toy.getName()).append(", ")
                    .append(toy.getFrequency()).append("\n");
        }
        return sb.toString();
    }

}
