class Account {
    private String name;
    private int AccountNumber;
    private int PIN;
    private float balance;
    
    public Account(String name, int AccountNumber, int PIN, float balance){
        this.name = name;
        this.AccountNumber = AccountNumber;
        this.PIN = PIN;
        this.balance = balance;
    }

    public String getName() { return name; }
    public int getAccountNumber() { return AccountNumber; }
    public int getPIN() { return PIN; }
    public float getBalance() { return balance; }


    public void setName(String name) { this.name = name; }
    public void setAccountNumber(int accountNumber) { AccountNumber = accountNumber; }
    public void setPIN(int pIN) { PIN = pIN; }
    public void setBalance(float balance) { this.balance = balance; }


    @Override
    public String toString(){return "Name: " + name + "\nAccount Number: " + AccountNumber + "\nBalance: " + balance;}
}
