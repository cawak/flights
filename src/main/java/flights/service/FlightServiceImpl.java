package flights.service;

import flights.dao.baggage.Baggage;
import flights.dao.baggage.BaggageDao;
import flights.dao.coupon.Coupon;
import flights.dao.coupon.CouponDao;
import flights.dao.ticket.TicketDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private TicketDao ticketDao;

    @Autowired
    private BaggageDao baggageDao;

    @Autowired
    private CouponDao couponDao;

    @Override
    public boolean isTicketAvailable(String ticketId){
        if (ticketId == null){
            System.out.println("Got null ticket id.");
            return false;
        }
        return ticketDao.isTicketAvailable(ticketId);
    }

    @Override
    public boolean isCheckInSuccessfule(String baggageId, String destinationId){
        if (baggageId == null || destinationId == null){
            System.out.println("Got null baggage or destination.");
            return false;
        }

        Baggage baggage = baggageDao.getBaggage(baggageId);
        if (baggage == null){
            return false;
        }

        return baggage.getDestinationId().equals(destinationId);
    }

    @Override
    public int getCoupon(String id){
        if (id == null){
            System.out.println("Got null coupon id.");
            return 0;
        }
        List<Integer> discounts = Arrays.asList(10, 50, 60);

        Coupon coupon = couponDao.getCoupon(id);
        if (coupon != null){
            return discounts.get(getRandomIndex(discounts.size()));
        }
        return 0;
    }

    private int getRandomIndex(int listSize){
        Random random = new Random();
        return random.nextInt(listSize);
    }
}
