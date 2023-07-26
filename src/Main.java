public class Main {

    static int counter = 1;

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    static void task1() {
        System.out.println("\nЗадание " + counter++ + ":");

        int money = 15_000;
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

    static void task3() {
        System.out.println("\nЗадание " + counter++ + ":");

        float population = 12_000_000f;
        float birthRate = 17 / 1000f;
        float deathRate = 8 / 1000f;
        int year = 1;

        while (year <= 10) {
            population -= (population * birthRate + population * deathRate);
            System.out.printf("Год %d, численность населения составляет %f\n", year, population);
            year++;
        }
    }

    static void task4() {
        System.out.println("\nЗадание " + counter++ + ":");

        float money = 15_000f;
        float percent = 0.07f;
        int month = 1;

        while (money <= 12_000_000) {
            money += money * percent;
            System.out.printf("Месяц %d, сумма накоплений равна %f рублей\n", month, money);
            month++;
        }
    }

    static void task5() {
        System.out.println("\nЗадание " + counter++ + ":");

        float money = 15_000f;
        float percent = 0.07f;
        int month = 1;

        while (money <= 12_000_000) {
            money += money * percent;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %f рублей\n", month, money);
            }
            month++;
        }
    }

    static void task6() {
        System.out.println("\nЗадание " + counter++ + ":");

        float money = 15_000f;
        float percent = 0.07f;
        int month = 1;

        while (month <= 9 * 12) {
            money += money * percent;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %f рублей\n", month, money);
            }
            month++;
        }
    }

    static void task7() {
        System.out.println("\nЗадание " + counter++ + ":");

        int friday = 1;
        int week = 7;
        int month = 31;

        do {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", friday);
            friday+=week;
        }
        while (friday < month);
    }
}