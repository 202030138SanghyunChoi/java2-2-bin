class A {
	public A(int x) {
		System.out.println("생성자A");
	}
}

class B extends A {
	public B() { // 오류 발생
		System.out.println("생성자B");
	}
}

public class ConstructorEx2 {
	public static void main(String[] args) {
		B b;
		b = new B();
	}
}
