import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class factclient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String n;
		DatagramSocket clientSocket=new DatagramSocket();
		byte[]send=new byte[102];
		byte[]resive=new byte[102];
		BufferedReader inFromUser=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter Number:");
		n=inFromUser.readLine();
		InetAddress ipadd=InetAddress.getByName("localhost");
		send=n.getBytes();
		DatagramPacket sendPck=new DatagramPacket(send,send.length,ipadd,5000);
		clientSocket.send(sendPck);
		DatagramPacket resPck=new DatagramPacket(resive,resive.length);
		clientSocket.receive(resPck);
		String fact=new String(resPck.getData());
		System.out.println("FROM SERVER:"+n+"!="+fact);
		clientSocket.close();
	}

}
