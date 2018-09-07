package ru.job4j.Tracker.Models;

public class Bug extends Item {

    /**
     * Конструктор дефолтный.
     */
    public Bug() {

    }

    /**
     * Конструктор инициализации.
     */
    public Bug(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }
}

