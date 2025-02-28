package bankaccount;

public class Main {

    /*
    Teeme pangakonto (Account klass)
    Väljad:
    konto nr (String accountNumber)
    kontojääk (double balance)
    kliendi nimi (String name)
    kliendi email (String email)
    kliendi tel. nr (String phoneNumber)

    igale väljale getter ja setter

    meetod, et raha sisse panna
            +balance

    meetod, et raha välja võtta
            -balance (kontr., et kontol oleks piisavalt raha)
     */

    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.getName());
        account.setAccountNumber("12325");
        account.setName("Juku");
        account.setPhoneNumber("23463467");
        account.setEmail("juku@mail.ee");
        account.setBalance(50);

        account.deposit(50);
        account.withdraw(70);
        account.withdraw(60);

        Account uusAccount = new Account("346", 35,
                "Juhan", "juhan@mail.ee","34647547");
        System.out.println(uusAccount.getName());
        System.out.println(uusAccount.getBalance());

        Account poolAccount = new Account("2345", 15, "Pets");
        System.out.println(poolAccount.getName());
        System.out.println(poolAccount.getPhoneNumber());

    }

}
