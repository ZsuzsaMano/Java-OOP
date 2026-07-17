package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Counter extends Remote {

    public void increment() throws InterruptedException, RemoteException;;

    public void decrement() throws InterruptedException, RemoteException;;

    public void reset() throws InterruptedException, RemoteException;;

    public String getValue() throws InterruptedException, RemoteException;;

    // @Override
    // public String toString();

}
