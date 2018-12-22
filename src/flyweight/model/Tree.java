package flyweight.model;

public class Tree {
    private int x ;
    private int y;
    private TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw() {
        System.out.println("painting tree: "+x+"|"+y+" | "+treeType.getColor()+" | "+treeType.getName()+" | " + treeType.getType());
    }
}
