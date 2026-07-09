package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.*;

import common.Counter;

public class CounterMain {
    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
        Counter counter = (Counter) Naming.lookup("rmi://localhost/counter");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new CounterGUI(counter);
                } catch (RemoteException | InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
    }
}
