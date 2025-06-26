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

                            if(bank.loginAccount(aNumber, aPin)){
                                System.out.println("Login Successfully");
                            }else {
                                System.out.println("Invalid Credential");
                            }

                            System.out.println("***********************************");

                        }else{
                            System.out.println("No Accounts Registered");
                        }

                        break;

                    default:
                        System.out.println("Invalid Input");
                }
            }while(option != 6);

        }

    }
}
