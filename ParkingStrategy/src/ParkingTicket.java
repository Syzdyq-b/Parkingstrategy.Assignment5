public class ParkingTicket {
    private final String plateNumber;
    private ParkingFeeStrategy feeStrategy;

    public ParkingTicket(String plateNumber, ParkingFeeStrategy feeStrategy) {
        this.plateNumber = plateNumber;
        this.feeStrategy = feeStrategy;
    }

    public void setFeeStrategy(ParkingFeeStrategy feeStrategy) {

        this.feeStrategy = feeStrategy;
    }

    public double calculateFee(int minutesParked) {

        return feeStrategy.calculateFee(minutesParked);
    }

    public String getPlateNumber() {

        return plateNumber;
    }
}
