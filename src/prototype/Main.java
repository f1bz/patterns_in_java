package prototype;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Monster prototype = new Monster();
        prototype.setX(1);
        prototype.setY(2);

        ArrayList<Monster> listOfMonsters = new ArrayList<>();
        listOfMonsters.add(prototype);

        for (int i = 0; i < 10; i++) {
            makePrototype(prototype, listOfMonsters);
        }


        for(Monster monster:listOfMonsters){
            System.out.println(monster.getX()+"|"+monster.getY()+"| ID: "+monster.getId());
        }
    }

    private static void makePrototype(Monster prototype, ArrayList<Monster> listToAdd) {
        try {
            listToAdd.add(prototype.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
