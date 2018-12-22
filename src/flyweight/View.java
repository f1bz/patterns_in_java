package flyweight;

import flyweight.model.Tree;
import flyweight.model.TreeType;

import java.util.ArrayList;
import java.util.List;

public class View {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void paint() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}
