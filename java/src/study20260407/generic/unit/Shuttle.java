package study20260407.generic.unit;

public class Shuttle<T extends BioUnit> {

    private T unit;

    public void in(T t) {
        unit = t;
    }

    public T out() {
        return unit;
    }
    public void showInfo(){
        System.out.println("이름 : " + unit.getName() + ", HP : " + unit.getHp());
    }
}
