
import java.rmi.*;
import java.rmi.registry.*;
public class Server{
	
	public static void main(String args[]){
		
		try{
			
			ChatInterface chatC = new ChatController();

			LocateRegistry.createRegistry(4570);

			Naming.rebind("rmi://localhost:4570"+
						"/chats",chatC);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
