import java.util.LinkedHashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts = new LinkedHashMap<>();
    public boolean addAccount(Account account){
        if (accounts.containsKey(account.getAccountNumber())) {
            return false;
        }
        accounts.put(account.getAccountNumber(), account);
        return true;
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
    public void printAllAccounts() {
        for (Account acc : accounts.values()) {
            acc.printInfo();
        }
    }
}