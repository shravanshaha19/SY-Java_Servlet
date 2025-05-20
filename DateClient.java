import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class DateClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket soc=new Socket(InetAddress.getLocalHost(),5217);
		BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
		System.out.println(in.readLine());
	}

}
