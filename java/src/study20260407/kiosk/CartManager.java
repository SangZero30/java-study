package study20260407.kiosk;

import java.util.ArrayList;
import java.util.List;

public class CartManager {
    private List<SnackItem<String>> cart = new ArrayList<>();

    public void addCart(SnackItem<String> item) {
        cart.add(item);
    }

    public void display() {
        System.out.println("장바구니 목록");
        for (SnackItem<String> stringSnackItem : cart) {
            System.out.println(" 상품이름 : " + stringSnackItem.getName() + " 수량 : " + stringSnackItem.getQuantity() + " 금액 : " + stringSnackItem.getTotalPrice());
        }
    }

    public int calculationTotal(MemberGrade grade) {
        int total = 0;
        for (SnackItem<String> stringSnackItem : cart) {
           total += stringSnackItem.getTotalPrice();
        }


        return total * (100 -  grade.getDiscountRate())  / 100;
    }
}
