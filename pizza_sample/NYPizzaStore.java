class NYPizzaStore extends PizzaStore {
  protected Pizza createPizza(String type) {
    if(type.equals("チーズ")){
      return new NYStyleCheesePizza();
    }else return null;
  }
}

