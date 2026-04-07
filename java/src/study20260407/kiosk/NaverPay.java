package study20260407.kiosk;

public class NaverPay implements Pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("네이버페이로 결제합니다.");
        return true;
    }
}
