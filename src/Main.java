public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("task 1");
        int deposit = 15_000;
        int sum = 0;
        int month = 0;
        while (sum < 2_459_000) {
            sum = sum + deposit;
            System.out.println("Месяц " + month + ": сумма накоплений равна " + sum);
            month++;
        }

        //task2
        System.out.println("task 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (int b = 10; b >= 1; b = b - 1) {
            System.out.print(b + " ");
        }
        System.out.println();

        //task3
        System.out.println("task 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int years = 0;
        while (years < 12) {
            int birthRate = population / 1000 * fertility;  //коэффициент рождаемости
            int deathRate = population / 1000 * mortality;  //коэффициент смертности
            population = population + birthRate - deathRate;
            years++;
            System.out.println("Год " + years + ", численность населения составляет " + population + " человек");
        }

        //task4
        System.out.println("task 4");
        int deposit4 = 15_000;
        int month4 = 1;
        double percent4 = 1.07;
        while (deposit4 < 12_000_000) {
            deposit4 = (int)(deposit4 * percent4);
            System.out.println("Месяц " + month4 + ", сумма накоплений " + deposit4);
            month4++;
        }

        //task5
        System.out.println("task 5");
        int deposit5 = 15_000;
        int month5 = 1;
        double percent5 = 1.07;
        while (deposit5 < 12_000_000) {
            deposit5 = (int)(deposit5 * percent5);
            if (month5 % 6 == 0) {
                System.out.println("Месяц " + month5 + ", сумма накоплений " + deposit5);
            }
            month5++;
        }

        //task6
        System.out.println("task 6");
        int deposit6 = 15_000;
        int month6 = 1;
        int iterations = 12 * 9;
        double percent6 = 1.07;
        while (month6 < iterations) {
            deposit6 = (int)(deposit6 * percent6);
            if (month6 % 6 == 0) {
                System.out.println("Месяц " + month6 + ", сумма накоплений " + deposit6);
            }
            month6++;
        }

        //task7
        System.out.println("task 7");
        int friday = 1;
        int week = 7;
        while (friday < 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт");
            friday = friday + week;
        }

        //task8
        System.out.println("task 8");
        int year = 0;
        int current = 2023;
        int past = current - 200;
        int future = current + 100;
        while ( year < future) {
            if ( year > past || year < future) {
                year = year + 79;
                System.out.println("Комета прилетит в " + year + " году");
            }
        }
    }
}