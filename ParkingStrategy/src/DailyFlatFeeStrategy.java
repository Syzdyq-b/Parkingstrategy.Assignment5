public class DailyFlatFeeStrategy implements ParkingFeeStrategy {
    private static final double RATE_PER_DAY = 3000.0;
    private static final int MINUTES_IN_DAY = 24 * 60;

    @Override
    public double calculateFee(int minutesParked) {
        int billedDays = (int) Math.ceil((double) minutesParked / MINUTES_IN_DAY);
        return billedDays * RATE_PER_DAY;
    }
}
