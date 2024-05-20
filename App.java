import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Ich bin Ruslan");

        // for(int i = 0; i < list.size(); i++) {
        //     list.set(i, String.valueOf(list.get(i).length()));
        // }

        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList()); 

        System.out.println(list2);
    }
}
