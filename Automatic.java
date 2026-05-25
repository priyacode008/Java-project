import java.util.*;

class Automatic {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int pin = 1517;;
        int enteredPin;
        int balance = 10000;
        int choice, amount;

        System.out.println("===== ATM SYSTEM =====");
        System.out.print("Enter PIN: ");
        enteredPin = sc.nextInt();

        if(pin != enteredPin){
            System.out.println("Wrong PIN");
            return;
        }

        while(true){

            System.out.println("\n1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.println("Balance: Rs."+balance);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    amount = sc.nextInt();

                    if(amount > 0){
                        balance += amount;
                        System.out.println("Deposit Successful");
                    }
                    else{
                        System.out.println("Invalid Amount");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    amount = sc.nextInt();

                    if(amount <= balance){
                        balance -= amount;
                        System.out.println("Withdraw Successful");
                    }
                    else{
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 4:
                    System.out.println("Thank You");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}