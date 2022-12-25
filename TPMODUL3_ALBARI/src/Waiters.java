public class Waiters implements Runnable{
    private final int orderQty;
    private final int customerID;
    public static int foodPrice = 69000;
    

    public Waiters(int orderQty, int customerID) {
        this.orderQty = orderQty;
        this.customerID = customerID;
    }

    public void orderInfo(){
        System.out.println("=========================================\nCustomer ID = " + customerID + 
        "\nNumber of Food: " + orderQty + 
        "\nTotal Price: $" + (orderQty * foodPrice) + 
        "\nHave a nice day" +
        "\n=========================================");
    }

    public void getFood(){
        synchronized(Restaurant.getLock()){
            Restaurant r1 = new Restaurant();
            r1.setWaitingForPickup(false);
            System.out.println("Waiter: Food is ready to deliver");
            
            if (Restaurant.getFoodNumber() == orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the restaurant to make another food\n");
        }
    }

    @Override
    public void run() {
        while (true) {
            getFood();
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
