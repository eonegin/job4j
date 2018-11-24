package ru.job4j.tracker.start;

import ru.job4j.tracker.models.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartUI {

    private String desc;

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }


    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * Основой цикл программы.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        List<Integer> range = new ArrayList<>();
        menu.fillActions();
        for (int i = 0; i < menu.getActionsLentgh(); i++) {
            range.add(i);
        do {
            menu.show();
            menu.select(input.ask("Select: "));
        } while (!"y".equals(this.input.ask("Exit?(y): ")));
        }
    }
}

