package study20260407.generic;

public class TripleMain {
    public static void main(String[] args) {
        Triple<String,Integer,Boolean> triple = new Triple<>();
        triple.setFirst("홍길동");
        triple.setThird(true);
        triple.setSecond(20);
        System.out.println("이름: " + triple.getFirst());
        System.out.println("나이: " + triple.getSecond());
        System.out.println("성인 여부: " + triple.getThird());
        System.out.println("전체 정보: " + triple);
    }
}
