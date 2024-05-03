package mid;
class StaticSample {
    int n;
    void g() {
        System.out.println("인스턴스 함수 실행");
    }
    static int m;
    static void f() {
        System.out.println("스태틱 함수 실행");
    }
}

public class StaticTest {
    public static void main(String[] args) {
        StaticSample.m = 3;
        StaticSample.f();

        StaticSample b1 = new StaticSample();
        // 원칙적으론 사용하지 말 것(클래스로 사용하면 static 멤버인 것을 확실히 알지만 객체로 사용하면 혼동될 수 있음)
        b1.m = 6;
        b1.f();

        System.out.println(StaticSample.m);
    }
}
