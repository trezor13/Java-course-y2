import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        try{
            ServerSocket server = new ServerSocket(13);
            Socket socket = server.accept();
            socket.setSoTimeout(10000);
            InputStream inputStream = socket.getInputStream();
            DataInputStream request = new DataInputStream(inputStream);
            System.out.println(request.readUTF());
            OutputStream output = socket.getOutputStream();
            DataOutputStream response = new DataOutputStream(output);
            response.writeUTF("Receiving the sms");
            server.close();

        }catch (IOException e){
            System.out.println("Server failed");


        }



    }
}