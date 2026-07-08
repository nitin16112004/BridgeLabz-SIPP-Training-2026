interface CouponValidator {

    // Abstract method
    boolean validateCoupon(String code);

    // Static method
    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {
        // Coupon is valid if length >= 5 and starts with "SAVE"
        return CouponValidator.isLengthValid(code) && code.startsWith("SAVE");
    }
}

