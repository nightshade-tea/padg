public class Motorcycle extends Vehicle {
  public Motorcycle(String licensePlate, String manufacturer, int year) {
    super(licensePlate, manufacturer, year);
  }

  public double calculateMaintenanceCost(int currentYear) {
    return this.getAge(currentYear) * 47.49;
  }
}
