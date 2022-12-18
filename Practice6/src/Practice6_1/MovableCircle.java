package Practice6_1;

public class MovableCircle implements Movable {

    private int x, y, xSpeed, ySpeed, radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        center = new MovablePoint(this.x, this.y, this.xSpeed, this.ySpeed);
        this.radius = radius;
    }
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
        center.setxSpeed(this.xSpeed);
    }
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
        center.setySpeed(this.ySpeed);
    }
    public int getxSpeed() {
        return xSpeed;
    }
    public int getySpeed() {
        return ySpeed;
    }
    public int getX() {
        return center.getX();
    }
    public int getY() {
        return center.getY();
    }
    @Override
    public void moveUp() {
        center.moveUp();
    }
    @Override
    public void moveDown() {
        center.moveDown();
    }
    @Override
    public void moveLeft() {
        center.moveLeft();
    }
    @Override
    public void moveRight() {
        center.moveRight();
    }
    @Override
    public String toString() {
        return "Окружность с центром с координатой (" + x + ", " + y + ") и радиусом " + radius + ".";
    }

}
