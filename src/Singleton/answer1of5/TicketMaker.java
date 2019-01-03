package Singleton.answer1of5;

public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
    }

    private static int ticket = 1000;

    public static int getNextTicketNumber() {
        return ticket++;
    }

    public static TicketMaker getInstance() {
        System.out.println("票的序列号" + getNextTicketNumber());
        return ticketMaker;
    }
}
