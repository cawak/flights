package flights.dao.database;

import flights.dao.coupon.Coupon;

import java.util.ArrayList;
import java.util.List;

public class CouponDB {

    private List<Coupon> couponList = new ArrayList<>();


    public CouponDB() {
        Coupon coupon1 = new Coupon("c1");
        Coupon coupon2 = new Coupon("c2");

        couponList.add(coupon1);
        couponList.add(coupon2);
    }

    public Coupon getCoupon(String id){
        Coupon coupon = new Coupon(id);
        if (couponList.contains(coupon)){
            return coupon;
        }

        return null;
    }
}
