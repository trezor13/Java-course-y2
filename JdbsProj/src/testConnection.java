import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class testConnection {
   static String url = "jdbc:mysql://localhost:3306/advanced";
   static String username = "root";
   static String password = "fearthebeard#13";

    public static void main(String[] args)throws IOException {
        try{
            Connection connect = DriverManager.getConnection(url,username,password);
            if (connect != null){
                System.out.println("connected to mysql succesfully");
            }else{
                System.out.println("failed to connect");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
