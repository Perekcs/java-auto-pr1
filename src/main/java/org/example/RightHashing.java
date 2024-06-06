package org.example;

import java.util.Objects;

public class RightHashing {

    private final int key;
    private final String name;

    public RightHashing(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        RightHashing that = (RightHashing) o;
        return key == that.key && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, name);
    }

    @Override
    public String toString() {
        return "CorrectKey: key=" + key + ", name='" + name + "'";
    }
}

