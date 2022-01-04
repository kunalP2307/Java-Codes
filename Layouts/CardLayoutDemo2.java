import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class CardLayoutDemo2 extends JFrame implements ActionListener{
	
	Button btn1,btn2;
	Container container;
	CardLayout cardLayout;
	
	public CardLayoutDemo2() {
		this.setName("CardLayout(int,int)");
		setSize(400,400);
		
		container = getContentPane();  
		cardLayout = new CardLayout(25,25);
		container.setLayout(cardLayout);
		  
		btn1 = new Button("Switch to Windows");
		btn2 = new Button("Switch to Linux");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn1.setFont(new Font("Serif", Font.BOLD, 24)); 
		btn2.setFont(new Font("Serif", Font.BOLD, 24)); 
		
		add(btn1);
		add(btn2);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
	     cardLayout.next(container);
	}
	
	public static void main(String Args[]) {
		new CardLayoutDemo2();
	}
}
