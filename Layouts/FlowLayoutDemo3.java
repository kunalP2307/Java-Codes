import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutDemo3 extends Frame {
	
	Button bHome, bNext, bPrev;
	
	public FlowLayoutDemo3(){
		this.setName("FlowLayout()");
		
		bHome = new Button("Home");
		bNext = new Button("Next");
		bPrev = new Button("Previos");
		
		add(bHome);
		add(bPrev);
		add(bNext);
		
		setSize(500,150);
		setLayout(new FlowLayout(10,20,20));
		setVisible(true);
	}
	public static void main(String Args[]) {
		new FlowLayoutDemo3();
	}
}
