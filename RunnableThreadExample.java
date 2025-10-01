//Runnable Thread Example
class MyTask implements Runnable {
 private String taskName;

 // Constructor
 public MyTask(String name) {
     this.taskName = name;
 }

 // Overriding the run() method
 @Override
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(taskName + " - Count: " + i);
         try {
             Thread.sleep(500); // pause for 0.5 seconds
         } catch (InterruptedException e) {
             System.out.println(taskName + " interrupted.");
         }
     }
     System.out.println(taskName + " completed.");
 }
}

//Main class
public class RunnableThreadExample {
 public static void main(String[] args) {
     // Creating Runnable objects
     MyTask task1 = new MyTask("Task 1");
     MyTask task2 = new MyTask("Task 2");

     // Wrapping Runnable inside Thread
     Thread t1 = new Thread(task1);
     Thread t2 = new Thread(task2);

     // Starting threads
     t1.start();
     t2.start();

     System.out.println("Main thread finished starting tasks...");
 }
}
