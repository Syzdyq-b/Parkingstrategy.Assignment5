public class Main {
    public static void main(String[] args) {
        int minutesParked = 190;

        ParkingTicket ticket = new ParkingTicket("777ABC02", new HourlyFeeStrategy());
        print(ticket, "Hourly", minutesParked);

        ticket.setFeeStrategy(new DailyFlatFeeStrategy());
        print(ticket, "Daily flat", minutesParked);

        ticket.setFeeStrategy(new StudentDiscountFeeStrategy());
        print(ticket, "Student discount", minutesParked);

        ticket.setFeeStrategy(new WeekendFeeStrategy());
        print(ticket, "Weekend", minutesParked);
    }

    private static void print(ParkingTicket ticket, String name, int minutes) {
        System.out.printf("%s | %s | %d min -> %.0f KZT%n",
                ticket.getPlateNumber(), name, minutes, ticket.calculateFee(minutes));
    }
}
