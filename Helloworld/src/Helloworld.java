import java.io.IOException;
public class Helloworld{
    public static void main(String[] args) throws IOException{
        String argValue = null;
        for(int i=0; i<args.length; i++){
            argValue = args[i];
            System.out.println("Hello " + argValue);
        }
        System.out.println(args[0] +" "+ args[1] +" " +args[2]);
    }
}