package study20260407.generic;

public class Triple <A,B,C>{
    private A first;
    private B second;
    private C third;
/*
    public Triple(A first, B third, C second) {
        this.first = first;
        this.third = third;
        this.second = second;
    }*/

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public C getThird() {
        return third;
    }

    public void setThird(C third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return "Triple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}