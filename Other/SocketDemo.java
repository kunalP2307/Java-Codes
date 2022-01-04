import java.net.InetAddress;
import java.net.UnknownHostException;

public class SocketDemo {

	public static void main(String Agrs[]) throws UnknownHostException {
		
		System.out.println("getByName for localhost : "+InetAddress.getByName("localhost"));
		
		System.out.println("getLocalhost() : "+InetAddress.getLocalHost());
		System.out.println("getHostName() for LocalHost"+InetAddress.getLocalHost().getHostName());
		System.out.println(InetAddress.getLocalHost().getHostAddress());
	}
}

