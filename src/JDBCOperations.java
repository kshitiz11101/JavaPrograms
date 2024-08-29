import java.sql.*;
public class JDBCOperations {
    public static void main(String[] args) throws Exception{
        /*
        1.Import Packages
        2.Load and Register
        3.Create Connection
        4.Create Statement
        5.Execute Statement
        6.Process results
        7.Close
        */
        String url="jdbc:postgresql://localhost:5432/JavaTutorials";
        String username="postgres";
        String password="kshitiz@01";
        int sid=7;
        String sname="Vinay";
        int marks=88;
        String query="INSERT into student values(?,?,?);";
//        String query="DELETE FROM student where sid=8;";
//        String query="SELECT sname from student where sid=2;";

//        Class.forName("org.postgresql.Driver");  // optional to do
        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("Connected to database");
//        Statement st=con.createStatement();
        PreparedStatement pst=con.prepareStatement(query);
        pst.setInt(1,sid);
        pst.setString(2,sname);
        pst.setInt(3,marks);
        pst.execute();
//       boolean ans= st.execute(query);
//        System.out.println(ans);
//        ResultSet res=st.executeQuery(query);
//        System.out.println(res.next());
//       String name= res.getString("sname");
//        System.out.println(name);
//        while(res.next()){
//            System.out.println(res.getString(1)+" "+res.getString(2)+" "+res.getString(3));
//        }
        con.close();
        System.out.println("Closed connection");



    }
}
