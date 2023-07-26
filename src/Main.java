public class Main {

    static int counter = 1;

    public static void main(String[] args) {
        task1();
        task2();
    }

    static void task1() {
        System.out.println("\nЗадание " + counter++ + ":");

        int money = 15000;
        int sum = 0;
        int month = 0;

        while (sum < 2_459_000) {
            sum += money;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
    }

    static void task2() {
        System.out.println("\nЗадание " + counter++ + ":");

        int minNum = 1;
        int maxNum = 10;

        while (minNum <= maxNum) {
            System.out.print(minNum + " ");
            minNum++;
        }

        System.out.println();
        for (int i = maxNum; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

}