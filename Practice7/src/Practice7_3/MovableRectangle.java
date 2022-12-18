package Practice7_3;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft, bottomRight;
    private int xSpeed, ySpeed;


    MovableRectangle (MovablePoint point1, MovablePoint point2){
        topLeft = point1;
        bottomRight = point2;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
        topLeft.setxSpeed(xSpeed);
        bottomRight.setxSpeed(xSpeed);
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
        topLeft.setySpeed(ySpeed);
        bottomRight.setySpeed(ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public boolean SpeedTest() {
        if (topLeft.getxSpeed() == bottomRight.getxSpeed() && topLeft.getySpeed() == bottomRight.getySpeed())
            return true; else
                return false;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    @Override
    public String toString() {
        return "Координаты:\n\tТочка 1 - (" + topLeft.getX() + "; " + topLeft.getY() + ")" +
                "\n\tТочка 2 - (" + bottomRight.getX() + "; " + bottomRight.getY() + ")\n";
    }

}
