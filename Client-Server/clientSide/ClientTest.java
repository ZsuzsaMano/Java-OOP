package clientSide;

import java.net.MalformedURLException;
import java.rmi.*;
import bothSides.RingBuffer;

public class ClientTest {
    public static void main(String[] args) throws MalformedURLException,
            RemoteException, NotBoundException {
        RingBuffer largeBuffer = (RingBuffer) Naming.lookup(
                "rmi://localhost/GrosserPuffer");
        RingBuffer smallBuffer = (RingBuffer) Naming.lookup(
                "rmi://localhost/KleinerPuffer");
        new Producer(largeBuffer).start();
        System.out.println("Erzeuger für großen Puffer gestartet.");
        new Producer(largeBuffer).start();
        System.out.println("Erzeuger für großen Puffer gestartet.");
        new Consumer(largeBuffer).start();
        System.out.println("Verbraucher für großen Puffer gestartet.");
        new Producer(smallBuffer).start();
        System.out.println("Erzeuger für kleinen Puffer gestartet.");
        new Consumer(smallBuffer).start();
        System.out.println("Verbraucher für kleinen Puffer gestartet.");
    }
}
