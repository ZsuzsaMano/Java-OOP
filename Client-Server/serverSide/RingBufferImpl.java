package serverSide;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import bothSides.*;

public class RingBufferImpl extends UnicastRemoteObject implements RingBuffer {
    private Product[] data;
    private int startPos;
    private int size;
    private String id;

    public RingBufferImpl(String id, int capacity) throws RemoteException {
        this.id = id;
        data = new Product[capacity];
    }

    public synchronized void storeProduct(Product product)
            throws InterruptedException {
        if (size >= data.length) {
            wait();
        }
        int lastInsertionPos = (startPos + size - 1) % data.length;
        int insertPos = (lastInsertionPos + 1) % data.length;
        data[insertPos] = product;
        size++;
        System.out.println(id + ": " + size + " Produkte im Lager");
        notify();
    }

    public synchronized Product getProduct()
            throws InterruptedException {
        if (size <= 0) {
            wait();
        }
        size--;
        Product product = data[startPos];
        startPos = (startPos + 1) % data.length;
        System.out.println(id + ": " + size + " Produkte im Lager");
        notify();
        return product;
    }
}
