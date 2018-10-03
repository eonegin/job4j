package ru.job4j.tracker;

import ru.job4j.tracker.models.Item;
import ru.job4j.tracker.start.ConsoleInput;
import ru.job4j.tracker.start.Input;
import ru.job4j.tracker.start.Tracker;

public class StartUI {

    private String desc;

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }

    private static final String ADD = "0";
    private static final String SHOWALL = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FINDID = "4";
    private static final String FINDNAME = "5";
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
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
    public StartUI(ConsoleInput input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void showMenu() {
        System.out.println("0. Создание новой заявки\n" +
                "1. Показать все заявки\n" +
                "2. Редактировать заявку\n" +
                "3. Удалить заявку\n" +
                "4. Найти заявку по Id\n" +
                "5. Найти заявку по name\n" +
                "6. Выход\n");
    }


    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню: ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (FINDID.equals(answer)) {
                this.findItemById();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        String create = this.input.ask("Введите время создания заявки :");
        Item item = new Item(name, desc, 13414);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с Id : " + item.getId() + " " + "----------- \n");
    }

    private void findItemById() {
        System.out.println("------------ Поиск заявки по Id --------------");
        String id = this.input.ask("Введите Id заявки: ");
        Item item = this.tracker.findById(id);
        System.out.println("Имя: " + item.getName());
        System.out.println("Описание: " + item.getDescription());
        System.out.println("Время создания: " + item.getCreate() + "\n");
    }
}

