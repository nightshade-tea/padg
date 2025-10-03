public class Car extends Vehicle implements LuxuryFeatures {
  private boolean sunroofOpen;
  private boolean massageActivated;

  public Car(String licensePlate, String manufacturer, int year) {
    super(licensePlate, manufacturer, year);
    this.sunroofOpen = false;
    this.massageActivated = false;
  }

  public boolean isSunroofOpen() {
    return this.sunroofOpen;
  }

  public boolean isMassageActivated() {
    return this.massageActivated;
  }

  @Override
  public void activateMassageSeats() {
    this.massageActivated = true;
  }

  public void deactivateMassageSeats() {
    this.massageActivated = false;
  }

  @Override
  public void openSunroof() {
    this.sunroofOpen = true;
  }

  public void closeSunroof() {
    this.sunroofOpen = false;
  }

  @Override
  public double calculateMaintenanceCost(int currentYear) {
    return this.getAge(currentYear) * 97.93;
  }
}
