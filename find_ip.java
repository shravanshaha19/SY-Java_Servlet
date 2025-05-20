import java.net.InetAddress;
import java.net.UnknownHostException;

public class find_ip {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress my_localhost=InetAddress.getLocalHost();
		System.out.println("The IpAddress of client is:"+(my_localhost.getHostAddress()).trim());
		System.out.println("The host name is:"+my_localhost.getHostName());
	}

}
