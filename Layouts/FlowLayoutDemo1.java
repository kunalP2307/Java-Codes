import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutDemo1 extends Frame {
	
	Button bHome, bNext, bPrev;
	
	public FlowLayoutDemo1(){
		this.setName("FlowLayout()");
		
		bHome = new Button("Home");
		bNext = new Button("Next");
		bPrev = new Button("Previos");
		
		add(bHome);
		add(bPrev);
		add(bNext);
		
		setSize(500,150);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setVisible(true);
	}
	public static void main(String Args[]) {
		new FlowLayoutDemo1();
	}
}
