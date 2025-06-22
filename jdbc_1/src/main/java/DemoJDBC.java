import java.sql.*;
public class DemoJDBC
{
    public static void main(String[] args) throws Exception
    {
        String url="jdbc:mysql://localhost:3306/companydb";
        String uname="root";
        String pass="5265";
        String sql="select * from employees";

        //Class.forName("com.mysql.cj.jdbc.Driver");//optional
        Connection conn=DriverManager.getConnection(url,uname,pass);
        System.out.println(conn);
        System.out.println("Connection Established");

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        System.out.println(rs.next());
        System.out.println(rs.getString(1));
        System.out.println(rs.getString("employeeid"));

        while(rs.next())
        {
            System.out.println("id:"+rs.getInt("employeeid"));
            System.out.println("firstname:"+rs.getString("firstname"));
            System.out.println("lastname:"+rs.getString("lastname"));
            System.out.println("email:"+rs.getString("email"));
            System.out.println("hiredate"+rs.getString("hiredate"));
            System.out.println("salary"+rs.getFloat("salary"));

            System.out.println("");
        }


        conn.close();
        System.out.println("Connection closed");






    }

}