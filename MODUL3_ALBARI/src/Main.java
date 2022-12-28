import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        boolean repeat = true;
        Scanner p = new Scanner(System.in);

        do {
            try {
                System.out.print("\n===Menu Program===\n1. Square\n2. Circle\n3. Trapezoid\n0. Exit\nSelect Menu : ");
                byte o = p.nextByte();
                switch (o) {
                    case 1:
                        Calculation square = new Calculation();
                        System.out.print("\nEnter the lenght of the side of the square : ");
                        double side = p.nextDouble();
                        square.setSquare(side);
                        Thread th1 = new Thread(square);
                        th1.start();
                        th1.join();
                        System.out.println("\nThe calculation result: " + square.getSquare());
                        break;

                    case 2:
                        Calculation circle = new Calculation();
                        System.out.print("\nEnter the radius of the circle : ");
                        double radius = p.nextDouble();
                        circle.setCircle(radius);
                        Thread th2 = new Thread(circle);
                        th2.start();
                        th2.join();
                        System.out.println("\nThe calculation result: " + circle.getCircle());
                        break;

                    case 3:
                        Calculation trapezoid = new Calculation();
                        System.out.print("\nInsert the side of the base of the trapezoid : ");
                        double a = p.nextDouble();
                        System.out.print("Enter the upper side of the trapezoid : ");
                        double b = p.nextDouble();
                        System.out.print("Enter the height of the trapezoid : ");
                        double t = p.nextDouble();
                        trapezoid.setTrapezoid(a, b, t);
                        Thread th3 = new Thread(trapezoid);
                        th3.start();
                        th3.join();
                        System.out.println("\nThe calculation result: " + trapezoid.getTrapezoid());
                        break;

                    case 0:
                        System.out.println("\nMakasih kakak-kakak Asprak EAD OOP atas ilmunya! Sukses Selalu!");
                        break;
                
                    default:
                        System.out.println("\nOptions not Avaible");
                        continue;
                } repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("\n====Error: Input must be a number====");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("\n" + e);
                break;
            } catch (InterruptedException e) {
                System.out.println("\n" + e);
                break;
            }
        } while (repeat);
        p.close();
    }
}