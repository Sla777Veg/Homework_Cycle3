public class Main {
    public static void main(String[] args) {

        //ДЗ-1
        //Задание1
        int accumulation = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            i = i + 1;
            total = total + total / 100;
            total = total + accumulation;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);
        System.out.println(i);
        //Задание2
        int j = 1;
        while (j <= 10) {
            System.out.print(" "+j);
            j++;
        }
        System.out.println("\n");
        for (int k = 10; k >= 1; k--) {
            System.out.print(" "+k);
        }
        System.out.println("\n");

        //Задание3
        int totalNumber = 12000000;
        int birthRate = (17*totalNumber)/1000;
        int deathRate = (8*totalNumber)/1000;
        int change = birthRate - deathRate;
        int newPopulation = 12000000;
        for (int i1 = 1; i1<=10; i1++) {
            newPopulation = newPopulation + change;
            System.out.println("Год " +i1+" численность населения составляет "+newPopulation);
        }
        //ДЗ-2
        //Задание 4,5
        int total3 = 15000;
        int month = 0;
        while (total3 <=12000000) {
            total3 = total3+(total3/100*7);
            month++;
            if (month%6==0) {
                System.out.println("Месяц " +month+" Итого "+total3);
            }
        }
        System.out.println(total3);
        System.out.println(month);
        //Задание6
        int total4 = 15000;
        int month2 = 0;
        for (; month2 <=108; month2++) {
            total4 = total4 + (total4/100 * 7);
        }
        System.out.println("Месяц " + month2 + " Итого " + total4);
        //Задание7
        int Day = 7;
        for (; Day <=31; Day++) {
            if (Day == 7) {
                System.out.println("Сегодня пятница, " + Day + "-е число. Первая пятница месяца.");
            }
            if (Day % 7 == 0) {
                System.out.println("Сегодня пятница, " + Day + "-е число. Необходимо подготовить отчет.");
            }
        }
        //ДЗ-3
        //Задание8
        int Year = 0;
        //int YearComet = 79;
        for (; Year <= 2120; Year = Year + 79) {
            if (Year > 1822 && Year < 2122) {
                System.out.println(Year);
            }
        }
        //Задача9
        int n = 2;
        int x = 1;
        for (; x<=10; x++) {
            System.out.println("2 * "+x+" = "+n*x);
        }
    }
}