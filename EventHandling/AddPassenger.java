import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class AddPassenger extends JFrame implements ActionListener{

	JLabel lHeader;
	JLabel lName,lAge;
	JTextField tName,tAge;
	JButton bBookTicket,bBack;
	final Font FONT1 = new Font("Serif",Font.BOLD,20);
	
	
	
	public AddPassenger() {
		setSize(400,600);
		initComponents();
		bBookTicket.addActionListener(this);
		setLayout(null);
		setVisible(true);
		
	}
	public void initComponents() {
		lHeader = new JLabel("Book Ticket");
		lHeader.setFont(new Font("Serif",Font.BOLD,28));
		lHeader.setBounds(80,40,400,50);
		
		lName = new JLabel("Name");
		lName.setBounds(40,120,130,40);
		lName.setFont(FONT1);
		
		tName = new JTextField();
		tName.setBounds(150,120,150,40);
		tName.setFont(FONT1);
		
		lAge = new JLabel("Age");
		lAge.setBounds(40,190,130,40);
		lAge.setFont(FONT1);
		
		tAge = new JTextField();
		tAge.setBounds(150,190,150,40);
		tAge.setFont(FONT1);
		
		bBookTicket = new JButton("Book Ticket");
		bBookTicket.setBounds(40,290,300,50);
		bBookTicket.setFont(FONT1);
		
		bBack = new JButton("Back");
		bBack.setBounds(20,500,180,50);
		bBack.setFont(FONT1);
		add(lHeader);
		add(lName);
		add(lAge);
		add(tName);
		add(tAge);
		add(bBookTicket);
		add(bBack);
	}
	
	public void actionPerformed(ActionEvent e) {
		new BookingSuccess();
	}
	
	public static void main(String Agrs[]) {
		new AddPassenger();
	}
	
}
