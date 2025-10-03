import java.util.*;

public class Garage <T extends Vehicle> {
  private ArrayList<T> vehicleArray;

  public Garage() {
    this.vehicleArray = new ArrayList<T>();
  }

  public ArrayList<T> getVehicles() {
    return this.vehicleArray;
  }

  public void addVehicle(T v) {
    this.vehicleArray.add(v);
  }

  public void removeVehicle(int id) {
    this.vehicleArray.remove(id);
  }

  public void listVehicles() {
    System.out.println("=".repeat(80));

    for (Vehicle v : this.vehicleArray) {
      System.out.printf("Vehicle %s (%s, %d)\n", v.getLicensePlate(),
          v.getManufacturer(), v.getYear());
      System.out.println("-".repeat(80));
    }

    System.out.println("=".repeat(80));
  }
}
