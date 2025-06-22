import java.sql.*;
public class DemoJDBC2
{
    public static void main(String[] args) throws Exception
    {
        String url="jdbc:mysql://localhost:3306/companydb";
        String uname="root";
        String pass="5265";
        String sql="insert into employees values(10,'chsdk','shelja','chsgy8@gmail.com','2025-05-09',44545.69,7823226866)";

        //Class.forName("com.mysql.cj.jdbc.Driver");//optional
        Connection conn=DriverManager.getConnection(url,uname,pass);
        System.out.println(conn);
        System.out.println("Connection Established");

        Statement st = conn.createStatement();
        boolean status=st.execute(sql);
        System.out.println(status);

        if(status==false)
        {
            ResultSet rs = st.executeQuery("select * from employees");
            while(rs.next())
            {
                System.out.println("id:"+rs.getInt("employeeid"));
                System.out.println("firstname:"+rs.getString("firstname"));
                System.out.println("lastname:"+rs.getString("lastname"));
                System.out.println("email:"+rs.getString("email"));
                System.out.println("hiredate"+rs.getString("hiredate"));
                System.out.println("salary"+rs.getFloat("salary"));

                System.out.println(" ");
            }
        }
        else
            System.out.println("no entry");

        boolean status1=st.execute("update employees set phoneno=7556236560 where employeeid=4");
        System.out.println(status1);

        conn.close();
        System.out.println("Connection closed");


    }

}