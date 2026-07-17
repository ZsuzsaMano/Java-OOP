package server;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class CounterServer {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        LocateRegistry.createRegistry(1099);
        System.out.println("RMI-Registry gestartet.");
        CounterImpl counter = new CounterImpl(50);
        Naming.rebind("rmi://localhost/counter", counter);
        System.out.println(
                "Counter (50) erzeugt und angemeldet.");
    }

}
