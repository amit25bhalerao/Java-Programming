import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class UDPServer
{
    public static void main(String[] args) throws IOException
    {
        DatagramSocket serverSocket = new DatagramSocket(9876);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        byte[] sendData = new byte[1000];
        byte[] receivedData = new byte[1000];

        DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);
        serverSocket.receive(receivedPacket);

        String messageFromClient = new String(receivedPacket.getData());
        System.out.println("Data Sent By Client: "+ messageFromClient);

        InetAddress IPAddress = receivedPacket.getAddress();
        int port = receivedPacket.getPort();

        String data = in.readLine();

        sendData = data.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
        serverSocket.send(sendPacket);

        serverSocket.close();
    }
}