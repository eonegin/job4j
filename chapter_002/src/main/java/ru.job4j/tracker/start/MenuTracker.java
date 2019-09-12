package ru.job4j.tracker.start;

import ru.job4j.tracker.models.Item;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;


public class MenuTracker {
    //
    private Input input;
    private Tracker tracker;
    private List<UserAction> actions = new ArrayList<>();

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }


    public void fillActions() {
        this.actions.add(new AddItem());
        this.actions.add(new ShowItems());
        this.actions.add(new MenuTracker.EditItem());
        this.actions.add(new MenuTracker.DeleteItem());
        this.actions.add(new findItemById());
        this.actions.add(new findItemByName());


    }


    public void select(int key) {
        this.actions.get((key)).execute(this.input, this.tracker);
    }


    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    public int getActionsLentgh() {
        return this.actions.size();

    }


    //добавление новой заявки
    private static class AddItem implements UserAction {
        @Override
        public int key() {
            return 0;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Добавление новой заявки --------------");
            String name = input.ask("Введите имя заявки :");
            String desc = input.ask("Введите описание заявки :");
            long create = Long.parseLong(input.ask("Введите время создания заявки :"));
            Item item = new Item(name, desc, create);
            tracker.add(item);
            System.out.println("------------ Новая заявка с Id : " + item.getId() + " " + "-----------");
            System.lineSeparator();

        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Add new item");
        }
    }

    //просмотр всех заявок
    private static class ShowItems implements UserAction {
        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Просмотр всех заявок --------------");
            Item[] result = tracker.findAll();
            for (int i = 0; i < result.length; i++) {
                String.format("Имя: " + result[i].getName() + " " + "Описание: " + result[i].getDescription() + " " + "Время создания: " + result[i].getCreate());
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Show all items");
        }
    }

    //редактирование заявки
    private static class EditItem implements UserAction {
        @Override
        public int key() {
            return 2;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Редактирование заявки --------------");
            String itemId = input.ask("Введите id заявки :");
            String newName = input.ask("Введите новое имя заявки :");
            String newDesc = input.ask("Введите новое описание заявки :");
            long newCreate = Long.parseLong(input.ask("Введите новое время создания заявки :"));
            Item item = new Item(newName, newDesc, newCreate);
            boolean result = tracker.replace(itemId, item);
            if (result) {
                System.out.println("Имя заявки с Id: " + itemId + " заменено на: " + newName);
                System.out.println("Описание заявки с Id: " + itemId + " заменено на: " + newDesc);
                System.out.println("Время создания заявки с Id: " + itemId + " заменено на: " + newCreate);
            } else

            {
                System.out.println("Редактирование не удалось");
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Edit item");
        }

    }


    //удаление заявки
    private static class DeleteItem implements UserAction {
        @Override
        public int key() {
            return 3;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Удаление заявки --------------");
            System.lineSeparator();
            String itemId = input.ask("Введите id заявки :");
            boolean result = tracker.delete(itemId);
            if (result) {
                System.out.println("Заявка с id = " + itemId + " удалена");
            } else {
                System.out.println("Заявка с id = " + itemId + "не удалена");
            }
            System.lineSeparator();
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Delete item");
        }
    }

    //поиск заявки по id
    private static class findItemById implements UserAction {
        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Поиск заявки по Id --------------");
            String id = input.ask("Введите Id заявки: ");
            Item item = tracker.findById(id);
            if (item == null) {
                System.out.println("Заявки не существует");
            } else {
                System.out.println("Имя: " + item.getName());
                System.out.println("Описание: " + item.getDescription());
                System.out.println("Время создания: " + item.getCreate());
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by id");
        }
    }

    //поиск по имени
    private class findItemByName implements UserAction {
        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Поиск заявки по имени --------------");
            String name = input.ask("Введите имя заявки: ");
            Item[] item = tracker.findByName(name);
            for (Item i : item) {
                if (i.getName().equals(name)) {
                    System.out.println("Id: " + i.getId());
                    System.out.println("Описание: " + i.getDescription());
                    System.out.println("Время создания: " + i.getCreate());
                    System.lineSeparator();
                }
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by name");
        }
    }

}

