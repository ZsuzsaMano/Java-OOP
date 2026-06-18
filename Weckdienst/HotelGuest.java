package Weckdienst;

public class HotelGuest implements WakeUpServiceClient {
    private String name;

    public HotelGuest(String name) {
        this.name = name;
    }

    @Override
    public void wakeup(int time) {
        System.out.print(name + ": Oh, schon " + time + " Uhr.");
        System.out.println("Dann will ich mal aufstehen.");
    }

}
