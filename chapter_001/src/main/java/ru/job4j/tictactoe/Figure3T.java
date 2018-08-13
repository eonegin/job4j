package ru.job4j.tictactoe;

import javafx.scene.shape.Rectangle;

public class Figure3T extends Rectangle {
    private boolean markX = false;
    private boolean markO = false;
    private boolean markEmpty = false;

    public Figure3T() {
    }

    public Figure3T(boolean markX) {
        this.markX = markX;
        this.markO = !markX;
        this.markEmpty = !markX;
    }

    public void take(boolean markX) {
        this.markX = markX;
        this.markO = !markX;
        this.markEmpty = !markX;

    }

    public boolean hasMarkX() {
        return this.markX;
    }

    public boolean hasMarkO() {
        return this.markO;
    }

    public boolean hasMarkEmpty() {
        return this.markEmpty;
    }

}