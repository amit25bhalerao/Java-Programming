import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
class UDPClient
{
    public static void main(String[] args) throws IOException
    {
        DatagramSocket clientSocket = new DatagramSocket();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        InetAddress IPAddress = InetAddress.getByName("localhost");

        byte[] sendData = new byte[1000];
        byte[] receivedData = new byte[1000];

        String sentence = "Hello Server! This Is Client. We Are Successfully Connected.";
        sendData = sentence.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
        clientSocket.send(sendPacket);

        DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);
        clientSocket.receive(receivedPacket);

        String messageFromServer = new String(receivedPacket.getData());
        System.out.println("Message Received From Server: " + messageFromServer);

        clientSocket.close();
    }
}
