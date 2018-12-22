package prototype;

public class Monster implements Cloneable{
    private int x;
    private int y;
    private static int counter=0;
    private int id;

    public Monster() {
        id = counter;
        counter++;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    @Override
    protected Monster clone() throws CloneNotSupportedException {
        Monster clonedMonster = (Monster) super.clone();
        clonedMonster.setId(counter);
        counter++;
        return clonedMonster;
    }

    private void setId(int counter) {
        id = counter;
    }

    public int getId() {
        return id;
    }
}
