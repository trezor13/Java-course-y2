import java.io.IOException;


public class ExceptDemo {

    public void isInt(String number)throws NumberFormatException{
        try{
            Integer.parseInt(number);
        }catch(Exception e){
            throw new NumberFormatException(e.getMessage());

        //throws e;
        }
        System.out.println("it is not a number ");
    }

    public static void main(String[] var0) throws IOException {


        ExceptDemo x = new ExceptDemo();
        x.isInt("13g");
/*
        int a=5,b=0;


        try{
          double q=a/b;
           int nbrs[] =  {1,2,5,0,4 };
           for (int i=0;i <= nbrs.length;i++) {
               int num = nbrs[i];
           }
        }catch(ArithmeticException ae){
            ae.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException aiobe){
            aiobe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("The program will continue ");
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException  ae)
        {
            ae.printStackTrace();
            System.out.println(ae.getMessage());

        }
*/



    }
 }


