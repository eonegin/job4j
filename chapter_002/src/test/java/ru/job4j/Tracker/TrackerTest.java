package ru.job4j.Tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.Tracker.Models.Item;
import ru.job4j.Tracker.Start.Tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.getAll()[0], is(item));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {

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
    }
    @Test
    public void whenDeleteItem(){
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

        tracker.delete(first.getId());
        assertThat(tracker.findById(first.getId()).getName(), is(second.getName()));
        assertThat(tracker.findById(second.getId()).getName(), is(third.getName()));
    }
    /*@Test
    public void whenReturnArrayWithoutNull(){
        Tracker tracker = new Tracker();

        Item first = new Item("test1", "testDescription1", 123L);
        // Добавляем первую заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(first);

        Item second = new Item(null, "testDescription2", 1234L);
        // Добавляем вторую заявку в трекер c name = null. Теперь в объект проинициализирован id.
        tracker.add(second);

        Item third = new Item("test3", null, 12345L);
        // Добавляем третью заявку в трекер c description = null. Теперь в объект проинициализирован id.
        tracker.add(third);

        Item fourth = new Item("test3", null, 12345L);
        // Добавляем третью заявку в трекер c description = null. Теперь в объект проинициализирован id.
        tracker.add(fourth);

        tracker.getAll(first);
        assertThat(tracker.getAll(first), is("test2"));
        assertThat(tracker.findById(second.getId()).getName(), is("test3"));*/
    }

