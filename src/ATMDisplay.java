import java.util.Scanner;
public class ATMDisplay {
    public Scanner scan;
    public Customer user;
    public ATM atm;
    public ATMDisplay() {}
        public void start()
        {
            Scanner scan= new Scanner(System.in);
            //used to make stuff pretty and print important and receipt stuff
            System.out.println("----------------------------------------");
            System.out.println("          Welcome to the ATM            ");
            System.out.println();
            System.out.println("Please enter your name:                 ");
            String name = scan.nextLine();
            System.out.println("Please create a pin:                    ");
            int pin = scan.nextInt();
            user = new Customer(pin, name);
            Account savings = new Account();
            Account checkings = new Account();
            atm = new ATM();
            System.out.println("Congratulations, you are now a customer!");
            System.out.println();
            System.out.println("----------------------------------------");
            int option = 0;
            while(option != 7) {
                System.out.println("Pick an option: \n1. Withdraw money\n2. Deposit money\n3. Transfer money between accounts\n4. Get account balances\n5. Get transaction history\n6. Change PIN\n7. Exit");
                option = scan.nextInt();
                if(option == 7){break;}
                if(option == 1 || option == 2 || option == 3) {
                    System.out.println("Which account would you like to use for this (checking or savings? ");
                    String account = scan.nextLine();
                    //to be implemented with ATM class methods
                    if(option == 1) {

                    } else if(option == 2) {

                    } else {

                    }

                }

            }
        }
    }
}
