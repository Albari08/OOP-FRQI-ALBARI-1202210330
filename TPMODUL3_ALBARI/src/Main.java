import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        try {
            System.out.print("Customer ID: ");
            int customerID = obj.nextInt();
            System.out.print("Enter how much food to make: ");
            int orderQty = obj.nextInt();

            Restaurant r1 = new Restaurant();
            Waiters w1 = new Waiters(orderQty, customerID);
            Thread th1 = new Thread(r1);
            Thread th2 = new Thread(w1);

            th1.start();
            th2.start();
            th1.join();
            th2.join();
        }
        catch(Exception e){
            System.out.println("Input must be Integer");
        } finally{
            obj.close();
        }
    }
}
