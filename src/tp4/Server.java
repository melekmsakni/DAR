package tp4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    static final int port = 1200;

    public static void main(String[] args) throws Exception {

        // Listen to a specific port

        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Waiting for connection");
        Socket socClient = serverSocket.accept(); // Accept a client socket
        System.out.println("Connection established");

        // Initialize in / out
        BufferedReader inServer = new BufferedReader(new InputStreamReader(socClient.getInputStream()));
        PrintWriter outServer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socClient.getOutputStream())), true);


        String a=inServer.readLine();

                int j=a.length()-1;
                int i=0;
                while(a.charAt(i)==a.charAt(j) && i<a.length()/2 && j>(a.length()/2)-1  ) {
                    i++;
                    j--;
                }
                boolean k;
                if (i==a.length()/2)
                    k=true;
                else
                    k=false;


        outServer.println(String.valueOf(k));









        // Read message sent by the client
       /* 5edmti  String a=inServer.readLine();
        char c=inServer.readLine().charAt(0);
        outServer.println( a.indexOf(c));
        // Write message to the client
*/

        // ****** if you're using DataInputStream & DataOutputStream ******

        //DataInputStream inServer = new DataInputStream(socClient.getInputStream());
        //DataOutputStream outServer = new DataOutputStream(socClient.getOutputStream());

        // Read message sent by the client
        //String s = inServer.readUTF();
        //String strUpper = str.toUpperCase();
        //System.out.println("The msg was " + strUpper);

        // ****** if you're using DataInputStream & DataOutputStream ******

        // Close in / out
        inServer.close();
        outServer.close();

        // Close client socket
        socClient.close();
        serverSocket.close();
    }
}
