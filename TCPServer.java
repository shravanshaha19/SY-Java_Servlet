import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(ServerSocket WelcomeServer=new ServerSocket(80)){
			System.out.println("Server Started");
			System.out.println("Waiting for client");
			Socket ClientSocket=WelcomeServer.accept();
			System.out.println("Client accepted to the port number"+ClientSocket.getLocalPort());
		}
		catch(Exception e) {
		}
	}

}
