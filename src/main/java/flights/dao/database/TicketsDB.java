package flights.dao.database;

import flights.dao.ticket.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketsDB {

    private Map<String, Ticket> tickets = new HashMap<>();

    public TicketsDB(){
        Ticket ticket1 = new Ticket("1", true);
        Ticket ticket2 = new Ticket("2", false);

        tickets.put(ticket1.getId(), ticket1);
        tickets.put(ticket2.getId(), ticket2);
    }

    public Ticket getTicket(String id){
        return tickets.get(id);
    }

}
