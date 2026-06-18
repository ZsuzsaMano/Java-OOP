package Weckdienst;

import java.time.LocalTime;
import java.util.ArrayList;

public class WakeUpService {
    private int wakeUpTime;
    private ArrayList<WakeUpServiceClient> clientList = new ArrayList<WakeUpServiceClient>();

    public WakeUpService(int wakeUpTime) {
        this.wakeUpTime = wakeUpTime;
    }

    public void register(WakeUpServiceClient client) {
        clientList.add(client);
    }

    private void wakeUpAllClients() {
        for (WakeUpServiceClient client : clientList) {
            client.wakeup(wakeUpTime);
        }
    }

    public void startService() {
        boolean finished = false;
        System.out.println("Weckdienst für Weckzeit " +
                wakeUpTime + ":00 Uhr gestartet.");
        while (!finished) {
            int currentHour = LocalTime.now().getHour();
            if (currentHour == wakeUpTime) {
                wakeUpAllClients();
                finished = true;
            }
            try {
                Thread.sleep(1000); // Eine Sekunde Pause
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
