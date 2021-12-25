package tp5;

public class BankAccount {

    int id;
    String userName;
    double balance;
    public BankAccount(int id,String userName,double balance)
    {
        this.id=id;
        this.userName=userName;
        this.balance=balance;

    }

void deposit (double b){
balance=balance+b;
}

void withdraw(double b)
{balance=balance-b;
}

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
