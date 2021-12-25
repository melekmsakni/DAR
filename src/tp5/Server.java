package tp5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Locale;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}

    public String sayHello() {
        return "Hello World !!";
    }

    public String majuscule(String x){
        return x.toUpperCase();
    }
    public int position(String x,char c)
    {
        return x.indexOf(c);
    }


    public boolean palindrome(String a)
    {
        int j=a.length()-1;
        int i=0;
        while(a.charAt(i)==a.charAt(j) && i<a.length()/2 && j>(a.length()/2)-1  ) {
            i++;
            j--;
        }

        if (i==a.length()/2)
            return true;
        else
            return false;
    }

    BankAccount bc;


    @Override
    public void createAccount(int x, String y, double z) throws RemoteException {
     bc=new BankAccount(x,y,z);
     System.out.println(bc);
    }

    @Override
    public void deposit(double x) throws RemoteException {
        bc.deposit(x);
        System.out.println(bc);
    }
    @Override
    public void withdraw(double x) throws RemoteException {
        bc.withdraw(x);
        System.out.println(bc);
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}
