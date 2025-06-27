import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println("Bank Account System");
        int option;

        try(Scanner scanner = new Scanner(System.in)){
            do {
                System.out.println("---------------");
                System.out.println("1. Create Account");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.println("---------------");
                System.out.print("Enter your choice: ");
                option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        System.out.println("***********************************");

                        System.out.println("Option 1 selected");
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                    
                        System.out.print("Enter Account Number: ");
                        int aNum = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter PIN: ");
                        int pin = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter balance: ");
                        float balance = scanner.nextFloat();
                        scanner.nextLine();

                        bank.createAccount(new Account(name, aNum, pin, balance));
                        System.out.println("***********************************");

                        break;

                    case 2:
                        if(bank.accountsNotEmpty()){
                            System.out.println("***********************************");
                            System.out.println("Option 2 selected");
                            System.out.println("Login Account");
                            System.out.print("Enter Account Number: ");
                            int aNumber = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter PIN: ");
                            int aPin = scanner.nextInt();
                            scanner.nextLine();
                            boolean login = bank.loginAccount(aNumber, aPin);
                            if(login){
                                System.out.println("Login Successfully");
                                System.out.println("***********************************");
                                int choose;
                                do{
                                    System.out.println("***********************************");
                                    System.out.println("1: Check Balance");
                                    System.out.println("2: Deposit");
                                    System.out.println("3: Withdraw");
                                    System.out.println("4. Logout");
                                    System.out.println("Select an Option: ");
                                    choose = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.println("***********************************");

                                    switch (choose) {
                                        case 1:
                                            System.out.println("***********************************");
                                            System.out.println("Checking Balance");
                                            System.out.println("Balance: "+ bank.getBalance(aNumber));
                                            System.out.println("***********************************");
                                            break;

                                        case 2:
                                            System.out.println("***********************************");
                                            System.out.println("Deposit");
                                            System.out.print("Enter ammount to deposit: ");
                                            float ammount = scanner.nextFloat();
                                            scanner.nextLine();
                                            if(bank.deposit(aNumber, ammount)){
                                                System.out.println(ammount + " Successfully deposited");
                                                System.out.println("Updated Balance: " + bank.getBalance(aNumber));
                                            }else {
                                                System.out.println("Something went wrong, try again!");
                                            }
                                            
                                            System.out.println("***********************************");
                                            break;

                                        case 3:
                                            System.out.println("***********************************");
                                            System.out.println("Withdraw");
                                            System.out.println("Balance: " + bank.getBalance(aNumber));
                                            System.out.print("Enter ammount to withdraw: ");
                                            float Ammount = scanner.nextFloat();
                                            scanner.nextLine();
                                            
                                            if(bank.withdraw(aNumber, Ammount)){
                                                System.out.println(Ammount + " Successfully Withdraw");
                                                System.out.println("Updated Balance: "+ bank.getBalance(aNumber));
                                            }else{
                                                System.out.println("Something went wrong, try again!");
                                            }
                                            System.out.println("***********************************");
                                            break;

                                        case 4:
                                            System.out.println("Loging out...");
                                            break;

                                        default:
                                            System.out.println("Invalid Input");
                                    }
                                }while(choose != 4);
                                    
                                    
                                System.out.println("***********************************");
                            }else {
                                System.out.println("Invalid Credential");
                            }

                            System.out.println("***********************************");

                        }else{
                            System.out.println("No Accounts Registered");
                        }

                        break;

                    case 3: 
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid Input");
                }
            }while(option != 3);

        }

    }
}
