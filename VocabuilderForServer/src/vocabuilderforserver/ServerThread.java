/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vocabuilderforserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Moqsadur Rahman
 */
public class ServerThread implements Runnable {

    String messageIn;
    public static DataOutputStream dataOutToClient; // output stream to server
    public static  DataInputStream dataInFromClient; 
    Socket connection2;
    

    ServerThread() {
        Thread t = new Thread(this);   //eikhane this dea lagbo......................................

        t.start();
        // methodSelection = new MethodSelection();
    }

    public void run() {
        try {
            connection2 = StartMenu.connection;
            //closeConnection();
            getStreams();
            send();
            receive();
        } catch (Exception e) {       //changed......................................................
            System.out.println("Exception in run() method, after calling the processConnection() method");
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    // get streams to send and receive data
    private void getStreams() throws IOException {
        // set up output stream for objects
        dataOutToClient = new DataOutputStream(connection2.getOutputStream());  // server er output na thakle client er input create hoite pare na.......
        dataOutToClient.flush(); // flush output buffer to send header information
        // set up input stream for objects
        dataInFromClient = new DataInputStream(connection2.getInputStream());
       
        System.out.println("\nGot I/O streams\n");

    } // end method getStreams

    // process connection with client
    private void send() throws IOException {
       // do // process messages sent from client
        {
           for(int i = 0; i<10; ++i)
           {
               //dataOutToClient.writeUTF("hossain");
           }
       
        } //while (true);
    } // end method processConnection

    private void receive() {
        //try {
            String str = "";
            for(int i = 0; i<10; ++i){
                //str = dataInFromClient.readUTF();
                System.out.println(str);
            }
        } //catch (IOException e) {
             //System.out.println("Exception"); 
      //  }
    //}

    // close streams and socket

    private void closeConnection() {
        try {
            System.out.println("c.........o.....n.......n.........n.........e........c............t");
            dataOutToClient.close(); // close output stream
            dataInFromClient.close(); // close input stream
            connection2.close(); // close socket
        } // end try
        catch (Exception e) { //changed..............................................
            System.out.println("Exception in closeConnection() method, after calling the connection2.close()");
            e.printStackTrace();
        } // end catch
    } // end method closeConnection

}
