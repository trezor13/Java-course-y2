import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.110", 5000);

        OutputStream outToServer = socket.getOutputStream();
        DataOutputStream requestToSend = new DataOutputStream(outToServer);
        requestToSend.writeUTF("The process is running");

        InputStream inFromServer = socket.getInputStream();
        DataInputStream response = new DataInputStream(inFromServer);
        System.out.println("Server responded with: " + response.readUTF());

        socket.close();
    }
}