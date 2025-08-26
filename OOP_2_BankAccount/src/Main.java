class Main {
    double balance;
    BankAccount(double initial){
        balance = initial;
    }
    void deposit(double amount){
        balance += amount;
    }
    void withdraw(double amount){
        if(balance >= amount) balance -= amount;
        else System.out.println("Insufficient funds");
    }
    void display(){
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.display();
    }
}