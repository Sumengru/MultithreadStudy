package create;

/**
 * 以Thread的方式创建线程
 * @author 30047373
 */
public class ThreadDemo extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Mythread");;
    }

    public static void main(String[] args) {
        Thread thread = new ThreadDemo();
        Thread thread1 = new ThreadDemo();
        thread.start();
        thread1.start();
    }
}
