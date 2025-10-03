public class ElectricScooter extends Vehicle implements ElectricVehicle {
  private int batteryLevel;

  public ElectricScooter(String licensePlate, String manufacturer, int year) {
    super(licensePlate, manufacturer, year);
    this.chargeBattery();
  }

  public void chargeBattery() {
    this.batteryLevel = 100;
  }

  public int getBatteryLevel() {
    return this.batteryLevel;
  }

  public double calculateMaintenanceCost(int currentYear) {
    return this.getAge(currentYear) * 13.99;
  }
}
