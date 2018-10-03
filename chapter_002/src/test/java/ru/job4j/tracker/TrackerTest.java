package ru.job4j.tracker;


import org.junit.jupiter.api.Test;
import ru.job4j.tracker.models.Item;
import ru.job4j.tracker.start.Tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    @Test
    public void whenReplaceItem() {

        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription2", 1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
        assertThat(tracker.findById(previous.getId()).getDescription(), is("testDescription2"));
        assertThat(tracker.findById(previous.getId()).getCreate(), is(1234L));

    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription1", 123L);
        // Добавляем первую заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(first);
        Item second = new Item("test2", "testDescription2", 1234L);
        // Добавляем вторую заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(second);
        Item third = new Item("test3", "testDescription3", 12345L);
        // Добавляем третью заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(third);


        tracker.delete(second.getId());
        assertThat(tracker.findById(first.getId()).getName(), is(first.getName()));
        assertThat(tracker.findById(first.getId()).getDescription(), is(first.getDescription()));
        assertThat(tracker.findById(first.getId()).getCreate(), is(first.getCreate()));
        assertThat(tracker.findById(third.getId()).getName(), is("test3"));
        assertThat(tracker.findById(third.getId()).getDescription(), is("testDescription3"));
        assertThat(tracker.findById(third.getId()).getCreate(), is(12345L));
        assertThat((tracker.findAll()).length, is(2));

    }

    /*@Test
    public void whenReturnArrayWithoutNull() {
        tracker tracker = new tracker();

        Item first = new Item("test1", "testDescription1", 123L);
        // Добавляем первую заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(first);

        Item second = new Item();
        // Добавляем вторую заявку в трекер c name = null. Теперь в объект проинициализирован id.
        //tracker.add(second);

        Item third = new Item("test3", "testDescription3", 12345L);
        // Добавляем третью заявку в трекер c description = null. Теперь в объект проинициализирован id.
        tracker.add(third);

        tracker.findAll();
        assertThat(tracker.findAll().length, is(3));
        assertThat(tracker.findById(first.getId()).getName(), is("test1"));    */
    }

