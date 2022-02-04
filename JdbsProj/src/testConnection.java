import javax.xml.transform.Result;
import java.sql.*;

public class testConnection{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced" , "root" , "fearthebeard#13");
        Statement stmt;
        if (conn != null) {
            System.out.println("Succesfully connected");

            stmt = conn.createStatement();
     //       stmt.execute("Create table testing(id INT PRIMARY KEY AUTO_INCREMENT,firstName VARCHAR(255),lastName Varchar(255));");

           if(stmt.execute("Insert into testing(firstName,lastName) VALUES('jackson','ville');")){
               System.out.println("Worked successfully");
          }


            ResultSet result = stmt.executeQuery("select * from testing");
            //    while(result.next()){
            //  System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3));
            //   System.out.println(result.getInt("id") + " " + result.getString("firstName") + " " + result.getString("lastName"));

//             int id = result.getInt("id");
//             String fname = result.getString("firstName");
//             String lname = result.getString("lastName");
//             System.out.format("%s, %s, %s",id,fname,lname);
//             System.out.println("\n");
        }

//            else{
//                System.out.println("didn't work");
//            }

        else{
            System.out.println("The db can't connect");
        }

    }
}