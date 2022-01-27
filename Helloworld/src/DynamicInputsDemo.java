import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DynamicInputsDemo{
    public static void main(String[] args) throws IOException{
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("enter your firstname");
//        String firstname = reader.readLine();
//        System.out.println("enter your age");
//        String ageInput = reader.readLine();
//        int age = Integer.parseInt(ageInput);
//        System.out.println("firstname: "+ firstname + " Age: "+ age);

        //Using scanner class
//        String text = reader.readLine();
//        StringTokenizer tokens =new StringTokenizer(text,",");
//        //String text0 = tokens.nextToken();
//        //String text1 = tokens.nextToken();
//        int i = 1;
//        while (tokens.hasMoreTokens()){
//            System.out.println("token: "+i+" is: "+tokens.nextToken());
//            i++;
//        }
        //By using Scanner method
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your names");
        String names = scan.nextLine();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
                System.out.println("age: "+age+" height: "+height+" names: "+names);
    }
}
