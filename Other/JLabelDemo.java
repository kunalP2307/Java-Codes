 import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo extends JFrame {
	
	JLabel lbl;
	public JLabelDemo() {
		setSize(500,500);
		lbl = new JLabel("Enter Your First Name");
		lbl.setBounds(50,50,200,30);
		add(lbl);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String Args[]) {
		new JLabelDemo();
;	}

}

