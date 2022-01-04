import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetMethods {
	
	InetAddress inetAddress[];
	
	public InetMethods() {
		System.out.println("Program to Implement all the methods of InetAddress class ");
		
		System.out.println("\n\t------Factory Methods---------\n");
		
		try {
			inetAddress = InetAddress.getAllByName("www.facebool.com");
			System.out.println(" -getAllByName()  All IP addresses of www.facebook.com ->");
			for(int i=0; i<inetAddress.length; i++)
				System.out.println("\t\t\t\t\t"+inetAddress[i].toString());
			
			System.out.println(" -getByName()  IP Address of wwww.gppune.ac.in : "+InetAddress.getByName("www.gppune.ac.in").toString());
			System.out.println(" -getLocalHost() Address of localhost  : "+InetAddress.getLocalHost().toString());
		
			System.out.println("\n\t------Instance Methods---------\n");
			
			System.out.println(" -getAddress() raw IP address of web.whatsapp.com : "+InetAddress.getByName("web.whatsapp.com").getAddress().toString());
			System.out.println(" -getHostAddress() IP address of web.whatsapp.com in textual form : "+InetAddress.getByName("web.whatsapp.com").getHostAddress().toString());
			System.out.println(" -getHostName() HostName of IP address 127.0.0.1 : "+InetAddress.getByName("127.0.0.1").getHostName().toString());
			System.out.println(" -isMulticastAddress() Is 127.0.0.1 a multicast address ? : "+InetAddress.getByName("localhost").isMulticastAddress());
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String args[]) throws UnknownHostException {
		new InetMethods();
	}
}

