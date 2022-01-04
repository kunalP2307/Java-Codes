import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BookingSuccess extends JFrame {

	public BookingSuccess() {
		final Font FONT1 = new Font("Serif",Font.BOLD,20);
		setSize(400,400);
		
		JLabel message = new JLabel("Ticket Booked Successfully..!");
		message.setBounds(40,120,300,40);
		message.setFont(new Font("Serif",Font.BOLD,18));
		
		
		
		add(message);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String Args[]) {
		new BookingSuccess();
		
	}
}
