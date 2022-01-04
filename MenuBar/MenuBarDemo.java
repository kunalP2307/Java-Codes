import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarDemo extends Frame implements ActionListener {
	
	MenuBar menuBar;
	Menu mFile;
	Menu mNew;
	Menu mRecent;
	CheckboxMenuItem mIFileExplorer;
	MenuItem[] mINew,mIRecent;
	MenuItem mIOpen,mIExit;
	TextArea textArea;
	
	public MenuBarDemo() {
		initComponents();
		setSize(600,600);
		
		textArea.setBounds(20,60,600,600);
		
		for(int i=0; i<3; i++) {
			mNew.add(mINew[i]);
			mRecent.add(mIRecent[i]);
		}
		
		mFile.add(mIFileExplorer);
		mFile.add(mNew);
		mFile.add(mIOpen);
		mFile.add(mRecent);
		mFile.add(mIExit);
		menuBar.add(mFile);
		add(textArea);
		mINew[1].addActionListener(this);
		setMenuBar(menuBar);
		
		setLayout(null);
		setVisible(true);
	}
	
	public void initComponents() {
		textArea = new TextArea();
		menuBar = new MenuBar();
		mFile = new Menu("File");
		mNew = new Menu("New");
		mRecent = new Menu("Recent");
		
		mIFileExplorer =  new CheckboxMenuItem("File Explorer");
		mINew = new MenuItem[3];
		mINew[0] = new MenuItem("txt File");
		mINew[1] = new MenuItem("html File");
		mINew[2] = new MenuItem("xml File");
		
		mIOpen = new MenuItem("Open");
		
		mIRecent = new MenuItem[3];
		mIRecent[0] = new MenuItem("FontDemo.java");
		mIRecent[1] = new MenuItem("index.html");
		mIRecent[2] = new MenuItem("file.txt");
		
		mIExit = new MenuItem("Exit");
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mINew[1]) {
			textArea.setText("\n"
					+ "<!DOCTYPE html>\n"
					+ "<html>\n"
					+ " <head>\n"
					+ "		<title>Document</title>\n"
					+ " </head>\n"
					+ "  <body>\n"
					+ "  </body>\n"
					+ "</html>\n"
					+ "");
		}
		
	}
	
	public static void main(String Args[]) {
		new MenuBarDemo();
	}
}

