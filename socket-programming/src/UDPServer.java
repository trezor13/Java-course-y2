import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javax.xml.crypto.Data;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class UDPServer {
    public static void main(String[] args) throws IOException {
       DatagramSocket serversocket = new DatagramSocket(5000);
       while(true){
           byte [] buffer = new byte[1024];
           DatagramPacket dprequest = new DatagramPacket(buffer,buffer.length);
           serversocket.receive(dprequest);
           String clientRequest = new String(buffer,0,dprequest.getLength());
           System.out.println(clientRequest);
           //sending back response
           InetAddress ip = dprequest.getAddress();
           int clientPort = dprequest.getPort();
           String responseClient = "receive request";
           byte[] responseBytes = responseClient.getBytes();
           DatagramPacket dpresponse = new DatagramPacket(responseBytes,responseBytes.length,ip,clientPort);
           serversocket.send(dpresponse);

       }

    }
}
