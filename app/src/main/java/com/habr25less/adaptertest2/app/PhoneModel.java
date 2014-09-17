package com.habr25less.adaptertest2.app;

/**
 * Created by Sovan on 15.09.2014.
 */
public class PhoneModel {
    private String name;
    private long id, number;

    public PhoneModel(String name, long id, long number) {
        this.name = name;
        this.id = id;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return id + ". " + name + "\n" + number;
    }
}
