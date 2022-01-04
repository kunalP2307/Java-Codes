import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdap extends Frame{
	
	public WindowAdap() {
		
		addWindowListener(new WindowAdapter(){  
			public void windowClosing(WindowEvent e) {  
				dispose();  
			}  
		});  
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String Agrs[]) {
		new WindowAdap();
	}
	
}

