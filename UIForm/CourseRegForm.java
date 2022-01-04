import java.awt.*;
import java.awt.event.*;

public class CourseRegForm extends Frame {
	
	Label lRegForm;
	Label lFName;
	TextField tFName;
	Label lLName;
	TextField tLName;
	Label lMobNo;
	TextField tMobNo;
	Label lCourse;
	Checkbox[] cBoxCourses;
	Label lGender;
	CheckboxGroup cBoxGender;
	Checkbox cBoxMale;
	Checkbox cBoxFemale;
	Checkbox cBoxOther;
	Label lAddress;
	TextArea tAddress;
	Button bSubmit;
	
	protected static String courses[] = {"Java-2","Android","JSP","ST","SC"};
	
	public CourseRegForm() {
		
		/*addWindowListener(new WindowAdapter(){  
			public void windowClosing(WindowEvent e) {  
				dispose();  
	        }  
	    });  */
		
		
		setSize(450,700);    
		initComponents();
		lRegForm.setBounds(40,50,360,20);	
		
		lFName.setBounds(50,100,120,20);
		tFName.setBounds(180,100,120,20);
		
		lLName.setBounds(50,140,120,20);
		tLName.setBounds(180,140,120,20);
		
		lMobNo.setBounds(50,180,120,20);
		tMobNo.setBounds(180,180,120,20);
		
		lCourse.setBounds(50,220,150,20);
		
		int y= 250;
		
		for(int i=0; i<5; i++) {
			cBoxCourses[i].setBounds(180,y,100,20);
			y += 25;
		}
		
		
		lGender.setBounds(50,380,150,20);
		
		cBoxMale.setBounds(180,410,100,20);
		cBoxFemale.setBounds(180,435,100,20);
		cBoxOther.setBounds(180,460,100,20);
		
		lAddress.setBounds(50,500,120,20);
		tAddress.setBounds(180,500,120,70);
		bSubmit.setBounds(160,600,100,35);
		
		add(lRegForm);
		add(lFName);
		add(lLName);
		add(tFName);
		add(lLName);
		add(tLName);
		add(lMobNo);
		add(tMobNo);
		add(lCourse);
		
		for(int i=0; i<5; i++)
			add(cBoxCourses[i]);
			
		add(lGender);
		add(cBoxMale);
		add(cBoxFemale);
		add(cBoxOther);
		add(lAddress);
		add(tAddress);
		add(bSubmit);
		setLayout(null);
		setVisible(true);
	}
	
	// function to init the Components 
	public void initComponents() {
		Font fLabel = new Font("Serif",Font.PLAIN,18);
		
		this.lRegForm = new Label("Course Regestration Form");
		lRegForm.setFont(new Font("Serif",Font.BOLD,24));
		
		this.lFName = new Label("First Name ");
		lFName.setFont(fLabel);
		
		this.lLName = new Label("Last Name ");
		lLName.setFont(fLabel);
		
		this.lMobNo = new Label("Mobile No. ");
		lMobNo.setFont(fLabel);
		
		this.lCourse = new Label("Select Courses ");
		lCourse.setFont(fLabel);
		
		cBoxCourses = new Checkbox[5];
		for(int i=0; i<5; i++)
			cBoxCourses[i] = new Checkbox(courses[i]);
			
		this.lGender = new Label("Select Gender ");
		lGender.setFont(fLabel);
		
		this.lAddress = new Label("Address ");
		lAddress.setFont(fLabel);
		
		this.tFName = new TextField();
		this.tLName = new TextField();
		this.tMobNo = new TextField();
		
		this.cBoxGender = new CheckboxGroup();
		this.cBoxMale = new Checkbox("Male",cBoxGender,false);
		this.cBoxFemale = new Checkbox("Female",cBoxGender,false);
		this.cBoxOther = new Checkbox("Other",cBoxGender,false); 
		
		
		this.tAddress = new TextArea();
		this.bSubmit = new Button("Submit");
		bSubmit.setFont(fLabel);
	}
	
	public static void main(String args[]) {
		new CourseRegForm();
	}
	
}
