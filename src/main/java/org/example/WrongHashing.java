package org.example;

public class WrongHashing {
    private final int key;
    private final String name;

    public WrongHashing(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 12345;
    }

    @Override
    public String toString() {
        return "WrongHashing: key=" + key + ", name='" + name + "'";
    }
}

