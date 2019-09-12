package ru.job4j.tracker.start;

public class ValidateInput extends ConsoleInput {
    public ValidateInput(String[] strings) {
        super();
    }

    public ValidateInput() {

    }

    @Override
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;

        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("1Введите корректные данные");
            } catch (MenuOutException moe) {
                System.out.println("2Введите один из предложенных пунктов меню");
            }catch (UnsupportedOperationException uoe){
                System.out.println("3Введите один из предложенных пунктов меню");
            }
    } while(invalid);
        return value;
}


}
