public class Main {

    public static void main(String[] args) {

        System.out.println("Задача 1");
        checkLeapYear(2025);

        System.out.println("Задача 2");
        checkDeviceDate(1, 2015);

        System.out.println("Задача 2");
        calculateDeliveryDistance(95);
    }

    public static void checkLeapYear(int year) {

        if (year < 1584) {
            System.out.println("Год должен быть больше 1584");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static void checkDeviceDate(int clientOs, int clientDeviceYear) {

        if (clientOs == 0 && clientDeviceYear == 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear == 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Не можем определить вашу операционную систему");
        }
    }

    public static void calculateDeliveryDistance(int deliveryDistance) {

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней для доставки: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней для доставки: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней для доставки: 3");
        } else if (deliveryDistance > 100) {
            System.out.println("На такое расстояние доставка недоступна");
        }
    }
}

