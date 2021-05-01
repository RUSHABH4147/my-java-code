import java.util.*;
import java.sql.*;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args) throws Exception {

        Connection conn = null;
        Statement stmt = null;

        try {

            Scanner sc = new Scanner(System.in);
            String pass = "pass";
            String fail = "fail";
            String A = "A";
            String B = "B";
            String C = "C";
            String D = "D";

            // all query here
            String total = "UPDATE student_data SET total_marks = Physics+chemistry+mathematics+geology";
            String per = "UPDATE student_data set percentage=(total_marks/400)*100;";
            String result = "update student_data set result = '" + pass
                    + "' where Physics>35 and chemistry>35 and mathematics>35 AND geology>35 ";
            String resultf = "update student_data set result = '" + fail
                    + "' where Physics<35 OR chemistry<35 OR mathematics<35 OR geology<35";

            String gradeA = "UPDATE student_data set grade = '" + A + "'WHERE percentage>=60";
            String gradeB = "UPDATE student_data set grade = '" + B + "'WHERE percentage>=50 AND percentage<60";
            String gradeC = "UPDATE student_data set grade = '" + C + "' WHERE percentage>=35 AND percentage<50";
            String gradeD = "UPDATE student_data set grade = '" + D + "' WHERE percentage<35 ";

            // connecting to database
            String url1 = "jdbc:mysql://localhost:3307/marks";
            String user = "root";
            String password = "";

            conn = DriverManager.getConnection(url1, user, password);
            if (conn != null) {
                System.out.println("Connected to the database marks");
            }
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            // executingquery
            stmt.executeUpdate(total);
            stmt.executeUpdate(per);
            stmt.executeUpdate(result);
            stmt.executeUpdate(resultf);

            stmt.executeUpdate(gradeA);
            stmt.executeUpdate(gradeB);
            stmt.executeUpdate(gradeC);
            stmt.executeUpdate(gradeD);

            // Extract data from result set
            String sql;
            sql = "SELECT * FROM  student_data ";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println(
                    "Srno\tstudent_name\trollNo\tPhysics\tchemistry\tmathematics\tgeology\ttotal_marks\tpercentage\tresult\t\tgrade");
            while (rs.next()) {
                // Retrieve by column name
                int srno = rs.getInt("sr.no");
                String student_name = rs.getString("student_name");
                int rollNo = rs.getInt("rollNo");
                int Physics = rs.getInt("Physics");
                int chemistry = rs.getInt("chemistry");
                int mathematics = rs.getInt("mathematics");
                int geology = rs.getInt("geology");
                int total1 = rs.getInt("total_marks");
                float percentage = rs.getFloat("percentage");
                String result1 = rs.getString("result");
                String grade1 = rs.getString("grade");

                // Display values
                System.out.print(srno + "\t" + student_name + "\t\t" + rollNo + "\t" + Physics + "\t" + chemistry
                        + "\t\t" + mathematics + "\t\t" + geology + "\t" + total1 + "\t\t" + percentage + "\t\t"
                        + result1 + "\t\t" + grade1 + "\n");
            }

            // Searching student with rollNO

            System.out.println("Find with ROLL.no...");
            String f = sc.next();

            String find = "Select * from student_data where rollNo='" + f + "'";
            ResultSet rs1 = stmt.executeQuery(find);
            if (rs1.next()) {
                // Retrieve by column name
                int srno = rs1.getInt("sr.no");
                String student_name = rs1.getString("student_name");
                int rollNo = rs1.getInt("rollNo");
                int Physics = rs1.getInt("Physics");
                int chemistry = rs1.getInt("chemistry");
                int mathematics = rs1.getInt("mathematics");
                int geology = rs1.getInt("geology");
                int total1 = rs1.getInt("total_marks");
                float percentage = rs1.getFloat("percentage");
                String result1 = rs1.getString("result");
                String grade1 = rs1.getString("grade");

                // Display values
                System.out.print(srno + "\t" + student_name + "\t\t" + rollNo + "\t" + Physics + "\t" + chemistry + "\t"
                        + mathematics + "\t" + geology + "\t" + total1 + "\t" + percentage + "\t" + result1 + "\t"
                        + grade1 + "\n");
            }
            // GETING list of pass student

            System.out.println("to find the list of pass student write pass?");
            String list = sc.next();
            String showpass = "SELECT * FROM student_data WHERE result='" + list + "'";
            ResultSet rs2 = stmt.executeQuery(showpass);
            while (rs2.next()) {
                int srno = rs2.getInt("sr.no");
                String student_name = rs2.getString("student_name");
                int rollNo = rs2.getInt("rollNo");
                int Physics = rs2.getInt("Physics");
                int chemistry = rs2.getInt("chemistry");
                int mathematics = rs2.getInt("mathematics");
                int geology = rs2.getInt("geology");
                int total1 = rs2.getInt("total_marks");
                float percentage = rs2.getFloat("percentage");
                String result1 = rs2.getString("result");
                String grade1 = rs2.getString("grade");

                // Display values
                System.out.print(srno + "\t" + student_name + "\t\t" + rollNo + "\t" + Physics + "\t" + chemistry + "\t"
                        + mathematics + "\t" + geology + "\t" + total1 + "\t" + percentage + "\t" + result1 + "\t"
                        + grade1 + "\n");
            }
            sc.close();

        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }

    }
}
