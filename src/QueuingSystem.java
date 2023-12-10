import java.util.Scanner;

public class QueuingSystem {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        CustomizedQueuingSystem queuingSystem = CustomizedQueuingSystem.getInstance();
        int loop = 0;

        while(loop == 0) {
            System.out.println("Greetings From Pag-ibig Office! ");
            System.out.println("1. Add New Queue\n" +
                    "2. Remove Queue\n" +
                    "3. Show Current Queue Number\n" +
                    "4. Clear Queue\n" +
                    "5. Exit");
            System.out.println();
            System.out.print("Select an option: ");
            int option = enter.nextInt();

            switch (option) {
                case 1:
                    System.out.println();
                    System.out.print("Enter user's name: ");
                    String name = enter.next();
                    if (!queuingSystem.isUserLoggedIn()) {
                        queuingSystem.addQueue(name);
                        queuingSystem.addCount();
                    } else {
                        System.out.println("Another user is still in line...");
                        System.out.println();
                    }
                    break;

                case 2:
                    queuingSystem.removeQueue();
                    break;

                case 3:
                    queuingSystem.currentCount();
                    break;

                case 4:
                    queuingSystem.clearCount();
                    break;

                case 5:
                    System.out.println("Exiting the Program...");
                    loop = 1;
                    break;

                default:
                    System.out.println("Option is Invalid!");
                    break;
            }
        }
    }

}
