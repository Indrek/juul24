package bankaccount;

public class Account {

    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    //Konstruktor
    //Määratakse esialgsed väärtused
    public Account(String accountNumber, double balance, String name, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public Account() {
        this("default number", 0, "default name",
                "default email", "default phone");
    }

    public Account(String accountNumber, double balance, String name) {
        this(accountNumber,balance,name, "tühi email", "tühi telefon");
    }

    //raha sisse
    public void deposit(double amount) {
        balance += amount; //balance = balance + amount
        System.out.println(amount + " lisatud, uus kontojääk: " + balance);

    }
    //raha välja
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Kontol pole piisavalt raha");
            return;
        }
        balance -= amount; //balance = balance - amount
        System.out.println(amount + " välja võetud, uus kontojääk: " + balance);
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
