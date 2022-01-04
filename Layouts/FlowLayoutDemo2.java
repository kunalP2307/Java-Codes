import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutDemo2 extends Frame {
	
	Button bHome, bNext, bPrev;
	
	public FlowLayoutDemo2(){
		this.setName("FlowLayout(int)");
		
		bHome = new Button("Home");
		bNext = new Button("Next");
		bPrev = new Button("Previos");
		
		add(bHome);
		add(bPrev);
		add(bNext);
		
		setSize(500,150);
		setLayout(new FlowLayout(10));
		setVisible(true);
	}
	public static void main(String Args[]) {
		new FlowLayoutDemo2();
	}
}
