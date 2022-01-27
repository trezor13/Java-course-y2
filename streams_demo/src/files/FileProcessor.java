package files;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class FileProcessor {
    public static void main(String[] args)throws IOException{
        FileInputStream myInput = null;
        FileOutputStream myOutput= null;
        try{
            File myFile = new File("file.txt");
            myInput = new FileInputStream(myFile);
            //creating a new file
            myFile = new File("output.txt");
            if (!myFile.exists()){
                myFile.createNewFile();
                myOutput = new FileOutputStream(myFile);
            }

            int c;
            while((c = myInput.read()) != -1){
              System.out.print((char) c);
              myOutput.write(c);
            }

        }catch(Exception e){
            e.printStackTrace();

        }finally{
            if(myInput != null) myInput.close();

        }
    }
}
