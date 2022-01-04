import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class JPassDemo extends JFrame {
	JPasswordField pass;
	
	public JPassDemo() {
		setSize(300,300);
		pass = new JPasswordField();
		pass.setBounds(50,50,100,30);
		add(pass);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String args[]) {
		new JPassDemo();
	}
	
	

}
	
