import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.TextField;

public class GridLayoutDemo1 extends Frame{
	
	Label lNo1, lNo2;
	TextField tNo1,tNo2;
	Button bAdd;
	
	public GridLayoutDemo1() {
		this.setName("GridLayout()");
		
		lNo1 = new Label("Number 1");
		lNo2 = new Label("Number 2");
		tNo1 = new TextField(20);
		tNo2 = new TextField(20);
		bAdd = new Button("Add");
		
		
		add(lNo1);
		add(tNo1);
		add(lNo2);
		add(tNo2);
		add(bAdd);
		
		setSize(600,150);
		setLayout(new GridBagLayout());
		setVisible(true);
	}
	public static void main(String Args[]) {
		new GridLayoutDemo1();
	}
}
