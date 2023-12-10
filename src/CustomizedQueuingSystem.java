import java.util.*;

public class CustomizedQueuingSystem {
    private static CustomizedQueuingSystem instance;
    private String user;
    private boolean isUserLoggedIn;
    private int queueNumber;

    private CustomizedQueuingSystem() {

    }

    public static synchronized CustomizedQueuingSystem getInstance() {
        if (instance == null)
            instance = new CustomizedQueuingSystem();
        return instance;
    }

    public synchronized boolean isUserLoggedIn() {
        return isUserLoggedIn;
    }

    public synchronized void addQueue(String user) {
        if (!isUserLoggedIn) {
            isUserLoggedIn = true;
            this.user = user;
            System.out.println(user + " is in queue!");
            System.out.println();
        } else {
            System.out.println("User is already logged in!");
            System.out.println();
        }
    }

    public synchronized void removeQueue() {
        isUserLoggedIn = false;
        System.out.println(user + " is removed from queue.");
        System.out.println();
    }

    public synchronized void addCount() {
        queueNumber += 1;
        System.out.println("Current queue number is " + queueNumber);
        System.out.println();
    }

    public synchronized void currentCount() {
        System.out.println("Current queue number is " + queueNumber);
        System.out.println();
    }

    public synchronized void clearCount() {
        queueNumber = 0;
        System.out.println("Current queue number is " + queueNumber);
        System.out.println();
    }
}


