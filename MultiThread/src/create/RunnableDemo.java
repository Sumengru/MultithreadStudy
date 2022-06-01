package create;

/**
 * 以实现Runnable接口的方式创建多线程
 * @author 30047373
 */
public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " myThread is running");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableDemo());
        Thread thread1 = new Thread(new RunnableDemo());
        thread.start();
        thread1.start();
    }
}
