package tp5;

import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            /*System.out.println(service1.majuscule("wadii"));
            System.out.println(service1.position("wadii",'i'));
            System.out.println(service1.palindrome("azza"));*/
            service1.createAccount(1,"wadii",0);
            service1.deposit(100);
            service1.withdraw(50);


        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }
    }
}
