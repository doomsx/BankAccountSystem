import java.util.ArrayList;

class Bank{
    private ArrayList<Account> accounts = new ArrayList<>();

    public void createAccount (Account a){
        accounts.add(a);
    }

    public boolean loginAccount (int aNum, int aPin){
        for (Account a : accounts){
            if(aNum == a.getAccountNumber() && aPin == a.getPIN()){
                return true;
            }
        }
        return false;
    }

    public float getBalance(int aNum){
        for (Account a : accounts){
            if(a.getBalance() > 0){
                return a.getBalance();
            }else {
                return 0;
            }
        }
        return 0;
    }

    public boolean withdraw(int aNum, float money){
        for(Account a: accounts){
            if(aNum == a.getAccountNumber()){
                if(a.getBalance() > 0){
                    float balance = a.getBalance();
                    if(balance > money){
                        float totalMoney = balance - money;
                        a.setBalance(totalMoney);
                        return true;
                    }else{
                        return false;
                    }
                }
            }
        }
        return false;
    }
    public boolean deposit(int aNum, float money){
        for(Account a : accounts){
            if(aNum == a.getAccountNumber()){
                a.setBalance(money);
                return true;
            }
        }
        return false;
    }
}
