import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutDemo1 extends Frame {
	Button bSubmit;
	
	public BorderLayoutDemo1() {
		setName("BorderLayot()");
		
		setSize(500,200);
		
		bSubmit = new Button("Submit");
		add(bSubmit,BorderLayout.SOUTH);
		
		//setLayout(new BorderLayout());
		setVisible(true);
	}
	public static void main(String args[]) {
		new BorderLayoutDemo1();
	}
}
