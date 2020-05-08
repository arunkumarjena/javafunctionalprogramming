package callback;

import java.util.function.Consumer;

public class Callback {
    public static void main(String[] args) {
        hello("arun",null, value -> {
            System.out.println("no lastName provide for " + value);
        });

        hello2("arun",null, () -> {
            System.out.println("no lastName provide for ");
        });
    }
    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        }else {
            callback.accept(firstName);
        }
    }
    static void hello2(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        }else {
            callback.run();
        }
    }
}
