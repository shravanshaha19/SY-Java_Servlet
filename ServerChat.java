import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket sersock=new ServerSocket(3005);
		System.out.println("Server ready for sending message.");
		Socket sock=sersock.accept();
		BufferedReader keyRead=new BufferedReader(new InputStreamReader(System.in));
		OutputStream ostream=sock.getOutputStream();
		PrintWriter pwrite=new PrintWriter(ostream,true);
		InputStream istream=sock.getInputStream();
		BufferedReader receiveRead=new BufferedReader(new InputStreamReader(istream));
		System.out.println("Strat the chatting,type & press the key");
		String receiveMessage,sendMessage;
		while(true) {
			if((receiveMessage=receiveRead.readLine())!=null)
			{
				System.out.println(receiveMessage);
			}
			sendMessage=keyRead.readLine();
			pwrite.println(sendMessage);
			pwrite.flush();
		}
	}

}
