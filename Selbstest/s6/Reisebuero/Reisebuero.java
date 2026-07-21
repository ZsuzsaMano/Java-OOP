package s6.Reisebuero;

class Reisebuero implements Runnable {
    private String name;
    private TicketAnbieter anbieter;

    Reisebuero(String name, TicketAnbieter anbieter) {
        this.name = name;
        this.anbieter = anbieter;
    }

    void warteAufKunde() {
        try {
            Thread.sleep(Math.round(1000 * Math.random()));
        } catch (InterruptedException e) {
        }
    }

    @Override
    public void run() {
        warteAufKunde();
        while (anbieter.ticketsVerfuegbar()) {
            synchronized (anbieter) {
                if (anbieter.ticketsVerfuegbar()) {
                    int nr = anbieter.ticketVerkauf();
                    System.out.println(name + " verkauft Ticket " + nr);
                    warteAufKunde();
                }
            }
        }
    }
}
