package home;
import home.*;
import java.net.*;
import java.io.*;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Server {
    private Socket socket = null;
    private ServerSocket server = null;
    private ObjectOutputStream out = null;
    private DataInputStream in = null;
    javax.swing.JTable Data;
   public Server(int port)  {
      try {
          server = new ServerSocket(port);
          socket = server.accept();
          in= new DataInputStream(socket.getInputStream());
          out = new ObjectOutputStream(socket.getOutputStream());
          while(true) {
              String option = in.readUTF();
              int op = Integer.parseInt(option);
              String searcher="";
              switch(op) {
                  case 1: Connection c = AddtoStocks(searcher);
                    out.writeObject(c);
                      break;
//                  case 2: searcher = in.readUTF();
//                      table = AddtoStocks(searcher);
//                      out.writeObject(table);
//
//                      break;
//                  case 3: table = AddtoOrders(searcher);
//                          out.writeObject(table);
//
//                      break;
//                  case 4: searcher = in.readUTF();
//                      table = AddtoOrders(searcher);
//                      out.writeObject(table);
//                      break;
//                  case 5: table = AddtoSuppliers(searcher);
//                          out.writeObject(table);
//                      break;
//                  case 6: searcher = in.readUTF();
//                      table = AddtoSuppliers(searcher);
//                      out.writeObject(table);
//                      break;
//                  case 7: table = AddtoExpDt();
//                          out.writeObject(table);
//                      break;
//                  case 8: socket.close();
//                    in.close();
//                    out.close();
//                      break;
                  default : break;
              }
          }
          
          
      } catch(Exception e) {}
   }
	Connection AddtoStocks(String searcher) {
            Connection c=null;

            try {
			DefaultTableModel StocksTable = new DefaultTableModel();
			StocksTable.setColumnCount(0);
			StocksTable.setRowCount(0);
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedERP","root","admin");
		} catch(Exception e) {
		}
                return c;

	}

        public void WorkingOnOrders() {

            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedERP","root","admin");
                Statement s = c.createStatement();
                Statement ss=c.createStatement();
                ResultSet rs = s.executeQuery("select TabName from Stocks where Quantity < 90");

                while(rs.next()) {
                    ss.executeUpdate("Insert into OrderList values('"+rs.getString(1)+"',50)");
                }
                c.close();
            }catch(Exception e) {

            }
        }
        
        void AddtoOrders(String searcher) {
            try {
                    DefaultTableModel StocksTable = (DefaultTableModel)  Data.getModel();
                    StocksTable.setColumnCount(0);
                    StocksTable.setRowCount(0);
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedERP","root","admin");
                    Statement s = c.createStatement();
                    ResultSet rs;
                    if(searcher.equals("")) rs=s.executeQuery("select * from OrderList");
                    else rs = s.executeQuery("select * from OrderList where TabName like '"+searcher+"%'");
                    StocksTable.addColumn("Tablet Name");
                    StocksTable.addColumn("Quantity");
                    while(rs.next()) { 

                            Object[] row={rs.getString(1),rs.getInt(2)};
                            StocksTable.addRow(row);
                    }
                    c.close();
            } catch(Exception e) {

            }
        }
		
	void AddtoSuppliers(String searcher) {
		try {
			DefaultTableModel StocksTable = (DefaultTableModel)  Data.getModel();
			StocksTable.setColumnCount(0);
			StocksTable.setRowCount(0);
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedERP","root","admin");
			Statement s = c.createStatement();
			ResultSet rs;
                        if(searcher.equals(""))rs= s.executeQuery("select * from Supplier");
                        else rs=s.executeQuery("select * from Supplier where TabName like '" + searcher+"%'");
			StocksTable.addColumn("Tablet Name");
			StocksTable.addColumn("Distributor");
			StocksTable.addColumn("Contact No.");
			
			while(rs.next()) { 

				Object[] row={rs.getString(1),rs.getString(2),rs.getString(3)};
				StocksTable.addRow(row);
			}
			c.close();
		} catch(Exception e) {
			
		}
	}
	void AddtoExpDt() {
		try {	
			DefaultTableModel StocksTable = (DefaultTableModel)  Data.getModel();
			StocksTable.setColumnCount(0);
			StocksTable.setRowCount(0);
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedERP","root","admin");
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("select * from ExpDt where ExpDate < date_add(now(),interval 1 month)");
			StocksTable.addColumn("Tablet Name");
			StocksTable.addColumn("Expiry Date");
			
			while(rs.next()) { 

				Object[] row={rs.getString(1),rs.getDate(2)};
				StocksTable.addRow(row);
			}
			c.close();
		} catch(Exception e) {
			
		}
	}
	

	
      
   public static void main(String args[]) {
       Server server = new Server(5003);
    
    }

}
