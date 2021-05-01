
// Displaying Records
import java.util.*;
import java.sql.*;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args) {

        // creates three different Connection objects
        Connection conn = null;
        Statement stmt = null;

        try {
            //taking values from users
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Item name: ");
            String str = sc.next();
            System.out.println("Enter Unit Price");
            int up = sc.nextInt();
            System.out.println("Enter Quantity");
            int q = sc.nextInt();
            // calculation for price , discount , net price 
            int pr = up * q;
            float dis = (float) pr * .05f;
            float np = (float) pr - dis;
           // showing output 
            System.out.println("The price of Item is: " + pr);
            System.out.println("The Discount is: " + dis);
            System.out.println("The net Price is: " + np);
            //connecting to sql server 
            String url1 = "jdbc:mysql://localhost:3307/itembill";
            String user = "root";
            String password = "";

            conn = DriverManager.getConnection(url1, user, password);
            if (conn != null) {
                System.out.println("Connected to the database itembill");
            }
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            String qry = "insert into product(ItemName,UnitPrice,Quantity,Price,Discount,NetPrice)values('" + str
                    + "'," + up + "," + q + "," + pr + "," + dis + "," + np + ")";
            stmt.executeUpdate(qry);
            System.out.println("Data Inserted");
            //show all the tables 
            String sql;
            sql = "SELECT * FROM  product ";
            ResultSet rs = stmt.executeQuery(sql);
            // Extract data from result set

            System.out.println("Srno\tItemName\tUnitPrice\tQuantity\tPrice\t\tDiscount\t  NetPrice");
            while (rs.next()) {
                // Retrieve by column name
                int srno = rs.getInt("sr.no");
                String itemname = rs.getString("ItemName");
                int unitprice = rs.getInt("UnitPrice");
                int quantity = rs.getInt("Quantity");
                int price = rs.getInt("Price");
                float discount = rs.getFloat("Discount");
                float netprice = rs.getFloat("NetPrice");

                // Display values
                System.out.print(srno + "\t" + itemname + "\t\t" + unitprice + "\t\t" + quantity + "\t\t" + price
                        + "\t\t" + discount + "\t\t" + netprice + "\n");
            }

            // Searching item with name 

            System.out.println("Find item...");
            String f = sc.next();

            String find = "Select * from product where ItemName='"+f+"'";
            ResultSet rs1 = stmt.executeQuery(find);
            while (rs1.next()) {
                    // Retrieve by column name
                    int srno = rs1.getInt("sr.no");
                    String itemname = rs1.getString("ItemName");
                    int unitprice = rs1.getInt("UnitPrice");
                    int quantity = rs1.getInt("Quantity");
                    int price = rs1.getInt("Price");
                    float discount = rs1.getFloat("Discount");
                    float netprice = rs1.getFloat("NetPrice");
    
                    // Display values
                    System.out.print(srno + "\t" + itemname + "\t\t" + unitprice + "\t\t" + quantity + "\t\t" + price
                            + "\t\t" + discount + "\t\t" + netprice + "\n");

            }

            //  Clean-up environment
            sc.close();
            rs1.close();
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
}