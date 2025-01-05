//class MyThread extends Thread {
//    public void run() {
//        int i=0;
//        while (i<40000) {
//            System.out.println("Hello World");
//        }
//    }
//}
//class MyThread1 extends Thread {
//    public void run() {
//        while (true) {
//            System.out.println("Hello World 1");
//        }
//    }
//}
class MythreadRunnable implements Runnable{
    public void run() {
        System.out.println("Hello World");
    }
}
class MythreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("Hello World2");
    }
}
public class Main13 {
    public static void main(String[] args) {
    MythreadRunnable mythreadRunnable = new MythreadRunnable();
    MythreadRunnable2 mythreadRunnable2 = new MythreadRunnable2();
    Thread t1 = new Thread(mythreadRunnable);
    Thread t2 = new Thread(mythreadRunnable2);
    t1.start();
    t2.start();
    }
}
