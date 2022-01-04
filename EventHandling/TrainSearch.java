
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;
import javax.swing.*;
import java.util.*;

public class TrainSearch extends JFrame 	{
	
	
	JLabel lHeader,lForm,lTo,lClass,lQuota,lDate;
	JComboBox source,destination,_class,quota,lFlexWithDate;
	JCheckBox flexWithDate;
	JFormattedTextField tDate;
	JButton bSearch;
	final Font FONT1 = new Font("Serif",Font.PLAIN,22);
	final Font FONT2 = new Font("Serif",Font.BOLD,24);
	
	

	final String stations[] = {"Pune","Daund","Nagar","Manmad","Jalgaon",
								"Bhusawal","Malkapur","Shegaon","Akola","Ajni","Nagpur"};
	final String classes[] = {"All Classs","AC 2 Tier","AC 3 Tier","Sleeper","First Class","Second Siting"};
	
	final String quotas[] = {"General","Ladies","Tatkal","Lower Birth","Divyaang"};
	
	public TrainSearch(){
		
		setSize(500,700);
		initComponents();
		addComponents();
		setLayout(null);
	    setVisible(true);
	}
	
	public void initComponents() {
		
		lHeader = new JLabel("TRAIN SEARCH");
		lForm = new JLabel("From");
		lTo = new JLabel("To");
		lClass = new JLabel("Class");
		lQuota = new JLabel("Quota");
		lDate = new JLabel("Date");
		source = new JComboBox(stations);
		tDate = new JFormattedTextField(LocalDate.now());
		destination = new JComboBox(stations);
		_class = new JComboBox(classes);
		quota = new JComboBox(quotas);
		
		flexWithDate = new JCheckBox("Flexible with Date");
		bSearch = new JButton("Search Trains");
		
		
		lHeader.setBounds(130,40,400,50);
		lHeader.setFont(FONT2);
		lForm.setBounds(70,140,120,30);
		lForm.setFont(FONT1);
		source.setBounds(40,180,170,40);
		source.setFont(FONT2);
		lTo.setBounds(330,140,120,30);
		lTo.setFont(FONT1);
		destination.setBounds(270,180,170,40);
		destination.setFont(FONT2);
		
		lClass.setBounds(70,260,120,30);
		lClass.setFont(FONT1);
		_class.setBounds(40,300,170,40);
		_class.setFont(FONT2);
		lQuota.setBounds(320,260,120,30);
		lQuota.setFont(FONT1);
		quota.setBounds(270,300,170,40);
		quota.setFont(FONT2);
		lDate.setBounds(110,375,70,30);
		lDate.setFont(FONT1);
		tDate.setBounds(200,370,170,40);
		tDate.setFont(FONT2);
		flexWithDate.setBounds(200,430,200,20);
		bSearch.setBounds(100,500,300,50);
		bSearch.setFont(FONT2);
		
	}
	
	public void addComponents() {
		add(lHeader);
		add(lForm);
		add(source);
		add(lTo);
		add(destination);
		add(lClass);
		add(_class);
		add(lQuota);
		add(quota);
		add(lDate);
		add(tDate);
		add(flexWithDate);
		add(bSearch);
	}
	public void temo() {
		
		bSearch.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new ShowTrains();
			}
		});
	}
	
	public static void main(String args[]) {
		new TrainSearch();
	}
}
