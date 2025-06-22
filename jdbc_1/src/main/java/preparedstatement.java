import java.sql.*;
public class DemoJDBC2
{
    public static void main(String[] args) throws Exception
    {
        String url="jdbc:mysql://localhost:3306/companydb";
        String uname="root";
        String pass="5265";
        String sql="insert into employees values(?,?,?,?,?,?,?)";

        //Class.forName("com.mysql.cj.jdbc.Driver");//optional
        Connection conn=DriverManager.getConnection(url,uname,pass);
        System.out.println(conn);
        System.out.println("Connection Established");

        PreparedStatement st = conn.PreparedStatement(sql);
        boolean status=st.execute(sql);
        System.out.println(status);

        st.setInt(1,10);
        st.setString(2,"bulla");
        st.setString(3,"thakur");
        st.setString(4,"thakurc8@gmail.com");
        st.setString(5,"2025-05-09");
        st.setDouble(6,44545.69);
        st.setString(7,"7823226866");


        conn.close();
        System.out.println("Connection closed");

    }

}