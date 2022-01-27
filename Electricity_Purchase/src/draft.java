class Draft extends Exception {

        }

class Derived extends Draft  {

        }
public class Main {
    public static void main(String args[]) {
        // some other stuff here
        try {
            // add some monitored code inside this block
            throw new Derived();
        }
        catch(Draft b)  {
            System.out.println("Caught base class exception");
        }
        catch(Derived d)  {
            System.out.println("Caught derived class exception");
        }
    }
