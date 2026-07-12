import java.util.Scanner;

public class OnlineReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        System.out.println("===== ONLINE RESERVATION SYSTEM =====");

        System.out.print("Username: ");
        String user = sc.nextLine();

        System.out.print("Password: ");
        String pass = sc.nextLine();

        if (!user.equals(username) || !pass.equals(password)) {
            System.out.println("Invalid Login!");
            sc.close();
            return;
        }

        System.out.println("\nLogin Successful!");

        String passengerName = "";
        int trainNumber = 0;
        String trainName = "";
        String classType = "";
        String date = "";
        String from = "";
        String to = "";
        boolean booked = false;

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Reservation");
            System.out.println("2. Cancellation");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Passenger Name: ");
                    passengerName = sc.nextLine();

                    System.out.print("Train Number: ");
                    trainNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Train Name: ");
                    trainName = sc.nextLine();

                    System.out.print("Class Type: ");
                    classType = sc.nextLine();

                    System.out.print("Journey Date: ");
                    date = sc.nextLine();

                    System.out.print("From: ");
                    from = sc.nextLine();

                    System.out.print("To: ");
                    to = sc.nextLine();

                    booked = true;

                    System.out.println("\nReservation Successful!");
                    break;

                case 2:

                    if (!booked) {
                        System.out.println("No reservation found.");
                    } else {

                        System.out.println("\nReservation Details");
                        System.out.println("Passenger: " + passengerName);
                        System.out.println("Train No: " + trainNumber);
                        System.out.println("Train Name: " + trainName);
                        System.out.println("Class: " + classType);
                        System.out.println("Date: " + date);
                        System.out.println("From: " + from);
                        System.out.println("To: " + to);

                        System.out.print("\nConfirm cancellation? (Y/N): ");
                        char confirm = sc.next().charAt(0);

                        if (confirm == 'Y' || confirm == 'y') {
                            booked = false;
                            System.out.println("Reservation Cancelled Successfully!");
                        } else {
                            System.out.println("Cancellation Cancelled.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using Online Reservation System.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Option!");
            }
        }
    }
}
