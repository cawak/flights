package flights.dao.baggage;

import flights.dao.Cache;
import flights.dao.database.BaggageDB;
import org.springframework.stereotype.Component;

@Component
public class BaggageDaoImpl implements BaggageDao {

    private Cache<Baggage> baggageCache = new Cache<Baggage>();
    private BaggageDB baggageDB = new BaggageDB();

    @Override
    public Baggage getBaggage(String baggageId) {
        Baggage baggage = baggageCache.get(baggageId);
        if (baggage != null){
            return baggage;
        }

        baggage = baggageDB.getBaggage(baggageId);
        if (baggage != null) {
            baggageCache.add(baggage);
        }

        return baggage;
    }
}
