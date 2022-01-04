import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ShowTrains extends JFrame implements ActionListener {
	
	JLabel lHeader;
	JButton bBack;
	
	final static JLabel[] trains = new JLabel[3];
	final static JButton[] bookTrain = new JButton[3];
	final Font FONT1 = new Font("Serif",Font.BOLD,24);
	final Font FONT2 = new Font("Serif",Font.ITALIC+Font.BOLD,24);
	
	
	static {
		trains[0] = new JLabel("01039-Kop Gondia Special ");
		trains[1] = new JLabel("02279-Pune Hwh Special ");
		trains[2] = new JLabel("02290-Pune Nagpur Special ");
		
		for(int i=0; i<3; i++)
			bookTrain[i] = new JButton("Book");
	}
	
	public ShowTrains() {
		setSize(700,600);
		initComponents();
		addListeners();
		setLayout(null);
		setVisible(true);
		
	}
	
	public void initComponents() {
		lHeader = new JLabel("TRAINS AVAILABLE");
		lHeader.setBounds(160,40,400,50);
		lHeader.setFont(new Font("Serif",Font.BOLD,28));
		bBack = new JButton("Back");
		bBack.setBounds(40,480,150,50);
		bBack.setFont(FONT1);
		
		int x = 40,y = 130;
		
		for(int i=0; i<3; i++) {
			trains[i].setBounds(x,y,450,50);
			trains[i].setFont(FONT2);
			bookTrain[i].setBounds(520,y,130,50);
			bookTrain[i].setFont(FONT1);
			y += 70;
			
		}
			
		add(lHeader);
		for(int i=0; i<3; i++) {
			add(trains[i]);
			add(bookTrain[i]);
		}
		add(bBack);
	}
	
	public void addListeners() {
		bBack.addActionListener(this);
		for(int i=0; i<3; i++)
			bookTrain[i].addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bBack)
			new TrainSearch();
		else
			
	}
	
	public static void main(String Args[]) {
		new ShowTrains();
	}
	
}
