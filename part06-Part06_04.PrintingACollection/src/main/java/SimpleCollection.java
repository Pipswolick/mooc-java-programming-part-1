
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }


    public String toString() {

       String output = "";
        if (elements.isEmpty()) {
            output += "The collection " + this.name + " is empty.";
        } else {
            output += "The collection " + this.name + " has " + elements.size()
                    + " element" + (this.elements.size() == 1 ? ":" : "s:");
            for (String element : this.elements) {
                output += "\n" + element;
            }
        }
        return output;
    }
}
