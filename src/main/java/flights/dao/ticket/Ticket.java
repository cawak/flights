package flights.dao.ticket;

import flights.dao.EntityWithId;

public class Ticket implements EntityWithId {

    private String id;
    private boolean isAvailable;

    public Ticket() {
    }

    public Ticket(String id, boolean isAvailable){
        this.id = id;
        this.isAvailable = isAvailable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (isAvailable != ticket.isAvailable) return false;
        return id != null ? id.equals(ticket.id) : ticket.id == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (isAvailable ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
