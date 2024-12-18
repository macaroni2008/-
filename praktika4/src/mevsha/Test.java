package mevsha;

public class Test {
    public static void main(String[] args) {
        MovableCircle krug = new MovableCircle(5, new MovablePoint(5, 3, 10, 15));
        System.out.println(krug);
        krug.moveDown();
        krug.moveRight();
        System.out.println(krug);
        krug.moveUp();
        krug.moveLeft();
        System.out.println(krug);
    }
}