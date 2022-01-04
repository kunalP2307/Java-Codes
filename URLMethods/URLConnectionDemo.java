import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Scanner;

public class URLConnectionDemo {
	
	URLConnection urlConnection;
	URL url;
	InputStream inputStream = null;
	
	
	public URLConnectionDemo() {
		try {
			url = new URL("https://www.facebook.com/");
			urlConnection = url.openConnection();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Connection Timeout : "+urlConnection.getConnectTimeout());
		System.out.println("Content Lenght :"+urlConnection.getContentLength());
		System.out.println("Content Type : "+urlConnection.getContentType());
		System.out.println("Uses Cache : "+urlConnection.getDefaultUseCaches());
		System.out.println("Date Field "+new Date(urlConnection.getDate()));
		System.out.println("Expires Field : "+new Date(urlConnection.getExpiration()));
		System.out.println("URL : "+urlConnection.getURL());
		System.out.println("Content Using getInputStream() : "+"\n");
		try {
			 inputStream = urlConnection.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scanner sc =new Scanner(inputStream);
		sc.nextLine();
		while(sc.nextLine() != "") {
			System.out.println(sc.nextLine());
		}
		
			
	}

	public static void main(String args[]) {
		new URLConnectionDemo();
	}
}

