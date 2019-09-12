package ru.job4j.tracker.start;

public interface Input {
    public String ask(String question);
    int ask(String question, int[] range);
}
