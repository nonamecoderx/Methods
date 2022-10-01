public class Main {
    //задание1
    public static void main(String[] args) {
        //задание 1
        int year = 1900;
        checkYear(year);
        //задание 2
        int systemType = 0;
        int manufactureDate = 2024;
        int currentDate = 2022;
        checkSystem(systemType, manufactureDate, currentDate);
        //задание 3
        int deliveryDistance = 95;
        checkDaysDelivery(deliveryDistance);
    }
    public static void checkDaysDelivery(int days) {
        if (days < 20) {
            System.out.println("Доставка займет сутки");
        } else if (days >= 20 && days <= 60) {
            System.out.println("Доставка займет двое суток");
        } else if (days > 60 && days <= 100) {
            System.out.println("Доставка займет трое суток");
        } else {
            System.out.println("Доставка от трех суток");
        }
    }
    public static void checkSystem(int a, int b, int c) {
        if (a == 0 & b < c) {
            System.out.println("Please install ios lite version.");
        } else if (a == 0 & b >= c) {
            System.out.println("Please install ios full version.");
        }
        if (a == 1 & b < c) {
            System.out.println("Please install android lite version.");
        } else if (a == 1 & b >= c) {
            System.out.println("Please install android full version.");
        }
    }

    public static void checkYear(int yearIsHigh) {
        if (yearIsHigh % 4 != 0) {
            System.out.println(yearIsHigh + " - не високосный");
        } else {
            if (yearIsHigh % 100 == 0 && yearIsHigh % 400 != 0) {
                System.out.println(yearIsHigh + " - не високосный");
            } else {
                System.out.println(yearIsHigh + " - високосный");
            }
        }
    }
}
