public class Calculation implements Runnable{
    private double radius;
    private double side;
    private double area;
    private double phi = 3.14;

    public double getSquare() {
        return area;
    }

    public double getCircle() {
        return area;
    }

    public double getTrapezoid() {
        return area;
    }

    public void setSquare(double side) {
        this.side = side;
        area = side * side;
        if (side < 1){
            throw new IllegalArgumentException();
        }
    }

    public void setCircle(double radius) {
        this.radius = radius;
        area = phi * radius * radius;
        if (radius < 1){
            throw new IllegalArgumentException();
        }
    }

    public void setTrapezoid(double a, double b, double t) {
        this.side = a;
        this.side = b;
        this.side = t;
        area = 0.5 * (a + b) * t;
        if ((a < 1) || (b < 1) || (t < 1)){
            throw new IllegalArgumentException();
        }
    }
    
    @Override
    public void run() {
        System.out.println("\n====Program will start in====");
        byte i = 3;
        while (i > 0){
            try {
                System.out.println("Starting with thread " + i--);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}