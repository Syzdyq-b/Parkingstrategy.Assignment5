public class StudentDiscountFeeStrategy implements ParkingFeeStrategy {
    private static final double RATE_PER_HOUR = 500.0;
    private static final double DISCOUNT = 0.5;
    private static final int FREE_MINUTES = 30;

    @Override
    public double calculateFee(int minutesParked) {
        int billableMinutes = Math.max(0, minutesParked - FREE_MINUTES);
        int billedHours = (int) Math.ceil(billableMinutes / 60.0);
        return billedHours * RATE_PER_HOUR * (1 - DISCOUNT);
    }
}
