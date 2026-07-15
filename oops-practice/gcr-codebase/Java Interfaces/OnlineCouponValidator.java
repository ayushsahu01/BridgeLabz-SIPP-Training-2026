interface CouponValidator {

    void validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public void validateCoupon(String code) {

        if (CouponValidator.isLengthValid(code)) {
            System.out.println(code + " : Valid Coupon");
        } else {
            System.out.println(code + " : Invalid Coupon");
        }
    }
}

public class OnlineCouponValidator {
    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "AB12",
                "WELCOME",
                "OFF",
                "DISCOUNT50"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String code : coupons) {
            cart.validateCoupon(code);
        }
    }
}