import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ShowRegDetails extends Frame implements ActionListener {

	Label lDetails;
	Label lFName,tfName;
	Label lLName,tlName;
	Label lMobNo,tmobNo;
	Label lCourse,tcoursesSelected;
	Label lGender,tgender;
	Label lAddress,taddress;
	Button bConfirm;
	
	public ShowRegDetails(String fName,String lName,String mob,String courseSelected,String gender,String address) {
		
		addWindowListener(new WindowAdapter(){  
			public void windowClosing(WindowEvent e) {  
				dispose();  
	        }  
	    });  
		
		
		setSize(450,600);    
		initComponents();
		lDetails.setBounds(40,50,360,20);	
		
		lFName.setBounds(50,100,120,20);
		tfName.setBounds(180,100,150,20);
		tfName.setText(fName);
		
		lLName.setBounds(50,140,120,20);
		tlName.setBounds(180,140,150,20);
		tlName.setText(lName);
		
		lMobNo.setBounds(50,180,120,20);
		tmobNo.setBounds(180,180,150,20);
		tmobNo.setText(mob);
		
		lCourse.setBounds(50,220,150,20);
		tcoursesSelected.setBounds(180,220,200,100);
		tcoursesSelected.setText(courseSelected);
		
		lGender.setBounds(50,330,150,20);
		tgender.setBounds(180,330,120,20);
		tgender.setText(gender);
		
		lAddress.setBounds(50,370,120,20);
		taddress.setBounds(180,370,200,60);
		taddress.setText(address);
		bConfirm.setBounds(160,450,100,35);
		
		add(lDetails);
		add(lFName);
		add(tfName);
		add(lLName);
		add(tlName);
		add(lLName);
		add(lMobNo);
		add(tmobNo);
		add(lCourse);
		add(tcoursesSelected);
		add(lGender);
		add(tgender);
		add(lAddress);
		add(taddress);
		add(bConfirm);
		bConfirm.addActionListener(this);
		setLayout(null);
		setVisible(true);
	}
	
	public void initComponents() {
		Font fLabel = new Font("Serif",Font.PLAIN,18);
		
		this.lDetails = new Label("Registration Details");
		lDetails.setFont(new Font("Serif",Font.BOLD,24));
		
		this.lFName = new Label("First Name ");
		lFName.setFont(fLabel);
		
		this.lLName = new Label("Last Name ");
		lLName.setFont(fLabel);
		
		this.lMobNo = new Label("Mobile No. ");
		lMobNo.setFont(fLabel);
		
		this.lCourse = new Label("Select Courses ");
		lCourse.setFont(fLabel);
		
			
		this.lGender = new Label("Courses Selected ");
		lGender.setFont(fLabel);
		
		this.lAddress = new Label("Address ");
		lAddress.setFont(fLabel);
		
		
		this.bConfirm = new Button("Confirm");
		bConfirm.setFont(fLabel);
		
		tfName = new Label();
		tlName = new Label();
		tmobNo = new Label();
		tcoursesSelected = new Label();
		tgender = new Label();
		taddress = new Label();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		new SuccessMsg();
	}
}
