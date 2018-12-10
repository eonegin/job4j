package ru.job4j.tracker.start;


import ru.job4j.tracker.models.Item;

import java.util.Arrays;
import java.util.Random;

/**
 * tracker.
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
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                item.setId(id);
                items[i] = item;
                result = true;
                break;
            }
        }
        return result;
    }


    /**
     * Удаляет ячейку и смещает значения справа от нее влево.
     *
     * @param id
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                int numElts = items.length - (i + 1);
                System.arraycopy(items, i + 1, items, i, numElts);
                position--;
                result = true;
                break;
            }
        }
        return result;
    }


    public Item[] findAll() {
        return Arrays.copyOf(this.items, position);

    }

    public Item[] findByName(String name) {
        Item[] result = new Item[position];
        int j = 0;
        for (int i = 0; i < position; i++) {
            if (items[i].getName().equals(name)) {
                result[j++] = items[i];
            }
        }
        return Arrays.copyOf(result, j);

    }


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

    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
}