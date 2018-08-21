package ru.job4j.Profession;

/**
 * Profession.
 * Профессии.
 *
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 20.08.2018
 */

public class Profession {

    /**
     * сожержит имя
     */
    public String name;

    /**
     * содержит профессию
     */
    public String profession;

    public Profession(){

    }

    public Profession(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    /**
     * Возвращает имя.
     *
     * @param
     * @return
     */
    public String getName() {
        return this.name;
    }
    public String getProfession(){
        return this.profession;
    }

}
