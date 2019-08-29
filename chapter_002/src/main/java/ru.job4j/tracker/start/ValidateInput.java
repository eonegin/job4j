package ru.job4j.tracker.start;

public class ValidateInput extends ConsoleInput {
    @Override
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Введите корректные данные");
            } catch (MenuOutException moe) {
                System.out.println("Введите один из предложенных пунктов меню");
            }
        } while (invalid);
        return value;
    }


}
