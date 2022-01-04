import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;

public class ComponentDemo extends Frame  {
	Button btn;
	Label lbl;
	Choice ch;
	
	public ComponentDemo() {
		setSize(300,300);
		lbl = new Label("Select Your Fav Prog Lan");
		btn = new Button("Button");
		ch = new Choice();
		ch.add("Java ");
		ch.add("C++");
		ch.add("Python");
		lbl.setBounds(50,50,200,30);
		ch.setBounds(50,90,80,30);
		btn.setBounds(50,150,80,30);
		add(lbl);
		add(btn);
		add(ch);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ComponentDemo();
	}
}

