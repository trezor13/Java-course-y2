import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        try {
            System.out.println("Welcome to Electricity purchase app:\n");

            Date today = null; // variable to keep the  date
            String customer_name = null; // variable to keep the customer name
            int meterNumber; // varibale to keep the meter nbr
            int unitNumber;//variable to hold the amount of units needed
            int counter;
            int choosedCategory; // variable to keep the choosed category
            int choosedNumber; // variable to keep the choosed number

            Amount amountEngine = new Amount(); // instantiating the amount class
            String[] category = amountEngine.getCategory(); // varibale category to keep the available car types
            Integer[] elecPrice = amountEngine.getElecPrice(); // varibale category to keep the available car types
            Scanner input = new Scanner(System.in); // make a scanner which will help us to get user input
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); // set preferred date format

            // get today's date
            System.out.println("Enter today's (dd/mm/yy):");
            String user_input = input.nextLine();
            if (null != user_input && user_input.trim().length() > 0) {
                today = format.parse(user_input);
            }
            // get the customer names
            System.out.println("Enter your names:");
            customer_name = input.nextLine();
            System.out.println("Enter your meter number:");
            meterNumber = input.nextInt();
            System.out.println("Enter the units you want to purchase number:");
            unitNumber = input.nextInt();


            String invoice = "   names          : "+customer_name;
            invoice+="\n   Today's date  : "+today;

                System.out.println("Choose category type:");
                for (int i = 0; i < category.length; i++) {
                    System.out.println((i + 1) + ". " + category[i] + "\n");
                }
                System.out.println("Enter your choice:");
                choosedCategory = input.nextInt();

            System.out.println("Choose number corresponding to your category:");
            for (int i = 0; i < elecPrice.length; i++) {
                System.out.println((i + 1) + ". " + elecPrice[i] + "\n");
            }
            System.out.println("Enter your choice:");
            choosedNumber = input.nextInt();



            double price = amountEngine.calculatePrice(choosedNumber);

                invoice += "\n   category      : " + category[choosedCategory];
                invoice += "\n   meter number      : " + meterNumber;
                invoice += "\n   Price          : " + price * unitNumber;





//            System.out.print(invoice); // print the invoice
            // save the invoice in a file
            amountEngine.saveInvoice(invoice);
            System.out.println("\nThank you for using this app !!");
        }
        catch (ParseException e){
            System.out.println(e);
        }
    }


}
