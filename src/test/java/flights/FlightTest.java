package flights;

import flights.service.FlightService;
import flights.service.FlightServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlightTest {

    FlightService flightService = new FlightServiceImpl();

    @Before
    public void before(){
        flightService = new FlightServiceImpl();
    }

    @Test
    public void nullTicketValue(){
        boolean response = flightService.isTicketAvailable(null);
        Assert.assertFalse(response);
    }

    @Test
    public void nullBaggage(){
        boolean response = flightService.isCheckInSuccessfule(null, "id");
        Assert.assertFalse(response);
    }

    @Test
    public void nullCoupon(){
        int value = flightService.getCoupon(null);
        Assert.assertEquals(0, value);
    }
}
