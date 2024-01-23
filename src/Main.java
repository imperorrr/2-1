public class Main {
    public static void main(String[] args) {
        int initialBalance = 800;
        int addend = 5500;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }
        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Итотовый счёт: " + finalBalance);
        System.out.println("Бонус: " + bonus);

