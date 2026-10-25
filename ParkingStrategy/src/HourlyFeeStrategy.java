public class HourlyFeeStrategy implements ParkingFeeStrategy {
    private static final double RATE_PER_HOUR = 500.0;

    @Override
    public double calculateFee(int minutesParked) {
        int billedHours = (int) Math.ceil(minutesParked / 60.0);
        return billedHours * RATE_PER_HOUR;
    }
}
