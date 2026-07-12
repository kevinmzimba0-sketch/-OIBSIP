import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000.00;
        int choice;

        do {
            System.out.println("\n========== ATM INTERFACE ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.printf("Current Balance: R%.2f%n", balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: R");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf("Deposit Successful! New Balance: R%.2f%n", balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: R");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid withdrawal amount.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdraw;
                        System.out.printf("Withdrawal Successful! Remaining Balance: R%.2f%n", balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
