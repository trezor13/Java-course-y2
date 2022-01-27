import javax.xml.crypto.Data;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String requeststr = "hello server";
        byte [] requestbytes = requeststr.getBytes();
        InetAddress ip = InetAddress.getLocalHost();
        DatagramPacket dprequest = new DatagramPacket(requestbytes,requestbytes.length,ip,5000);
        socket.send(dprequest);
//receive the response
        byte[] buffer = new byte[1024];
        DatagramPacket dpresponse = new DatagramPacket(buffer, buffer.length);
        socket.receive(dpresponse);
        String response = new String(buffer,0,dpresponse.getLength());
        System.out.println(response);
    }
}