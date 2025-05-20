import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientChat {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket sock=new Socket("Localhost",3005);
		BufferedReader keyRead=new BufferedReader(new InputStreamReader(System.in));
		OutputStream ostream=sock.getOutputStream();
		PrintWriter pwrite=new PrintWriter(ostream,true);
		InputStream istream=sock.getInputStream();
		BufferedReader receiveRead=new BufferedReader(new InputStreamReader(istream));
		System.out.println("Strat the chatting,type & press the key");
		String receiveMessage,sendMessage;
		while(true) {
			sendMessage=keyRead.readLine();
			pwrite.println(sendMessage);
			pwrite.flush();
			if((receiveMessage=receiveRead.readLine())!=null)
			{
				System.out.println(receiveMessage);
			}
		}
	}

}
