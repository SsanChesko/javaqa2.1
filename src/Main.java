public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 20_000; // цена билета
        int bonus = service.calculate(ticketPrice);
        System.out.println("Вам начислено " + bonus + " балла(ов)");

    }
}

// public class Main {
//    public static void main(String[] args) {
//        BonusMilesService service = new BonusMilesService();
//        int price = 10_000;
//        int miles = service.calculate(price);
//        System.out.println(miles);
//    }
//}