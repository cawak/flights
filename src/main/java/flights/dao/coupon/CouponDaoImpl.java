package flights.dao.coupon;

import flights.dao.Cache;
import flights.dao.database.CouponDB;
import org.springframework.stereotype.Component;

@Component
public class CouponDaoImpl implements CouponDao {

    private CouponDB couponDB = new CouponDB();
    private Cache<Coupon> cache = new Cache<>();

    public synchronized Coupon getCoupon(String id){
        Coupon coupon = cache.get(id);
        if (coupon != null){
            return coupon;
        }

        coupon = couponDB.getCoupon(id);
        if (coupon != null){
            cache.add(coupon);
        }

        return coupon;
    }
}
