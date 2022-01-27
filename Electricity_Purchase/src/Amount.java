import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class Amount {
    private String[] category = new String[]{
            "residential"
            , "non_residential"
            , "telecomTower"
            , "water_treatment"
            , "Hotels"
            , "health_facilities"
            , "broadcasters"
            , "data centers"}; //keep the category in an array of strings

    private Integer[] elecPrice= new Integer[]{89, 212, 249,227, 255, 201,192, 179};


    public Amount() {
    }

    public String[] getCategory() {
        return category;
    }

    public Integer[] getElecPrice() {
        return elecPrice;
    }

    // function to calculate the price when given the  and category index
    public Double calculatePrice(int numberIndex) {
        double price = 0; // variable to keep the price


          int bill = elecPrice[numberIndex];

            price = bill; // price =  price + (bill + bill*vat)




        return price;
    }
    // save the invoice to a file
    public void saveInvoice(String invoice){
        try {
            FileWriter myWriter = new FileWriter("invoice.txt");
            myWriter.write(invoice);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}