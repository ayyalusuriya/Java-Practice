import java.util.Scanner;

public class BankAccount {
    int accountnumber;
    int balance;

    void deposit(int amount){
        balance+=amount;
        System.out.println("Amount Deposited" + amount);
    }
    void withdraw(int amount){
        if(amount <= balance) {
            balance -= amount;
            System.out.println(amount + "Withdrawn Successfully");
        }else{
            System.out.println("insufficient Balance");
        }
    }
    int displaybalance(){
        return balance;
    }
    public static void main(String[] args) {
        BankAccount BA = new BankAccount();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Acc Number: ");
        BA.accountnumber = sc.nextInt();

        System.out.println("Enter the initial balance: ");
        BA.balance = sc.nextInt();


        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Amount: ");
                    int depositAmount = sc.nextInt();
                    BA.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    int withdrawAmount = sc.nextInt();
                    BA.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current Balance: " + BA.displaybalance());
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}