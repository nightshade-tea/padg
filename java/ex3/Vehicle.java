public abstract class Vehicle {
  protected String licensePlate;
  protected String manufacturer;
  protected int year;

  public Vehicle(String licensePlate, String manufacturer, int year) {
    this.licensePlate = licensePlate;
    this.manufacturer = manufacturer;
    this.year = year;
  }

  public String getLicensePlate() {
    return this.licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  public String getManufacturer() {
    return this.manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public abstract double calculateMaintenanceCost(int currentYear);

  public int getAge(int currentYear) {
    return currentYear - this.year;
  }
}
