package tasks;

import java.util.StringTokenizer;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String raw_input) {
        StringTokenizer tmp = new StringTokenizer(raw_input, ",");
        if (tmp.countTokens() >= 4){
            id = tmp.nextToken().trim();
            name = tmp.nextToken().trim();
            color = tmp.nextToken().trim();
            size = tmp.nextToken().trim();

        }
    }

    @Override
    public String toString() {
        return  "id='" + id + "'\n" +
                "name='" + name + "'\n" +
                "color='" + color + "'\n" +
                "size='" + size + "'\n";
    }
}
