class BankAccount {
    int acctNo;
    String custName;
    boolean accType;  //true = savings, false = checking
    float balance;
    public static int LOW_BALANCE_SAVINGS = 1000;
    public static int LOW_BALANCE_CHECKING = 5000;

    public int getAcctNo() {
        return acctNo;
    }

    public String getCustName() {
        return custName;
    }

    BankAccount(long accno, String cust_name, boolean acctType, double initBal) throws LowBalanceException, IllegalArgumentException {
        if (initBal < 0) {
            throw (new IllegalArgumentException("negative balance not allowed"));
        }
        if (acctType) {
            if (initBal <= BankAccount.LOW_BALANCE_SAVINGS) {
                throw (new LowBalanceException("Low Balance Exception"));
            }

        } else {
            if (initBal <= BankAccount.LOW_BALANCE_CHECKING) {
                throw (new LowBalanceException("Low Balance Exception"));
            }

        }


        balance = (float) initBal;

        custName = cust_name;

        accType = acctType;

        acctNo = (int) accno;

    }

    void deposit(float amt) throws NegativeAmount {
        if (amt < 0) {
            throw new NegativeAmount("Amount is negative ");
        } else
            balance = balance + amt;
        System.out.println(amt + " Amount has been deposited.");
    }

    float withdraw(float amt) throws NegativeAmount, AccountOverdrawnException, LowBalanceException {
        if (amt < 0) {
            throw (new NegativeAmount("negative amount not allowed"));
        }

        balance -= amt;

        if (balance < 0) {
            throw (new AccountOverdrawnException("Account Overdrawn"));
        }

        if (accType) {
            if (balance <= BankAccount.LOW_BALANCE_SAVINGS) {
                throw (new LowBalanceException("Low Balance Exception"));
            }

        } else {
            if (balance <= BankAccount.LOW_BALANCE_CHECKING) {
                throw (new LowBalanceException("Low Balance Exception"));
            }

        }
        System.out.println(amt + " Amount has been withdrawn .");
        return (balance);

    }

    float getBalance() throws LowBalanceException {
        if (accType) {
            if (balance <= BankAccount.LOW_BALANCE_SAVINGS) {
                throw (new LowBalanceException("Low Balance Exception"));
            }

        } else {
            if (balance <= BankAccount.LOW_BALANCE_CHECKING) {
                throw (new LowBalanceException("Low Balance Exception"));
            }

        }
        System.out.println("Your current balance is :" + balance);
        return (balance);

    }

}


public class Question4 {
    public static void main(String[] args) {

        try {

            BankAccount acct = new BankAccount(112, "Siri", true, 50000);
            acct.deposit(500);
            acct.withdraw(10000);
            acct.getBalance();

        } catch (AccountOverdrawnException ex) {
            System.out.println(" account overdrawn ");
        } catch (LowBalanceException ex) {
            System.out.println(" low balance exception ");
        } catch (NegativeAmount negativeAmount) {
            negativeAmount.printStackTrace();
        }
    }

}
