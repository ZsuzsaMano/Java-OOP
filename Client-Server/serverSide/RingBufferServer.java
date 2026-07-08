package serverSide;

import java.net.MalformedURLException;
import java.rmi.*;
import bothSides.RingBuffer;

public class RingBufferServer {
    public static void main(String[] args)
            throws RemoteException, MalformedURLException {
        java.rmi.registry.LocateRegistry.createRegistry(1099);
        System.out.println("RMI-Registry gestartet.");
        RingBuffer largeBuffer = new RingBufferImpl("GrosserPuffer", 20);
        Naming.rebind("rmi://localhost/GrosserPuffer", largeBuffer);
        System.out.println(
                "GrosserPuffer (20) erzeugt und angemeldet.");
        RingBuffer smallBuffer = new RingBufferImpl("KleinerPuffer", 4);
        Naming.rebind("rmi://localhost/KleinerPuffer", smallBuffer);
        System.out.println(
                "KleinerPuffer (4) erzeugt und angemeldet.");
    }
}
