package flyweight;

import flyweight.model.TreeType;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> treeTypeMap = new HashMap<>();

    public static TreeType getTreeType(String name,String color,String type){
        TreeType result = treeTypeMap.get(name);
        if (result==null) {
            result = new TreeType(name,color,type);
            treeTypeMap.put(name,result);
        }
        return result;
    }


}
