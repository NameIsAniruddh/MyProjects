public class ThreadDemo {

  public static void main(String[] args) {
      //tight coupling in Thread class
      /*code is executing directly
      */
      ThreadOne t1 = new ThreadOne();
      t1.start();
      //loose coupling in Runnable interface
      /*code is not executing directly, we have to create a new thread object to access the start() method
      */
      ThreadTwo t2 = new ThreadTwo();
      Thread t = new Thread(t2); 
      t.start();
  }
}

class ThreadOne extends Thread {

  @Override
  public void run() {
    try{
    for (int i = 1; i <= 5; i++) {
      System.out.println("ThreadOne: " + i);
      //sleep ThreadOne for one second
        Thread.sleep(1000);
      } 
    }catch (Exception e) {
        System.out.println(e);
      }
    }
  }

class ThreadTwo implements Runnable {

  @Override
  public void run() {
    try{
    for (int i = 1; i <= 5; i++) {
        System.out.println("ThreadTwo: " + i);
        //sleep ThreadTwo for one second
          Thread.sleep(1000);
        } 
      }catch (Exception e) {
          System.out.println(e);
        }
      }
  }
