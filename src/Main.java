public class Main {

    static int counter = 1;

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
            population -= (population*birthRate + population*deathRate);
            System.out.printf("Год %d, численность населения составляет %f\n", year, population);
            year++;
        }
    }

    static void task4() {
        System.out.println("\nЗадание " + counter++ + ":");

        float money = 15_000f;
        float sum = 0f;
        float percent = 0.07f;
        int month = 1;

        while (sum < 12_000_000) {
            money = sum + money + money*percent;
            sum = money;
            System.out.printf("Месяц %d, сумма накоплений равна %f рублей\n", month, sum);
            month++;
        }
    }

}