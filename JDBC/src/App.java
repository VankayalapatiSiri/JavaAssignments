import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class App {
    public static void main(String[] args) {
        try {
            final String url = "jdbc:postgresql://localhost/postgres";
            final String user = "postgres";
            final String password = "root";
            //Class.forName("com.postgresql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from company");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3) + " " + rs.getString(4) + " " + rs.getInt(5) + " " + rs.getString(6));
            con.setAutoCommit(false);
            PreparedStatement pstmt = con.prepareStatement("insert into company values(?,?,?,?,?,?)");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            while(true) {

                pstmt.setInt(1, 10);
                pstmt.setString(2, "Ram");
                pstmt.setInt(3, 22);
                pstmt.setString(4, "MP");
                pstmt.setInt(5, 1000);
                pstmt.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
                int i = pstmt.executeUpdate();
                System.out.println(i + " records inserted");

                System.out.println("commit/rollback");
                String answer=br.readLine();
                if(answer.equals("commit")){
                    con.commit();
                }
                if(answer.equals("rollback")){
                    con.rollback();
                }
                con.close();
            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

