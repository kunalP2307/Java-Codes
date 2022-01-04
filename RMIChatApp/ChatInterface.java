import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatInterface extends Remote  {
	
    public String writeMsgAndReply(boolean isFirstMsg, String message) throws RemoteException;

}
