package Weckdienst;

import org.w3c.dom.html.HTMLOListElement;

public class WakeUpServiceTest {
    public static void main(String[] args) {
        WakeUpService service = new WakeUpService(11);
        WakeUpServiceClient lisa = new WakeUpServiceClient() {
            @Override
            public void wakeup(int wakeUpTime) {
                System.out.println("Lisa wake up");

            };

        };
        service.register(lisa);
        HotelGuest Joe = new HotelGuest("Joe");
        service.register(Joe);
        service.register(p -> System.out.println("It's " + p + ". Wake up!"));
        service.startService();
    }
};