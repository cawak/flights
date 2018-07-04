package flights.dao.baggage;


import flights.dao.EntityWithId;

public class Baggage implements EntityWithId {

    private String baggageId;
    private String destinationId;

    public Baggage() {
    }

    public Baggage(String baggageId, String destinationId) {
        this.baggageId = baggageId;
        this.destinationId = destinationId;
    }

    public String getId() {
        return baggageId;
    }

    public void setBaggageId(String baggageId) {
        this.baggageId = baggageId;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Baggage baggage = (Baggage) o;

        if (baggageId != null ? !baggageId.equals(baggage.baggageId) : baggage.baggageId != null) return false;
        return destinationId != null ? destinationId.equals(baggage.destinationId) : baggage.destinationId == null;
    }

    @Override
    public int hashCode() {
        int result = baggageId != null ? baggageId.hashCode() : 0;
        result = 31 * result + (destinationId != null ? destinationId.hashCode() : 0);
        return result;
    }
}
