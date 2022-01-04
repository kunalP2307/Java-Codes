import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;

public class SuccessMsg extends Frame {

	Label lGreet;
	
	public SuccessMsg() {
		setSize(300,200);
		
		lGreet = new Label("Registration Successful..!");
		lGreet.setBounds(100,100,150,30);
		add(lGreet);
		setLayout(null);
		setVisible(true);
	}
}
