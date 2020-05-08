package revisionall;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());

        System.out.println(getDbConnectionUrl.get());

    }
    static String getDBConnectionUrl(){
        return "jdbc:mysql//localhsot:3306";
    }

    static Supplier<List<String> >getDbConnectionUrl = ()
            -> List.of("" + "jdbc:mysql://localhost:3306",
            "jdbc:mysql://localhost:3306",
            "jdbc:mysql://localhost:3306");
}
