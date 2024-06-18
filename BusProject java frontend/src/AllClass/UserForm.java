package AllClass;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;
import java.io.IOException;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import javax.swing.border.Border;

public class UserForm extends JFrame implements ActionListener {
	private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private  JPasswordField  tmno;
    private JButton sub;
    private JButton reset;
    private JLabel mess;
    private JButton back;
    JFrame frame;
    
    static int chk=0;

    Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b10.png");
	 Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png");
	
	 
	public static String userName="",passWor="";
	 
	 String sqlFname="";
	    String sqlLname="";
	    String sqlSex="";
	    String sqlBirthDay="";
	    String sqlBirthMonth="";
	    String sqlBirthyear="";
	    String sqlCoutry="";
	    String sqlRegion="";
	    String sqlCity="";
	    String sqlPhone="";
	    String sqlEmail="";
	    String sqlAccount="";
	    String sqlPass="";
	    String sqlPass2="";
	
	    int cs=0,cs1=0;
	
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
		

	public UserForm(String uName,String passW)
    {
		
		setIconImage(icon); 
		
		for(int i=0;i<201;i++) {
			years[i]=String.valueOf(i+1910);
		}
		
		for(int i=0;i<31;i++) {
			dates[i]=String.valueOf(i+1);
		}
		
		sqlBirthDay1= new String[1];
	    sqlBirthMonth1= new String[1];
	    sqlBirthyear1= new String[1];
	    
        setTitle("user login");
        setBounds(300, 90, 600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
  
        c = getContentPane();
        c.setLayout(null);
        
        back=new JButton(icon1);
        //back.setFont(new Font("Arial", Font.PLAIN, 18));
		//back.setText("Back");
	    back.setBackground(Color.decode("#F0F8FF"));
	    back.setBorder(BorderFactory.createLineBorder(Color.decode("#F0F8FF")));
	    back.setSize(60, 30);
        back.setLocation(60, 30);
        c.add(back);
  
        title = new JLabel("ABC");
        title.setFont(new Font("Arial", Font.BOLD, 29));
        title.setForeground(Color.BLUE);
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
  
        name = new JLabel("User name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        
  
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(250, 100);
        if(uName.equals("NULL")) {
        	tname.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }else if(chk==-1){
        	tname.setText(uName);
        	tname.setForeground(Color.RED);
        }else {
        	tname.setText(uName);
        }
        c.add(name);
        c.add(tname);
  
        mno = new JLabel("Password");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 130);
        c.add(mno);
  
        tmno = new JPasswordField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(190, 20);
        tmno.setLocation(250, 130);
        if(passW.equals("NULL")) {
        	tmno.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }else if(chk==-1) {
        	tmno.setText(passW);
        	tmno.setForeground(Color.RED);
        }else {
        	tmno.setText(passW);
        }
        c.add(tmno);
  
        
  
        sub = new JButton("Login");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setForeground(Color.MAGENTA);
        sub.setBackground(Color.CYAN);
        sub.setSize(100, 20);
        sub.setLocation(300, 180);
        //sub.addActionListener(this);
        c.add(sub);
  
        reset = new JButton("Sign-up");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setForeground(Color.magenta);
        reset.setBackground(Color.CYAN);
        reset.setSize(100, 20);
        reset.setLocation(300, 210);
       // reset.addActionListener(this);
        c.add(reset);
        
       
  
        
        sub.addActionListener(this);
        reset.addActionListener(this);
        back.addActionListener(this);
        
        
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
        
        setVisible(true);
    }
  
	 public void actionPerformed(ActionEvent e)
	    {
	        String s = e.getActionCommand();
	        if(s.equals("Login")) {
	        	//UserForm f = new UserForm();
	        	String url="jdbc:mysql://localhost:3306/project";
	    		String user="root";
	    		String password="";
	    		
	    		String name = tname.getText();
	    		String passUs=tmno.getText();
	    		
	    		if(name.length()==0 || passUs.length()==0) {
	    			if(name.length()==0) {
	    				name="NULL";
	    			}
	    			if(passUs.length()==0) {
	    				passUs="NULL";
	    			}
	    			UserForm f = new UserForm(name,passUs);
	    		}else {
	    		
	    		String qur="SELECT *FROM sigh_upuser WHERE AcounName='" + name + "'";
	    		String qur1="SELECT *FROM sigh_upuser WHERE pass='"+passUs+"'";
	    		//System.out.println(name);
	    		
	    		try {
	    			Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
	    			Connection con= DriverManager.getConnection(url,user,password);
	    			Statement stt= con.createStatement();
	    			
	  
	    			
	    		ResultSet re=stt.executeQuery(qur);//accessing table
	    		if (re.next()) {
	    			  // Table exists
	    			ResultSet re2=stt.executeQuery(qur1);//accessing table
	    			if (re2.next()) {
	    				this.setVisible(false);
	    				UserWindow  uw= new UserWindow ();
	    			}else {
	    				JOptionPane.showMessageDialog(frame, "Password or user name dose not match!!! please try again.");
	    				chk=-1;
	    				this.setVisible(false);
	    				userName=tname.getText();
	    				passWor=tmno.getText();
	    				UserForm f = new UserForm(userName,passWor);
	    				
	    			}
	    			
	    		}
	    		else {
	    			  // Table does not exist
	    			JOptionPane.showMessageDialog(frame, "Password or user name dose not match!!! please try again.");
	    			chk=-1;
	    			this.setVisible(false);
	    			userName=tname.getText();
    				passWor=tmno.getText();
	    			UserForm f = new UserForm(userName,passWor);
	    		}
	    		
	    		
	    		
	    		
	    		}catch(Exception ex) {
	    			ex.printStackTrace();
	    		}
	    	
	    		} 	
	        }else if(s.equals("Sign-up")) {
	        	this.setVisible(false);
	        	UserSugnUp u= new UserSugnUp(sqlFname,sqlLname,sqlCity,sqlPhone,sqlEmail,sqlAccount,sqlPass,sqlPass2,cs,cs1,dates,months,years);
	        }else {
	        	this.setVisible(false);
    			try {
					MainClass g=new MainClass();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    		}
	       
	    }
        
}

