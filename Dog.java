abstract class Animal {
  public abstract void sound();
  public void name(String name) {
    System.out.println("My name is: " + name);
  }
}

public class Dog extends Animal {
  @Override
  public void sound()
  {
    System.out.println("Woof, Woof!");
  }
  // public void name() {
  //   System.out.println("My name is Dog!");
  // }
  public static void main(String[] args) {
    Animal obj = new Dog();
    obj.sound();
    obj.name("Dog");
  }
}
