import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class URLDemo {

	URL url;
	
	public URLDemo()  {
		System.out.println("Program to Implement all the methods of URL class \n");
		
		try {
			this.url = new URL("http://localhost:8080/JspExp/index.jsp");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Implementing Methods for URL : http://localhost:8080/JspExp/index.jsp\n ");
		
		System.out.println(" -getProtocol() protocol of the url : "+url.getProtocol());
		System.out.println(" -getHost() host of the url : "+url.getHost());
		System.out.println(" -getPort() port number of the url : "+url.getPort());
		System.out.println(" -getDefaultPort() default port of the url : "+url.getDefaultPort());
		System.out.println(" -getPath() path part pf the url : "+url.getPath());
		System.out.println(" -getFile() file name in the url : "+url.getFile());
		try {
			System.out.println(" -getURI() uri representation of the url : "+url.toURI().toString());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		System.out.println(" -toString() String representation of the url : "+url.toString());
	}
	
	public static void main(String Agrs[]) throws MalformedURLException, URISyntaxException {
	
		new URLDemo();
	}
}
