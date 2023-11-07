public class Account {

    private int account_no;
    private String name;
    private double account_balance;
    private String email;


    public Account(int account_no, String name, double account_balance, String email) {
        this.account_no = account_no;
        this.name = name;
        this.account_balance = account_balance;
        this.email = email;
    }

    public void DepositMoney(double deposit_amount){
        this.account_balance += deposit_amount;
        System.out.println("deposit succesful and available balance is "+this.account_balance);
    }


    public void WithdrawMoney(double withdraw_amount){
            if (withdraw_amount>this.account_balance) {
                System.out.println("INsufficient balance");
            }
            else{

                this.account_balance -= withdraw_amount;
                System.out.println("withdrawal successful and balance left is :"+this.account_balance);

            }
        }
    }

