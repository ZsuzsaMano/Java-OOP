package s6.Reisebuero;

class Test {
    public static void main(String[] argv) {
        TicketAnbieter ta = new TicketAnbieter(4);
        new Thread(new Reisebuero("Reiseland", ta)).start();
        new Thread(new Reisebuero("Happy Travel", ta)).start();
    }
}
