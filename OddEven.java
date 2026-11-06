class Table {
    private int data;
    private boolean available = false;

    public synchronized  void odd(int value) throws InterruptedException {
        while(available) {
            wait();
        }

        data = value;
        available = true;

        System.out.println("Odd : " + data);
        notifyAll();
    }

    public synchronized void even(int value) throws InterruptedException {
        while(!available) {
            wait();
        }

        data = value;
        available = false;

        System.out.println("Even : " + data);
        notifyAll();
    }
}

public class OddEven {
    
    public static void main(String[] args) throws InterruptedException {

        Table t = new Table();
        Thread odd = new Thread(() -> {
            try {
                for(int i=1;i<=10;i++) {
                    if(i%2==1)
                    t.odd(i);
                }
            } 
            catch (InterruptedException e) {}
        });

        Thread even = new Thread(() -> {
            try {
                for(int i=1;i<=10;i++) {
                    if(i%2==0)
                    t.even(i);
                }
            } 
            catch (InterruptedException e) {}
        });

        odd.start();
        even.start();
    }
}