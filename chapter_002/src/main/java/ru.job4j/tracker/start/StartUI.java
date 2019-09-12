package ru.job4j.tracker.start;

import java.util.ArrayList;
import java.util.List;

public class StartUI {
    private String desc;

    public static void main(String[] args) {
        new StartUI(new ValidateInput(), new Tracker()).init();

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
        int[] ranges = new int[]{0, 1, 2, 3, 4, 5};
        menu.fillActions();


        for (int i = 0; i < menu.getActionsLentgh(); i++) {
            range.add(i);
        }
        //for (int i = 0; i < range.size(); i++){
          //  ranges[i] = i;
        //}

        do {
            menu.show();
            menu.select(input.ask("select:", ranges));
        } while (!"y".equals(this.input.ask("Exit?(y): ")));
    }
}


