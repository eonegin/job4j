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
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
        assertThat(tracker.findById(previous.getId()).getDescription(), is("testDescription2"));
        assertThat(tracker.findById(previous.getId()).getCreate(), is(1234L));

    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription1", 123L);
        tracker.add(first);
        Item second = new Item("test2", "testDescription2", 1234L);
        tracker.add(second);
        Item third = new Item("test3", "testDescription3", 12345L);
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
}

