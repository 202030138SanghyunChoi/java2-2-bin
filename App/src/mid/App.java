package mid;
import mid.java2.Calculator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int a = 5;
        int b = 3;
        Calculator cal = new Calculator();
        System.out.println(a + " + " + b + " = " + cal.add(a,b));
    }
}
