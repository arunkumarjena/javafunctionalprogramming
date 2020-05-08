package lambdaexpressions;

public class Sample {
    // function have typically 4things
    // 1.name - anonymous
    // 2.parameter list
    // 3.body
    // 4.return type - inferred
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("In another thread"));
        thread.start();
        System.out.println("In main");

    }
}
