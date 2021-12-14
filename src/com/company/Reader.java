package com.company;

public class Reader {
    private String name, city;

    public Reader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String toString() {
        return " Imię: " + name  +
                " |" + " Miasto: " + city;
    }

}