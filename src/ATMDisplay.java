import java.util.Scanner;
public class ATMDisplay {
    public Scanner scan;
    public Customer user;
    public ATM atm;
    public ATMDisplay() {}
        public void start()
        {
            Scanner scan = new Scanner(System.in);
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
            String choice = "yes";


            while(option != 7 && choice.equals("yes")) {
                boolean success = true;
                System.out.print("Please enter your pin:");
                int enterPin = scan.nextInt();
                while(enterPin != user.getPin()){
                    System.out.print("Incorrect, please try again:");
                    enterPin = scan.nextInt();
                }
                System.out.println();
                System.out.println("Pick an option: \n1. Withdraw money\n2. Deposit money\n3. Transfer money between accounts\n4. Get account balances\n5. Get transaction history\n6. Change PIN\n7. Exit");
                option = scan.nextInt();
                if(option == 7){break;}
                if(option == 1 || option == 2) {
                    System.out.println("Which account would you like to use for this (checking or savings? ");
                    String account = scan.nextLine();
                    if(option == 1) {
                        System.out.println("Withdrawal Amount: ");
                        double withdraw = scan.nextDouble();

                        if(account.equals("checkings")) {
                            if (withdraw <= checkings.getAmount()) {
                                checkings.setAmount(atm.withdraw(checkings.getAmount(), withdraw));
                            } else {
                                success = false;
                            }
                        } else {
                            if (withdraw <= savings.getAmount()) {
                                savings.setAmount(atm.withdraw(savings.getAmount(), withdraw));
                            } else {
                                success = false;
                            }
                        }

                    } else {
                        System.out.println("Deposit Amount: ");
                        double deposit = scan.nextDouble();
                        if(account.equals("checkings")) {
                            checkings.setAmount(atm.deposit(checkings.getAmount(), deposit));
                        } else {
                            savings.setAmount(atm.deposit(savings.getAmount(), deposit));
                        }
                        System.out.println("Confirmation Receipt: ");
                        String id = atm.ID(option);
                        String message = "Deposited $" + deposit + " into " + account + " account "  + "(" + id + ")";
                        atm.updateReceipt(message +  "\nSavings Account: $ " + savings.getAmount() + ", Checkings Account: " + checkings.getAmount());
                        System.out.println(message + "\nThe deposit was a success\n");
                    }
                if (option == 3) {
                    System.out.println("Which account would you like to transfer money from (checkings or savings)?");
                    String acc = scan.nextLine();
                    System.out.println("Which account would you like to transfer money to (checkings or savings)?");
                    String acc2 = scan.nextLine();
                    while(acc.equals(acc2)) {
                        System.out.println("You cannot transfer money to the same account");
                        System.out.println("Please try again.");
                        System.out.println();
                        System.out.println("Which account would you like to transfer money from (checkings or savings)?");
                        acc = scan.nextLine();
                        System.out.println("Which account would you like to transfer money to (checkings or savings)?");
                        acc2 = scan.nextLine();
                    }
                    System.out.println("Transfer Amount: ");
                    double transfer = scan.nextDouble();
                    if(acc.equals("checkings")) {
                        checkings.setAmount(atm.transferPtOne(checkings.getAmount(), transfer));
                        savings.setAmount(atm.transferPtTwo(savings.getAmount(), transfer));
                    } else {
                        savings.setAmount(atm.transferPtOne(savings.getAmount(), transfer));
                        checkings.setAmount(atm.transferPtTwo(checkings.getAmount(), transfer));
                    }

                }

                if (option == 4){
                    System.out.println("Savings Account: $" + savings.getAmount());
                    System.out.println("Checkings Account: $" + checkings.getAmount());
                }

                if(option == 5){

                }

                if(option == 6){
                    System.out.println("Enter New PIN: ");
                    int newPIN = scan.nextInt();
                    user.setPin(newPIN);
                }

                System.out.print("Would you like to do anything else?");
                choice = scan.nextLine();

            }
            System.out.println("Thank you for being a customer at our ATM!");
        }
    }
}
