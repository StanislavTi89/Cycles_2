public class Main {
    public static void main(String[] args) {
        System.out.println("Циклы. Часть 2");

        //Задание 1
        System.out.println("Задание 1");
        int accumulation = 15000;
        double sumPercent = 0;
        double percent = 0.01;
        int i = 0;
        while (sumPercent < 2_459_000){
            i++;
            sumPercent = (sumPercent + accumulation) * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumPercent + " рублей");
        }


        //Задание 2
        System.out.println("Задание 2");
        int ia = 0;
        while (ia <10) {
            ia++;
            System.out.println(ia);
        }
        for (ia = 10; ia >= 1; ia--){
            System.out.println(ia);
        }

        //Задание 3
        System.out.println("Задание 3");
        int y = 12_000_000;
        int born = 17;
        int death = 8;
        for (int year = 1; year<=10; year++){
            y+=((y+born)-death)/1000;
            System.out.println("Год " + year + ", численность населения составляет " + y);
        }

        //Задание 4
        System.out.println("Задание 4");
        int accumulation2 = 15000;
        double sumPercent2 = 0;
        double percent2 = 0.07;
        int i2 = 0;
        while (12_000_000 > sumPercent2){
            i2++;
                sumPercent2 = (sumPercent2 + accumulation2) * (1 + percent2);
            System.out.println("Месяц " + i2 + ", сумма накоплений равна " + sumPercent2 + " рублей");
        }


    }
}