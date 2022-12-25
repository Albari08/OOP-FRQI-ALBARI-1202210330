public class Restaurant implements Runnable{
    private boolean waitingForPickup = false;
    private static int foodNumber = 1;
    private static final Object lock = new Object();

    public static Object getLock() {
        return lock;
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getFoodNumber() {
        return foodNumber;
    }

    public void makeFood(){
        synchronized(Restaurant.lock){
            if (waitingForPickup) {
                try {
                    System.out.println("Restaurant: Waiting for the Waiter to deliver the food");
                    Restaurant.lock.wait();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            waitingForPickup = true;
            System.out.println("Restaurant: Making Food Number " + foodNumber++);
            System.out.println("Restaurant: Telling the waiter to get the coffee");
            Restaurant.lock.notifyAll();
            System.out.println("\nRestaurant: Telling the waiter to get the food");
        }
    }
    
    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
