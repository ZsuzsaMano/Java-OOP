package Weckdienst;

public class WakeUpServiceTest {
    public static void main(String[] args) {
        WakeUpService service = new WakeUpService(11);

        service.register(new WakeUpServiceClient() {
            @Override
            public void wakeup(int wakeUpTime) {
                System.out.println("anonymus wake up");

            };
        });
        HotelGuest Joe = new HotelGuest("Joe");
        service.register(Joe);
        service.register(new HotelGuest("Mary"));
        service.register(p -> System.out.println("It's " + p + ". Wake up!"));
        service.startService();
    }
};