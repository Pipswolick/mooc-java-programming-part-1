import java.util.ArrayList;

public class Stack {

    private ArrayList<String> list;

public Stack() {
    this.list = new ArrayList<>();
}

    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        this.list.add(value);
    }

    public ArrayList<String> values() {
        return new ArrayList<>(this.list);
    }

    public String take() {
    return this.list.remove(list.size() -1);
    }
}
