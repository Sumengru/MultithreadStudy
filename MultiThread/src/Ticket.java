public class Ticket implements Runnable{

    private int ticket = 5;

    @Override
    public void run() {
        while (ticket > 0){
            synchronized (this){
                if(ticket == 0){
                    break;
                }
                ticket --;
                System.out.println(Thread.currentThread().getName() + "this ticket: "+ ticket);
            }
        }
    }
}
