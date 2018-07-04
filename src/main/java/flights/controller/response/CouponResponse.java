package flights.controller.response;


import java.io.Serializable;

public class CouponResponse implements Serializable {

    private int discount;

    public CouponResponse() {
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
