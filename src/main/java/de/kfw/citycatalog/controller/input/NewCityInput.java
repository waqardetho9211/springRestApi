package de.kfw.citycatalog.controller.input;

import java.util.Objects;

public class NewCityInput {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewCityInput that = (NewCityInput) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "{\"NewCityInput\":{"
                + "\"name\":\"" + name + "\""
                + "}}";
    }
}
