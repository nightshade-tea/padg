public class ElectricCar extends Car implements ElectricVehicle {
  private int batteryLevel;

  public ElectricCar(String licensePlate, String manufacturer, int year) {
    super(licensePlate, manufacturer, year);
    this.chargeBattery();
  }

  public void chargeBattery() {
    this.batteryLevel = 100;
  }

  public int getBatteryLevel() {
    return this.batteryLevel;
  }

  @Override
  public double calculateMaintenanceCost(int currentYear) {
    return super.calculateMaintenanceCost(currentYear) * 1.2;
  }
}
