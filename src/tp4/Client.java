package tp4;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    static final int port = 1200;

    public static void main(String[] args) throws Exception {

        System.out.println("connection request");

        //Create a client socket
        Socket socket = new Socket("127.0.0.1", port);
        System.out.println("Connection established");

        // create in / out
        BufferedReader inClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter outClient = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);

        System.out.println("donner votre nom");
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        outClient.println(a);


        System.out.println(inClient.readLine());



        /* 5edmti 1,2 System.out.println("donner votre nom");
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();

        System.out.println("donner un caracter");
        Scanner p=new Scanner(System.in);
        char c=p.nextLine().charAt(0);*/

        // Write message to the server
      /*  outClient.println(a);
        outClient.println(c);
        // Read a message from the server
         System.out.println(inClient.readLine());*/

        //****** if you're using DataInputStream & DataOutputStream ******

        //DataInputStream inClient = new DataInputStream(socket.getInputStream());
        //DataOutputStream outClient = new DataOutputStream(socket.getOutputStream());

        //System.out.println("Enter your msg");
        //String str = new Scanner(System.in).nextLine();
        //outClient.writeUTF(str);
        //outClient.flush();

        //****** if you're using DataInputStream & DataOutputStream ******

        //close in / out
        inClient.close();
        outClient.close();

        // close client socket
        socket.close();
    }
}
