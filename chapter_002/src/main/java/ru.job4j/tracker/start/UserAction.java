package ru.job4j.tracker.start;

public interface UserAction {
    int key();
    static void execute(Input input, Tracker tracker) { }
    String info();
}

