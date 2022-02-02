import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Set;

public class WebPageDownloader {

    static String[] ExtractThemLinks() {
        String[] linksList = {};
        try {
            URL url = new URL("https://www.mineduc.gov.rw/");
            URLConnection webToDownload = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(webToDownload.getInputStream()));
            String line = null;
            Set<String> links = new HashSet<String>();
            while ((line = reader.readLine()) != null) {
                if (line.contains("href=") && line.contains("<a") && !(line.contains("http") || line.contains("https"))) {
                    String TheeUrl = line.split("href")[1].split("=\"")[1].split("\"")[0] + "\n";
                    if (!(TheeUrl.equals("./") || TheeUrl.contains("#") || TheeUrl.contains("mailto") || TheeUrl.isEmpty()))
                    {
                          links.add(TheeUrl);
                    }
                }
            }
            linksList = links.toArray(new String[links.size()]);

        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return linksList;
    }
    static  void retrieveContent(String link,String filename) {

        try{
            URL url;
            url = new URL("https://www.mineduc.gov.rw/"+link);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter("Dounloads/"+"https://www.mineduc.gov.rw/".split("//")[1]+filename));
            String line = null;
            String content = "";
            while((line = reader.readLine()) != null){
                writer.write(line+"\n");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private static void createAFile(String filename) throws IOException {
        try{
            filename = filename.contains("?") ? filename.split("\\?")[0] : filename;
            File file = new File("Dounloads/"+"https://www.mineduc.gov.rw/".split("//")[1]+filename);
            if(!file.exists()){
                if(file.getParentFile() != null){
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        String[] link = ExtractThemLinks();
        for(int i=1;i<link.length;i++){
            String headers = link[i].toString();
            createAFile("page" + i + ".html");
            retrieveContent(headers,"page"+i+".html");
            System.out.println("Dounloading " + i*100/link.length + "%");
        }
    }
}


