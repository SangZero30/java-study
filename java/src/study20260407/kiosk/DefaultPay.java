package study20260407.kiosk;

public class DefaultPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("지원하지 않는 결제수단입니다.");
        return false;
    }
}
