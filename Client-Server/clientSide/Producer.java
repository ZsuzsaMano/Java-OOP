
package clientSide;

import java.rmi.RemoteException;
import java.util.Random;
import bothSides.*;

class Producer extends Thread {
    private RingBuffer buffer;
    private static Random random = new Random();

    Producer(RingBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            Product product = new Product();
            try {
                sleep(random.nextInt(500));
                buffer.storeProduct(product);
            } catch (InterruptedException | RemoteException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }
}
