class ChicagoPizzaStore extends PizzaStore {
  protected Pizza createPizza(String type) {
    if(type.equals("チーズ")){
      return new ChicagoStyleCheesePizza();
    }else return null;
  }
}