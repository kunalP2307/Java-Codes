import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;


public class ChatController extends UnicastRemoteObject implements ChatInterface {

	 public ChatController() throws RemoteException{
	        super();
	 }
	
	public String writeMsgAndReply(boolean isFirstMsg,String message) throws RemoteException {
		
		String reply = "";
		Scanner sc = new Scanner(System.in);
		
		
		if(isFirstMsg) {
			
			System.out.println("Chatting Application Started \n");
			System.out.println("--Client--"+"\n");
			
		}
		
		
		System.out.println("->"+message);
			
		if(!message.equalsIgnoreCase("bye")) {
			System.out.print("\t\t\t\t"+"->");
			reply = sc.nextLine();
			return reply;	
		}
		else {
			System.out.println("\n Server Terminated.!");
			return "bye";
			
		}
			
	}
}
