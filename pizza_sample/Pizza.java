import java.util.*;

public abstract class Pizza {
  String name;
  String dough;
  String saure;
  ArrayList toppings = new ArrayList();

  void prepare() {
    System.out.println(name + "をした処理" + name);
    System.out.println("生地をこねる");
    System.out.println("ソースを追加");
    System.out.println("トッピングを追加");
    int length = toppings.size();
    for(int i = 0; i< length ; i++) {
      System.out.println(" " + toppings.get(i));
    }
  }

  void bake() {
    System.out.println("350度で20分やく");
  }

  void cut() {
    System.out.println("ピザを扇型に切り分ける");
  }

  void box() {
    System.out.println("PlzzaStoreを正式な箱をピザに入れる");
  }

  public String getName() {
    return name;
  }
}