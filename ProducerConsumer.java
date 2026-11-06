class Table {
    private int data;
    private boolean available = false;

    public synchronized  void producer(int value) throws InterruptedException {
        while(available) {
            wait();
        }

        data = value;
        available = true;

        System.out.println("produced : " + data);
        notifyAll();
    }

    public synchronized void consumer() throws InterruptedException {
        while(!available) {
            wait();
        }

        System.out.println("consumed : " + data);
        available = false;
        notifyAll();
    }
}

public class ProducerConsumer {
    
    public static void main(String[] args) throws InterruptedException {

        Table t = new Table();
        Thread producer = new Thread(() -> {
            try {
                for(int i=0;i<5;i++) {
                    t.producer(i);
                }
            } 
            catch (InterruptedException e) {}
        });

        Thread consumer = new Thread(() -> {
            try {
                for(int i=0;i<5;i++) {
                    t.consumer();
                }
            } 
            catch (InterruptedException e) {}
        });

        producer.start();
        consumer.start();
    }
}