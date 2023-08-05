package org.example.model;
public class Toy {
    private int id;
    private String name;
    private int frequency;

    public Toy(int id, String name, int frequency){
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public Integer getFrequency(){
        return this.frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString(){
        return "Название: " + getName() + ", частота выпадения: " + getFrequency();
    }
}
