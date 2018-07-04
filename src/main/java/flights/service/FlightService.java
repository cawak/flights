package flights.service;

public interface FlightService {
    boolean isTicketAvailable(String ticketId);
    boolean isCheckInSuccessfule(String baggageId, String destinationId);
    int getCoupon(String id);

}
