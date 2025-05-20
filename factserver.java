import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class factserver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String num,res;
		int i,no;
		long fact;
		System.out.println("Server is ready");
		DatagramSocket serversocket=new DatagramSocket(5000);
		byte[]send=new byte[102];
		byte[]resive=new byte[102];
		DatagramPacket resPck=new DatagramPacket(resive,resive.length);
		serversocket.receive(resPck);
		num=new String(resPck.getData());
		num=num.trim();
		no=Integer.parseInt(num);
		fact=1;
		for(i=1;i<=no;i++)
			fact=fact*i;
		res=Long.toString(fact);
		send=res.getBytes();
		InetAddress ipadd=resPck.getAddress();
		int port=resPck.getPort();
		DatagramPacket sendPck=new DatagramPacket(send,send.length,ipadd,port);
		serversocket.send(sendPck);
	}

}
