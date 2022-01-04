import java.awt.Button;
import java.awt.Frame;
import java.awt.Scrollbar;

public class ScrollDemo extends Frame  {
	Button btn;
	Scrollbar scroll;
	public ScrollDemo() {
		setSize(300,300);
		scroll = new Scrollbar();
		scroll.setBounds(20,40,300,20);
		add(scroll);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ScrollDemo();
	}
}
