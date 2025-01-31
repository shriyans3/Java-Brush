package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Office {
    @Id
    private String name;
    private String location;
    private int floors;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Office{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", floors='" + floors + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
