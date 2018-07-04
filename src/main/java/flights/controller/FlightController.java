package flights.controller;


import flights.controller.response.BooleanResponse;
import flights.controller.response.CouponResponse;

public interface FlightController {

    BooleanResponse isTicketAvailable(String id);
    BooleanResponse isCheckinSuccessfull(String baggageId, String destinationId);
    CouponResponse getCoupon(String couponId);
}
