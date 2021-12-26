package design.pattern.study.singletonpattern.example;

import java.util.concurrent.atomic.AtomicInteger;

public class TicketMaker {
    private AtomicInteger ticket = new AtomicInteger(1000);

    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker () {}

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public int getNextTicketNumber() {
        return ticket.getAndAdd(1);
    }
}
