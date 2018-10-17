package ru.job4j.tracker.start;

import ru.job4j.tracker.models.Item;

import java.util.Arrays;

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
        System.out.println("0. Создание новой заявки");
        System.lineSeparator();
        System.out.println("1. Показать все заявки");
        System.lineSeparator();
        System.out.println("2. Редактировать заявку");
        System.lineSeparator();
        System.out.println("3. Удалить заявку");
        System.lineSeparator();
        System.out.println("4. Найти заявку по Id");
        System.lineSeparator();
        System.out.println("5. Найти заявку по name");
        System.lineSeparator();
        System.out.println("6. Выход");
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
            } else if (SHOWALL.equals(answer)) {
                this.showAllItem();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FINDID.equals(answer)) {
                this.findItemById();
            } else if (FINDNAME.equals(answer)) {
                this.findItemByName();
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
        System.out.println("------------ Новая заявка с Id : " + item.getId() + " " + "-----------");
        System.lineSeparator();
    }

    private void showAllItem() {
        System.out.println("------------ Просмотр всех заявок --------------");
        Item[] result = tracker.findAll();
        System.out.println(Arrays.toString(result));
    }

    private void editItem() {
        System.out.println("------------ Редактирование заявки --------------");
        String itemId = this.input.ask("Введите id заявки :");
        String newName = this.input.ask("Введите новое имя заявки :");
        boolean result = tracker.replace(itemId, tracker.findById(itemId));
        if (result) {
            System.out.println("Имя заявки с Id: " + itemId + " заменено на: " + newName);
        } else {
            System.out.println("Редактирование не удалось");
        }
    }

    private void deleteItem() {
        System.out.println("------------ Удаление заявки --------------");
        System.lineSeparator();
        String itemId = this.input.ask("Введите id заявки :");
        boolean result = tracker.delete(itemId);
        if (result) {
            System.out.println("Заявка с id = " + itemId + " удалена");
        } else {
            System.out.println("Заявка с id = " + itemId + "не удалена");
        }
        System.lineSeparator();
    }

    private void findItemById() {
        System.out.println("------------ Поиск заявки по Id --------------");
        String id = this.input.ask("Введите Id заявки: ");
        Item item = this.tracker.findById(id);
        if (item == null) {
            System.out.println("Заявки не существует");
        } else {
            System.out.println("Имя: " + item.getName());
            System.out.println("Описание: " + item.getDescription());
            System.out.println("Время создания: " + item.getCreate());
        }

    }

    private void findItemByName() {
        System.out.println("------------ Поиск заявки по имени --------------");
        String name = this.input.ask("Введите имя заявки: ");
        Item[] item = this.tracker.findByName(name);
        for (Item i : item) {
            if (i.getName().equals(name)) {
                System.out.println("Id: " + i.getId());
                System.out.println("Описание: " + i.getDescription());
                System.out.println("Время создания: " + i.getCreate());
                System.lineSeparator();
            }
        }
    }
}

