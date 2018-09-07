package ru.job4j.Tracker.Start;


import ru.job4j.Tracker.Models.*;

import java.util.Random;

/**
 * Tracker.
 * Хранилище заявок.
 *
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 28.08.2018
 */

public class Tracker {

    /**
     * items.
     * Содержит массив длинной 100 элементов
     */
    private final Item[] items = new Item[100];

    /**
     * position.
     * Содержит позицию
     */
    private int position = 0;

    /**
     * RN.
     * Генерирует рандомное число
     */
    private static final Random RN = new Random();


    /**
     * Добавляет заявку.
     *
     * @param item
     * @return возвращает заявку со сгенерированным id.
     */

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Меняет имя заявки.
     *
     * @param item
     */
    public void replace(String id, Item item) {
        findById(id).setName(item.getName());

    }

    /**
     * Удаляет ячейку и смещает значения справа от нее влево.
     *
     * @param id
     */
    public void delete(String id) {
        //Содержит name заданной строки
        String deleteElId = findById(id).getName();
        //Перебираем значения items
        for (int i = 0; i < items.length - 1; i++)
            //Ищем совпадение элемента массива с заданной строкой
            if (items[i].name.equals(deleteElId)) {
                //Смещаем элементы влево
                System.arraycopy(items, i, items, 0, 2);
            }


    }


    public Item[] getAll() {
        Item[] result = new Item[position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;

    }

    /*public Item[] findByName(String key) {

    }*/


    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
}