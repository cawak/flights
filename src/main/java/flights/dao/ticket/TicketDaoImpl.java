package flights.dao.ticket;


import flights.dao.Cache;
import flights.dao.database.TicketsDB;
import flights.dao.ticket.Ticket;
import flights.dao.ticket.TicketDao;
import org.springframework.stereotype.Component;

@Component
public class TicketDaoImpl implements TicketDao {

    Cache<Ticket> ticketsCache = new Cache<>();
    TicketsDB ticketsDB = new TicketsDB();

    public synchronized boolean isTicketAvailable(String ticketId){
        Ticket ticket = ticketsCache.get(ticketId);
        if (ticket != null){
            return ticket.isAvailable();
        }

        ticket = ticketsDB.getTicket(ticketId);
        if (ticket != null){
            ticketsCache.add(ticket);
            return ticket.isAvailable();
        }

        return false;
    }
}
