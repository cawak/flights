package flights.controller;

import flights.controller.response.BooleanResponse;
import flights.controller.response.CouponResponse;
import flights.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/flight")
public class FlightControllerImpl implements FlightController{

    @Autowired
    private FlightService flightService;

    @Override
    @RequestMapping(value = "/ticket/{id}", method = RequestMethod.GET)
    public @ResponseBody
    BooleanResponse isTicketAvailable(@PathVariable String id) {
        BooleanResponse booleanResponse = new BooleanResponse();
        booleanResponse.setResponse(flightService.isTicketAvailable(id));
        return booleanResponse;
    }

    @Override
    @RequestMapping(value = "/baggage/{baggageId}/destination/{destinationId}", method = RequestMethod.GET)
    public @ResponseBody
    BooleanResponse isCheckinSuccessfull(@PathVariable String baggageId, @PathVariable String destinationId) {
        BooleanResponse booleanResponse = new BooleanResponse();
        booleanResponse.setResponse(flightService.isCheckInSuccessfule(baggageId, destinationId));
        return booleanResponse;
    }

    @Override
    @RequestMapping(value = "/coupon/{id}", method = RequestMethod.GET)
    public @ResponseBody
    CouponResponse getCoupon(@PathVariable String id) {
        CouponResponse couponResponse = new CouponResponse();
        couponResponse.setDiscount(flightService.getCoupon(id));
        return couponResponse;
    }

}
