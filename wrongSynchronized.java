class A extends Thread {
   public int count;
  @Override
  public void run() {
    for(int i=1; i<=1000; ++i) {
      count++;
    }
  }
  public int getCount() {
    return count;
  }
}

public class TestThread {
  public static void main(String[] args) {
    A a = new A();
    A b = new A();
    a.start();
    b.start();
    System.out.println("Count: " + a.getCount());
  }
}
