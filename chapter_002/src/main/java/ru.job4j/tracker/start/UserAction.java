package ru.job4j.tracker.start;

public interface UserAction {
    int key();

    public void execute(Input input, Tracker tracker);

    String info();
}

