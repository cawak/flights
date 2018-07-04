package flights.dao.database;

import flights.dao.baggage.Baggage;

import java.util.ArrayList;
import java.util.List;

public class BaggageDB {

    private List<Baggage> baggages = new ArrayList<>();

    public BaggageDB() {
        Baggage baggage1 = new Baggage("b1", "d1");
        Baggage baggage2 = new Baggage("b2", "d2");

        baggages.add(baggage1);
        baggages.add(baggage2);

    }

    public Baggage getBaggage(String baggageId){
        return baggages.stream()
                .filter(baggage -> baggage.getId().equals(baggageId)).findFirst().get();
    }
}
