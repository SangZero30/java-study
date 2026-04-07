package study20260407.kiosk;

public class PayService {

    public static void payService(String option, int amount) {
        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);
        if (result) {
            System.out.println("영화관 매점 결제가 완료되었습니다. 즐거운 관람 되세요!");
        } else {
            System.out.println("결제 실패했습니다.");
        }
    }
}
