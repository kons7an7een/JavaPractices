package Practice6_1;

public class MovablePoint implements Movable {

    private int x, y, xSpeed, ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    public int getxSpeed() {
        return xSpeed;
    }
    public int getySpeed() {
        return ySpeed;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    @Override
    public void moveUp() {
        y += ySpeed;
    }
    @Override
    public void moveDown() {
        y -= ySpeed;
    }
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
    @Override
    public void moveRight() {
        x += xSpeed;
    }
    @Override
    public String toString() {
        return "Точка с координатой (" + x + ", " + y + ").";
    }
}
