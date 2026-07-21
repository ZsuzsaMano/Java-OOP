package s6.Reisebuero;

class TicketAnbieter {
    private int verfuegbareTickets;

    TicketAnbieter(int verfuegbareTickets) {
        this.verfuegbareTickets = verfuegbareTickets;
    }

    synchronized boolean ticketsVerfuegbar() {
        return verfuegbareTickets > 0;
    }

    synchronized int ticketVerkauf() {
        int nr = verfuegbareTickets;
        verfuegbareTickets = verfuegbareTickets - 1;
        return nr;
    }
}
