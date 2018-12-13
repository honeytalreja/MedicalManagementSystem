package home;
import java.net.*;
import java.io.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Client
{
    private Socket socket = null;
    private ObjectInputStream  in= null;
    private DataOutputStream out = null;
    public Client(String address, int port)
        {
           try
             {
                socket = new Socket(address, port);
                System.out.println("Connected");
                in  = new ObjectInputStream(socket.getInputStream());
                out    = new DataOutputStream(socket.getOutputStream());
                
             } catch(Exception e) {}

        }
    public Connection request(String type,String search) throws ClassNotFoundException {
        Connection c=null;
        try {
            out.writeUTF(type);
            if(!search.equals("")) out.writeUTF(search);
            c = (Connection) in.readObject();
            
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
        
    }
    public static void main(String args[])
    {
        Client client = new Client("127.0.0.1", 5003);
    }
}
