import java.io.IOException;

public class MethodSyncronizationDemo {
    public static void main(String[] args) throws IOException {
        MultiplicationTable table = new MultiplicationTable();
        FirstMultipyer first = new FirstMultipyer("Multiplying 1",5,table);
        SecondMultipyer sec = new SecondMultipyer("Multiplying 2",6, table);
        first.run();
        sec.run();
    }
}
