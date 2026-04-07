package study20260407.generic;

public class ResultMain {
    public static void main(String[] args) {
        Result<Integer> success = Result.success(100, "성공");
        System.out.println("데이터: " + success.getData());
        System.out.println("메시지: " + success.getMessage());

        Result<String> failResult =Result.fail("데이터를 찾을 수 없습니다.");
        System.out.println("데이터: " + failResult.getData());



        System.out.println("메시지: " + failResult.getMessage());

    }
}
