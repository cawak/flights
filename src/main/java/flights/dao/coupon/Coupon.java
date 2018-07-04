package flights.dao.coupon;

import flights.dao.EntityWithId;

public class Coupon implements EntityWithId {

    private String id;

    public Coupon() {
    }

    public Coupon(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coupon coupon = (Coupon) o;

        return id != null ? id.equals(coupon.id) : coupon.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
