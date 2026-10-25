public class WeekendFeeStrategy implements ParkingFeeStrategy {
    private static final double FIXED_FEE = 1000.0;

    @Override
    public double calculateFee(int minutesParked) {
        return FIXED_FEE;
    }
}
