package com.linan.thymeleaf.pojo;

public class Hero {
    private int id;
    private int hp;
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    @Override
    public String toString() {
        return "Hero [" + id + ", name=" + name + ", hp=" + hp + "]";
    }
}
