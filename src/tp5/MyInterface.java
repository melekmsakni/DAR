package tp5;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    String sayHello()throws RemoteException;
    String majuscule(String x) throws RemoteException;
    int position(String x,char c) throws RemoteException;
    boolean palindrome(String x) throws RemoteException;
    void deposit(double x) throws RemoteException;
    void withdraw(double x) throws RemoteException;
    void createAccount(int x,String y,double z) throws RemoteException;
}
