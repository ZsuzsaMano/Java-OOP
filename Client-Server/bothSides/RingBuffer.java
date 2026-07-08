package bothSides;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RingBuffer extends Remote {
    void storeProduct(Product product) throws InterruptedException, RemoteException;

    Product getProduct() throws InterruptedException, RemoteException;
}
