public class Main {
    public static void main(String[] args) {

        System.out.println("***task1***");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("***task2***");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("***task3***");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("***task4***");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("***task5***");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }

        System.out.println("***task6***");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");

        }
        System.out.println();

        System.out.println("***task7***");
        for (int k = 1; k <= 512; k *= 2) {
            System.out.print(k + " ");
        }
        System.out.println();

        System.out.println("***task8***");
        int money = 29000;
        int totalMoney = 0;
        for (int i = 0; i < 12; i++) {
            totalMoney = totalMoney + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalMoney + " рублей ");
        }
        System.out.println("Всего за год получим сумму " + totalMoney);

        System.out.println("***task9***");
        int ntotalMoney = 0;
        double percent = 1D / 100;
        for (int i = 0; i <= 12; i++) {
            ntotalMoney += money;
            ntotalMoney = (int) (ntotalMoney * (1 + percent));
            System.out.println("Месяц " + i + ", сумма накоплений равна " + ntotalMoney + " рублей ");
        }

        System.out.println("***task10***");
        for (int i = 1; i <= 10; i++) {
            int j = i * 2;
            System.out.println(j);
        }

    }
}