package ru.mirea.task7.Shape;
import java.lang.*;
public interface  Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
class MovablePoint implements Movable {
    protected int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void moveUp()
    {
        this.y += this.ySpeed;
    }

    public void moveDown()
    {
        this.y -= this.ySpeed;
    }

    public void moveLeft()
    {
        this.x -= this.xSpeed;
    }

    public void moveRight()
    {
        this.x += this.xSpeed;
    }

    public String toString()
    {
        return "точка:\nкоордината x: " + x + ", координата y: " + y + ", скорость по оси X: " + xSpeed + ", скорость по оси Y: " + ySpeed;
    }
}

class MovableCircle implements Movable
{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    public void moveUp() { center.moveUp(); }

    public void moveDown() { center.moveDown(); }

    public void moveLeft() { center.moveLeft(); }

    public void moveRight() { center.moveRight(); }

    public String toString()
    {
        return "Окружность: \nРадиус=" + radius + ", координата x центра: " + center.x + ", координата y центра: " + center.y;
    }
}

class MovableRectangle implements Movable
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle (int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        if(xSpeed != ySpeed)
        {
            ySpeed = xSpeed;
            System.out.println("Скорости по x и y не равны, перерассчитаем скорость y по скорости x");
            System.out.println('\n');
        }
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void moveUp() { topLeft.moveUp(); bottomRight.moveUp(); }

    public void moveDown() { topLeft.moveDown(); bottomRight.moveDown(); }

    public void moveLeft() { topLeft.moveLeft(); bottomRight.moveLeft(); }

    public void moveRight() { topLeft.moveRight(); bottomRight.moveRight();}

    public String toString()
    {
        return "Прямоугольник:\nВерхняя левая " + topLeft + ";\nНижняя правая " + bottomRight;
    }
}