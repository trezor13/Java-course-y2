import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlCOnnectionDEmo {
    public static void main(String[] args)throws IOException {
        URL url = new URL("https://igihe.com/");
        URLConnection webToDownload = url.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(webToDownload.getInputStream()));
        String line = null;
        while((line=reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
