//program for client application
import java.rmi.Naming;
import java.util.Scanner;
public class Client
{
	public static void main(String args[]){
		
		try{
			boolean isFistMsg = true;
			String message = "";
			String reply = "";
			
			ChatInterface chatC =
				(ChatInterface)Naming.lookup("rmi://localhost:4570"+
									"/chats");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Chatting Application Started : \n");
			
			System.out.println("--Server--\n");
			
			do{
				System.out.print("\t\t\t\t"+"->");
				message = sc.nextLine();
				reply = chatC.writeMsgAndReply(isFistMsg, message);
				System.out.println("->"+reply);			
				isFistMsg = false;
			}while(!message.equalsIgnoreCase("bye") || !reply.equalsIgnoreCase("bye"));
			
			System.out.println("Server Terminated");
		}
			
		catch(Exception e) {		
			e.printStackTrace();
		}
	}
}
