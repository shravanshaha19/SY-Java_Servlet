import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket ClientSocket=new Socket("localhost",80);
			System.out.println("Connnected to server");
		}
		catch(Exception e) {
			
		}
	}

}
