public abstract class Beverage {
  String description = "undefined drink";

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}