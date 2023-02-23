public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {

        System.out.println("Задача 2");

        int clientOS = 0;
        int clientDeviceYear = 2010;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегчённую версию приложения для IOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1)
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        else if (clientOS == 0)
            System.out.println("Установите версию приложения для IOS по ссылке");
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2() {

        System.out.println("Задача 3");

        int year = 2021;
        int years = year % 4;
        if (years != 0){
            System.out.println(year+" год не является високосным");
        }
        else if (years==0){
            int yearNew = year%100;
            if (yearNew==0){
                int yearNewUp = year%400;
                if (yearNewUp==0){
                    System.out.println(year+" год является високосным");
                } else if (yearNewUp!=0){
                    System.out.println(year+" год не является високосным");
                }
            }
            else if (yearNew!=0){
                System.out.println(year+" год является високосным");
            }
        }
    }
    public static void task3() {

        System.out.println("Задача 4");
        int deliveryDistance = 95; if (deliveryDistance <= 20){
            int day = 1;
            System.out.println("Потребуется дней: "+day);
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60){
            int day = 2;
            System.out.println("Потребуется дней: "+day);
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100){
            int day = 3;
            System.out.println("Потребуется дней: "+day);
        }
        else {
            System.out.println("Доставки нет");
        }
    }
    public static void task4(){

        System.out.println("Задача 5");

        int monthNumber = 12; switch (monthNumber){
            case 1:
            case 2:
            case 12: System.out.println("Зима");
            break;
            case 3:
            case 4:
            case 5: System.out.println("Весна");
            break;
            case 6:
            case 7:
            case 8: System.out.println("Лето");
            break;
            case 9:
            case 10:
            case 11: System.out.println("Осень");
            break;
        }
    }
}