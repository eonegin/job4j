package ru.job4j.Tracker.Models;

public class Task extends Item {


    /**
     * Конструктор дефолтный.
     */
    public Task() {

    }

    /**
     * Конструктор инициализации.
     */
    public Task(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

}


