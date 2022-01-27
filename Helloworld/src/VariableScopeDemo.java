import java.io.IOException;
public class VariableScopeDemo{
    //local variable declaration
    String message;
    static int status;

    public static void main(String [] args) throws IOException{

        String response;
        //create the instance of class
        VariableScopeDemo s1 = new VariableScopeDemo();
        s1.message = "Heyoo";
        s1.status = 100;

        response = "message "+s1.message+" and the status is "+s1.status;
        System.out.println(response);
        VariableScopeDemo s2 = new VariableScopeDemo();
        s2.message = "Heyoo 1";
        s2.status = 300;

        response = "message "+s1.message+" and the status is "+s1.status;
        System.out.println(response);

        //class data type demo
        Person p1 = new Person();
        p1.setFirstname("Rockefeller");
        p1.setAge(30);
        p1.setLastname("John");

        System.out.println("firstname: "+p1.getFirstname()+"lstname: "+p1.getLastname()+"and the age is: "+p1.getAge());

    }
}