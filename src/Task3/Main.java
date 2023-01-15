package Task3;

import Task3.Rectangle;
import Task3.SimpleColor;

import java.util.Scanner;


public class Main {
    private static final String INPUT = "Введите координаты x и y: ";
    public static final Rectangle R1 = new Rectangle(-6,-2,-2,0) ;
    public static final Rectangle R2 = new Rectangle(-2,-2,0,4) ;
    public static final Rectangle R3 = new Rectangle(0,-2,3,0) ;
    public static final Rectangle R4 = new Rectangle(-2,-4,0,-2) ;
    public static final Rectangle R5 = new Rectangle(0,-6,3,-2) ;

    public static final Circle C1 = new Circle(-3,6,5) ;
    public static final Circle C2 = new Circle(4,5,3) ;

    public static void main(String[] Args) {
        tests();
        Scanner scanner = new Scanner(System.in);
        System.out.print(INPUT);
        double testx = scanner.nextDouble();
        double testy = scanner.nextDouble();
    printColorForPoint(testx,testy);
    }

    private static void tests() {
        printColorForPoint(-5,8);
        printColorForPoint(5,6);
        printColorForPoint(-1.5,2.5);
        printColorForPoint(-1,1);
        printColorForPoint(-5,-1);
        printColorForPoint(-1.5,-1.5);
        printColorForPoint(2,-1.444);
        printColorForPoint(-1,-3.5);
        printColorForPoint(2.5,-2.5);

    }

    public static SimpleColor getColor(double x, double y) {
        if (C2.isIn(x, y)) {
            return SimpleColor.WHITE;
        }
        if (R2.isIn(x, y) && C1.isIn(x, y)) {
            return SimpleColor.YELLOW;
        }
        if (R1.isIn(x, y)) {
            return SimpleColor.GREEN;
        }
        if (C1.isIn(x, y)) {
            return SimpleColor.BLUE;
        }
        if (R2.isIn(x, y)) {
            return SimpleColor.ORANGE;
        }
        if (R3.isIn(x, y)) {
            return SimpleColor.ORANGE;
        }
        if (R4.isIn(x, y) || R5.isIn(x, y)) {
            return SimpleColor.BLUE;
        }

        return SimpleColor.WHITE;
    }
    public static void printColorForPoint(double x, double y) {
        //System.out.println("(%x, %y) -> %g%c",x,y,getColor(x,y));
        System.out.printf("(%.3f, %.3f) -> %s%n", x, y, getColor(x, y));
    }
}