package study20260407.generic;

public class Result<T> {
    private boolean success;
    private T data;
    private String message;

    public Result(boolean success, T data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }
/*
public boolean isSuccess() {
        return success;
    }

 */
    // Result 클래스 안에 아래와 같은 메서드를 추가해두면 사용이 훨씬 편해집니다.

    // 성공했을 때 간단히 호출하는 메서드
    public static <T> Result<T> success(T data, String message) {
        return new Result<>(true, data, message);
    }

    // 실패했을 때 간단히 호출하는 메서드
    public static <T> Result<T> fail(String message) {
        return new Result<>(false, null, message);
    }
}


