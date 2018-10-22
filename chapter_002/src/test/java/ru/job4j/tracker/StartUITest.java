package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.models.Item;
import ru.job4j.tracker.start.*;

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

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "test desc", "2", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item("test name", "desc", 12));
        //создаём StubInput с последовательностью действий(производим замену заявки)
        Input input = new StubInput(new String[]{"2", item.getId(), "replace", "replace", "12345", "6"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
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
}
