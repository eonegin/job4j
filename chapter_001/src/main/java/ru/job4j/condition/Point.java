package ru.job4j.condition;

/**
 * Point.
 * Расчет расстояния между точками в системе координат
 *
 * @author eonegin (3he@mail.ru)
 * @version 1
 * @since 06.06.2018
 */

public class Point {

    /**
     * Coontains X coordinate
     */
    private int x;

    /**
     * Coontains Y coordinate
     */
    private int y;

    /**
     * Конструктор Point.
     *
     * @param x координата по оси x.
     * @param y координата по оси y.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method distanceTo
     * Удаляет дубли из массива.
     *
     * @param that входящие координаты.
     * @return возвращает координаты точки.
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }

    /**
     * Main.
     *
     * @param args - args.
     * @return возвращает копию массива без дублей.
     */
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);
        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}



