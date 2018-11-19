package ru.job4j.tracker.start;

import ru.job4j.tracker.models.Item;


public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[7];

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }



    public void fillActions() {
        this.actions[0] = new MenuTracker.AddItem();
        this.actions[1] = new MenuTracker.ShowItems();
        this.actions[2] = new MenuTracker.EditItem();
    }


    public void select(int key) {
        UserAction.execute(this.input, this.tracker);
    }

    /*/просмотр
    public void show() {
        for (UserAction:actions) {
            if (actions != null) {

            }
            System.out.println(actions());
        }
    }*/


    //добавление новой заявки
    private static class AddItem implements UserAction {
        public int key() {
            return 0;
        }

        private void execute(Input input, Tracker tracker) {
            System.out.println("------------ Добавление новой заявки --------------");
            String name = input.ask("Введите имя заявки :");
            String desc = input.ask("Введите описание заявки :");
            long create = Long.parseLong(input.ask("Введите время создания заявки :"));
            Item item = new Item(name, desc, create);
            tracker.add(item);
            System.out.println("------------ Новая заявка с Id : " + item.getId() + " " + "-----------");
            System.lineSeparator();

        }

        public String info() {
            return String.format("%s. %s", this.key(), "Add the new item");
        }
    }

    //просмотр всех заявок
    private static class ShowItems implements UserAction {
        public int key() {
            return 1;
        }

        private void execute(Input input, Tracker tracker) {
            System.out.println("------------ Просмотр всех заявок --------------");
            Item[] result = tracker.findAll();
            for (int i = 0; i < result.length; i++) {
                String.format("Имя: " + result[i].getName() + " " + "Описание: " + result[i].getDescription() + " " + "Время создания: " + result[i].getCreate());
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Show all items");
        }
    }

    private static class EditItem implements UserAction {
        public int key() {
            return 2;
        }

        private void execute(Input input, Tracker tracker) {
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

        public String info() {
            return String.format("%s. %s", this.key(), "Edit item");
        }

    }
}
