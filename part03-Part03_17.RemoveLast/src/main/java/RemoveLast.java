
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {

    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0){
            return;
    }
        int last = strings.size() - 1;
        strings.remove(strings.get(last));
}
}