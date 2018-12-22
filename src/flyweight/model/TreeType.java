package flyweight.model;

public class TreeType {
    private String name;
    private String color;
    private String type;

    public TreeType(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
