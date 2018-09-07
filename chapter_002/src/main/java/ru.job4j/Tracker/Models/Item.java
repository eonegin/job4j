package ru.job4j.Tracker.Models;

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
    public String name;

    /**
     * Содержит описание сущности
     */
    public String description;

    /**
     * Содержит время создания сущности
     */
    public long create;

    /**
     * Конструктор дефолтный.
     */
    public Item(){

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
    public String getId(){
        return this.id;
    }

    /**
     * Устанавливает id.
     */
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
}
