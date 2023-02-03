/*
class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(1, 2, 3, 4);
        Rectangle rectangle2 = new Rectangle(1, 2, 1, 2);
        Rectangle rectangle3 = new Rectangle(1, 2, 3, 4);

        if (rectangle1.equals(rectangle2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (rectangle1.equals(rectangle3)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

class Point {
    int xPos, yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void showPosition() {
        System.out.printf("[%d, %d]", xPos, yPos);
    }

    @Override
    public boolean equals(Object obj) {
        Point p = (Point) obj;
        return xPos == p.xPos && yPos == p.yPos;
    }
}

class Rectangle {
    Point upperLeft, lowerRight;

    public Rectangle(int x1, int y1, int x2, int y2) {
        upperLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
    }

    public void showPosition() {
        System.out.println("직사각형 위치정보...");
        System.out.print("좌 상단 : ");
        upperLeft.showPosition();
        System.out.println("");
        System.out.print("우 하단 : ");
        lowerRight.showPosition();
        System.out.println("\n");
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle r = (Rectangle) obj;
        return upperLeft.equals(r.upperLeft) && lowerRight.equals(r.lowerRight);
    }
}*/
