package org.example;

public class Toy implements Comparable<Toy>{
    private int id;
    private String name;
    private int value;

    public Toy(int id, String name, int value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Toy o) {
        return this.id - o.getId();
    }
}
