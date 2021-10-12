package Classes;

public class Bank {
    private int account;
    private double balance;
    private String name;
    private String email;
    private int phone;

    //SETTERS

    public void setAccount(int account){
        this.account = account;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }

    //GETTERS
    public int getAccount(){
        return this.account;
    }
    public double getBalance(){
        return this.balance;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public int getPhone(){
        return this.phone;
    }

    public void balanceDeposit(double amount) {
        this.balance += amount;
        System.out.println(amount + " has been deposited, new balance is " + this.balance);
    }

    public void balanceWithdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println(amount + " has been withdrawn, new balance is " + this.balance);
        }
    }
}
