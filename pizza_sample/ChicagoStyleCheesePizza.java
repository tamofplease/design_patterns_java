public class ChicagoStyleCheesePizza extends Pizza {
  public ChicagoStyleCheesePizza() {
    name = "chicago style cheeze pizza";
    dough = "thick crast dough";
    saure = "plum tomato souce";
    toppings.add("cut mothalela cheeze");
  }

  void cut() {
    System.out.println("ピザを4角くきる");
  }
}