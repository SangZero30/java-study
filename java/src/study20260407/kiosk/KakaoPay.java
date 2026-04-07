package study20260407.kiosk;

public class KakaoPay implements Pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("카카오페이로 결제합니다.");
        return true;
    }
}
