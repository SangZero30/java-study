package study20260407.kiosk;

import java.util.Locale;
import java.util.Scanner;

public class KioskMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartManager cart = new CartManager();
        cart.addCart(new SnackItem<>("오리지널 팝콘", 5000, 2));
        cart.addCart(new SnackItem<>("제로콜라", 2500, 2));

        cart.display();

        System.out.println("멤버십 등급을 입력하세요.");
        String gradeInput = sc.next().toUpperCase();
        MemberGrade grade = MemberGrade.valueOf(gradeInput);

        int finalPrice = cart.calculationTotal(grade);
        System.out.println("할인 적용된 최종 결제 금액 : " + finalPrice);

        System.out.println("결제 수단을 입력해주세요 :");
        String option = sc.next();
        PayService.payService(option,finalPrice);

    }
}
