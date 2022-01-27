package files;
import java.io.IOException;


public class StringHelpComparator{
    public static void main(String [] args) throws IOException{
        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Testing string");
        for (int i=0; i<10000; i++){
            buffer.append("Hello");
        }

        System.out.println("Time elapsed Buffering :" + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder("Testing string");

        for (int j=0; j < 10000; j++){
            builder.append("Hello");
        }

        System.out.println("Time elapsed Building :" + (System.currentTimeMillis() - startTime));


    }

}