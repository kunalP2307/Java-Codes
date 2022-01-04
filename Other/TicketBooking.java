import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TicketBooking extends JFrame{
	 String[] boardStn = {"Pune","Daund","Nagar"};
	 String[] destStn = {"Jalgaon","Bhusawal","Malkapur"};
	
	JLabel lDest,lBoard;
	JComboBox boardStation,destStation;
	JButton bBook;
	
	public TicketBooking() {
		setSize(700,500);
		
		lBoard = new JLabel("Boarding Station  ");
		lDest = new JLabel("Destination Station ");
		boardStation = new JComboBox(boardStn);
		destStation = new JComboBox(destStn);
		bBook = new JButton("Book");
		
		
		lBoard.setBounds(50,50,150,30);
		lDest.setBounds(300,50,150,30);
		boardStation.setBounds(50,110,100,30);
		destStation.setBounds(50,150,100,30);
		bBook.setBounds(50,200,70,30);
		add(lBoard);
		add(lDest);
		add(boardStation);
		add(destStation);
		add(bBook);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String Args[]) {
		new TicketBooking();
	}
}

