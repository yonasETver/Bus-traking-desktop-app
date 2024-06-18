package AllClass;
import AllClass.AdminForm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class AdminWindow extends JFrame implements ActionListener{
	JLabel jl;
	JPanel jp,jp1,jp2;
	JButton jb,jb1,jb2,jb3,jb4,jb5,jb6;
	JButton back,adv;
	
	 Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b10.png");
	 Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png"); 
	
	private String id="",skm="";
	private String acc="",pass2="",empid3="";
	static String adv1="";
	private String sqlFname="",sqlLname="",sqlWork="",sqlExp="",sqlJob="";
	
	int cs1=0,cs2;
	
	 String [] sqlBirthDay1;
	    String [] sqlBirthMonth1;
	    String [] sqlBirthyear1;
	    
	    public static String dates[]=new String[31];
		
		public static String months[]
				= {"Jan","Feb","Mar","Apr",
				   "May","Jun","July","Aug",
				   "Sup","Oct","Nov","Dec"
						
				};
		public static String years []= new String[201];
		
		
		 public static String dates1[]=new String[31];
			
			public static String months1[]
					= {"Jan","Feb","Mar","Apr",
					   "May","Jun","July","Aug",
					   "Sup","Oct","Nov","Dec"
							
					};
			public static String years1 []= new String[100];
	
	
	AdminWindow(){
		
		 setIconImage(icon); 
		
		for(int i=0;i<201;i++) {
			years[i]=String.valueOf(i+1910);
		}
		
		for(int i=0;i<31;i++) {
			dates[i]=String.valueOf(i+1);
		}
		
		
		for(int i=0;i<100;i++) {
			years1[i]=String.valueOf(i+2020);
		}
		
		for(int i=0;i<31;i++) {
			dates1[i]=String.valueOf(i+1);
		}
		
		
		sqlBirthDay1= new String[1];
	    sqlBirthMonth1= new String[1];
	    sqlBirthyear1= new String[1];
	    
		Container cp =getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Admin window");
		setBounds(300, 90, 800, 400);
		
		back=new JButton(icon1);
        //back.setFont(new Font("Arial", Font.PLAIN, 18));
		//back.setText("Back");
	    back.setBackground(Color.decode("#F0F8FF"));
	    back.setBorder(BorderFactory.createLineBorder(Color.decode("#F0F8FF")));
	    back.setSize(40, 30);
		//back.setBackground(Color.orange);
		
		
		
		jp= new JPanel();
		jp1= new JPanel();
		jp2= new JPanel();
		
		jb= new JButton("Employee");
		jb1= new JButton("Station ID");
		jb2= new JButton("Station name");
		jb3= new JButton("Payment");
		jb4= new JButton("Station KM");
		jb5= new JButton("Addmin account");
		adv=new JButton("advert");
		jb6= new JButton("Bus number");
		
		jl= new JLabel("ABC");
		jl.setBounds(50, 100, 200, 50);
		jl.setFont(new Font("Verdana",Font.BOLD,29));
		jl.setForeground(Color.BLUE);
		
		back.setBounds(30, 100, 120, 20);
		jb.setBounds(30, 100, 100, 20);
		jb.setBackground(Color.CYAN);
		jb.setForeground(Color.magenta);
		jb1.setBounds(30, 100, 100, 20);
		jb1.setBackground(Color.CYAN);
		jb1.setForeground(Color.magenta);
		jb2.setBounds(30, 100, 100, 20);
		jb2.setBackground(Color.CYAN);
		jb2.setForeground(Color.magenta);
		jb3.setBounds(30, 100, 100, 20);
		jb3.setBackground(Color.CYAN);
		jb3.setForeground(Color.magenta);
		jb4.setBounds(30, 100, 100, 20);
		jb4.setBackground(Color.CYAN);
		jb4.setForeground(Color.magenta);
		jb5.setBounds(30, 100, 100, 20);
		jb5.setBackground(Color.CYAN);
		jb5.setForeground(Color.magenta);
		adv.setBounds(30, 100, 100, 20);
		adv.setBackground(Color.CYAN);
		adv.setForeground(Color.magenta);
		jb6.setBounds(30, 100, 100, 20);
		jb6.setBackground(Color.CYAN);
		jb6.setForeground(Color.magenta);
		
		jp.setLayout(new BorderLayout());
		jp1.setLayout(new FlowLayout());
		jp2.setLayout(new FlowLayout());
		
		cp.add(jp);
		jp.add(jp1,BorderLayout.CENTER);
		jp.add(jp2,BorderLayout.NORTH);
		jp2.add(jl);
		
		jp1.add(back);
		jp1.add(jb);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		jp1.add(jb5);
		jp1.add(adv);
		jp1.add(jb6);
		
		back.addActionListener(this);
        jb.addActionListener(this);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        adv.addActionListener(this);
        jb6.addActionListener(this);
		
		setVisible(true);
		
		

	}
	
	public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if(s.equals("Employee")) {
        	this.setVisible(false);
        	EmployeeForm em= new EmployeeForm(sqlFname,sqlLname,sqlWork,sqlExp,sqlJob,cs1,cs2,dates,months,years,dates1,months1,years1);
        	
        }
        else if(s.equals("Station ID")) {
        	this.setVisible(false);
        	EnterStation en=new EnterStation(StationName.stid,StationName.txt1);
        }
        else if(s.equals("Station name")) {
        	this.setVisible(false);
        	StationName st=new StationName (StationName.txt1,StationName.stid);
        }
        else if(s.equals("Payment")) {
        	this.setVisible(false);
        	Payment p = new Payment(id,skm);
        }
        else if(s.equals("Station KM")) {
        	this.setVisible(false);
        	EnterStationKM ep= new EnterStationKM(StationName.txt1,StationName.stid);
        }
        else if(s.equals("advert")) {
        	this.setVisible(false);
        	Advert b=new Advert(adv1);
        }
        else if(s.equals("Bus number")) {
        	this.setVisible(false);
        	BuseID bi=new BuseID(id,skm);
        }
        else if(s.equals("Addmin account")) {
        	this.setVisible(false);
        	AdminForm a= new AdminForm(acc,pass2,empid3);
        }
        else{
        	this.setVisible(false);
        	AdminSin as= new AdminSin(UserForm.userName,UserForm.passWor);
        }
        
    }

}
