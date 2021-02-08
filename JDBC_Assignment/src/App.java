import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            final String url = "jdbc:postgresql://localhost/postgres";
            final String user = "postgres";
            final String password = "root";
            //Class.forName("com.postgresql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt=con.createStatement();
            ResultSet rs;
            Scanner sc =new Scanner(System.in);
            System.out.println("Menu :");
            System.out.println("1:Get the number of employees along with " +
                    "the details of employees working in a Particular Dept");
            System.out.println("2:Get the names of all departments");
            System.out.println("3:Get the number of employees working in companies");
            System.out.println("4:Update the employees dept where emp ids are greater than 2");

            int i=sc.nextInt();
            if(i==1){
                rs=stmt.executeQuery("SELECT Emp_Dept, COUNT(*) FROM Employee GROUP BY Emp_Dept");
                System.out.println("Emp_Dept" +" Count ");
                while (rs.next())
                    System.out.println(rs.getInt(1)+"          "+rs.getInt(2));
            }
            if(i==2) {
                rs = stmt.executeQuery("select dept_name from Department");
                System.out.println("Names of all the departments :");
                while (rs.next())
                    System.out.println(rs.getString(1));
            }
            if(i==3){
                rs=stmt.executeQuery("SELECT\n" +
                        "\te.emp_company ,\n" +
                        "\tcomp_name ,\n" +
                        "\tCOUNT(*)\n" +
                        "FROM\n" +
                        "\temployee e\n" +
                        "INNER JOIN companydetails d ON d.comp_id = e.emp_company \n" +
                        "GROUP BY\n" +
                        "\te.emp_company,d.comp_id ");
                System.out.println("Emp_Company" +" Comp_Name"+" Count ");
                while (rs.next())
                    System.out.println(rs.getInt(1)+"          "+rs.getString(2)+"         "+rs.getInt(3));
            }
            if(i==4){
                PreparedStatement pstmt = con.prepareStatement("UPDATE Employee SET Emp_Dept=1 WHERE Emp_ID>2  ");
                pstmt.executeUpdate();
                System.out.println("Updated");
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
