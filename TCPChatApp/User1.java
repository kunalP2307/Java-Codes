import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class User1 {
	
	ServerSocket serverSocket;
	Socket socket;
	BufferedReader reader;
	PrintWriter out;
	OutputStreamWriter outStream;
	String recievedMsg;
	String myMsg;
	
	public User1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\tChatting Server Started ");
		System.out.println("\tWaiting for Nisarg to get Connected ");
		System.out.println("\t\t\tType bye to Quit");
		
		try {
			serverSocket = new ServerSocket(8601);
			socket = serverSocket.accept();
			System.out.println("\tConnected With Nisarg ");
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outStream = new OutputStreamWriter(socket.getOutputStream());
			out = new PrintWriter(outStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n\n\t"+"--Nisarg--"+"\n");
		
		while(true) {
			try {
				recievedMsg = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(recievedMsg==null) {
				System.out.println("\t"+"bye");
				break;
			}
			System.out.println(recievedMsg);
			System.out.print("\t\t\t\t\t");
			myMsg = sc.nextLine();
			if(myMsg.trim().equalsIgnoreCase("bye"))
				break;
			out.println("\t"+myMsg);
			out.flush();
		}
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n\tDisconnected!");
	}
	
	
	public static void main(String Agrs[]) throws Exception{
		new User1();
	}
}
