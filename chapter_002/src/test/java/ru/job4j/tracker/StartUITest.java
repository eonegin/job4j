package ru.job4j.tracker;

import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.tracker.models.Item;
import ru.job4j.tracker.start.Input;
import ru.job4j.tracker.start.StartUI;
import ru.job4j.tracker.start.StubInput;
import ru.job4j.tracker.start.Tracker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * StartUITest.
 * Тестирует действия пользователя.
 *
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 18.10.2018
 */

public class StartUITest {
    String sepor = System.lineSeparator();

    private String toString(StringBuilder info) {
        String menu = String.format("0. Создание новой заявки%s1. Показать все заявки%s2. Редактировать заявку%s3. Удалить заявку%s4. Найти заявку по Id%s5. Найти заявку по name%s6. Выход%s",
                sepor, sepor, sepor, sepor, sepor, sepor, sepor, sepor, sepor);
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(menu)
                .append(info)
                .append(menu).toString();
    }

    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();


    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "test desc", "2", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    @Test
    public void whenUserSearchAllItems() {
        Tracker tracker = new Tracker();
        //Добавляем заявки
        Item item = tracker.add(new Item("1", "1", 1));
        Item item2 = tracker.add(new Item("2", "2", 2));
        Item item3 = tracker.add(new Item("3", "3", 3));
        //Выбираем действия
        Input input = new StubInput(new String[]{"1", "6"});
        StringBuilder result = new StringBuilder();
        result.append(String.format("Имя: 1 Описание: 1 Время создания: 1" + sepor))
                .append(String.format("Имя: 2 Описание: 2 Время создания: 2" + sepor))
                .append(String.format("Имя: 3 Описание: 3 Время создания: 3" + sepor))
                .append(String.format("Время создания: 1" + sepor))
                .toString();
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc", 12));
        Input input = new StubInput(new String[]{"2", item.getId(), "replace", "replace", "12345", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("replace"));
        assertThat(tracker.findById(item.getId()).getName(), is("replace"));
    }

    @Test
    public void whenUserDeleteItemThenTracker() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Item item = tracker.add(new Item("first", "desc", 1));
        Item item2 = tracker.add(new Item("second", "desc", 2));
        Item item3 = tracker.add(new Item("third", "desc", 3));
        Input input = new StubInput(new String[]{"3", item2.getId(), "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[1].getName(), is("third"));
        assertThat(tracker.findAll().length, is(2));
    }

    @Test
    public void whenUserSearchItemById() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("1", "1", 1));
        Item item2 = tracker.add(new Item("2", "2", 2));
        Item item3 = tracker.add(new Item("3", "3", 3));
        Input input = new StubInput(new String[]{"4", item.getId(), "6"});
        StringBuilder result = new StringBuilder();
        result.append(String.format("------------ Поиск заявки по Id --------------" + sepor))
                .append(String.format("Имя: 1" + sepor))
                .append(String.format("Описание: 1" + sepor))
                .append(String.format("Время создания: 1" + sepor))
                .toString();
        new StartUI(input, tracker).init();
        assertThat(new String(this.out.toByteArray()), Is.is(this.toString(result)));
    }

    @Test
    public void whenUserSearchItemByName() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("1", "1", 1));
        Item item2 = tracker.add(new Item("2", "2", 2));
        Item item3 = tracker.add(new Item("3", "3", 3));
        Input input = new StubInput(new String[]{"5", item.getName(), "6"});
        StringBuilder result = new StringBuilder();
        result.append(String.format("------------ Поиск заявки по имени --------------" + sepor))
                .append(String.format("Id: " + item.getId()) + sepor)
                .append(String.format("Описание: 1" + sepor))
                .append(String.format("Время создания: 1" + sepor))
                .toString();
        new StartUI(input, tracker).init();
        assertThat(new String(this.out.toByteArray()), Is.is(this.toString(result)));
    }
}


