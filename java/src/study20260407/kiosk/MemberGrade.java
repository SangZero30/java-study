package study20260407.kiosk;

public enum MemberGrade {
    BRONZE(0),
    SILVER(5),
    VIP(10);


    MemberGrade(int discountRate) {
        this.discountRate = discountRate;
    }

    private final int discountRate;

    public int getDiscountRate() {
        return discountRate;
    }
}
