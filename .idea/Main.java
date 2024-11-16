import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("First");
        str.add("MainFile");
        str.add("Added");
        str.stream().forEach(System.out::println);
    }
}