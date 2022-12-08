public class Main {
    public static void main(String[] args) {
        float accountAmount = 99.5F;
        int payment = 1001;
        int x = payment / 100;
        int bonus;

        if (payment > 1000) {
            bonus = x;
        } else {
            bonus = 0;
        }
        float total = accountAmount + payment + bonus;

        System.out.println("Всего средств: " + total);
        System.out.println("Бонус: " + bonus);

    }
}