package ru.job4j.tracker.models;

/**
 * ArrayChar.
 * Обертка над строкой.
 *
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class Item {

    /**
     * Содержит id сущности
     */
    private String id;

    /**
     * Содержит имя сущности
     */
    private String name;

    /**
     * Содержит описание сущности
     */
    private String description;

    /**
     * Содержит время создания сущности
     */
    private long create;

    /**
     * Конструктор дефолтный.
     */
    public Item() {
    }

    /**
     * Конструктор инициализации.
     */
    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    /**
     * Возвращает имя.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Возвращает описание.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Возвращает время создания.
     */
    public long getCreate() {
        return this.create;
    }

    /**
     * Возвращает id.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Устанавливает id.
     */
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreate(long create) {
        this.create = create;
    }
}
