package AllClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.Border;

public class AdminForm extends JFrame implements ActionListener {
	private Container c;
    private JLabel title;
    private JLabel acoun;
    private JTextField tacoun;
    private JLabel pass;
    private JTextField tpass;
    private JLabel empid;
    private JTextField tempid;
    private JButton sub;
    private JButton reset;
    private JButton back;
    private String acc="",pass2="",empid3="";
    private int empid2;
    
    JFrame frame;
    
    Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b10.png");
  	 Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png");
    
    int f=0;
    static int n=4;
    static int bb1=0;
    
    
    public static void onlyDigits(String str){
 		try {
 		    n = Integer.parseInt(str);
 		    bb1=0;
 		} catch (NumberFormatException e) {
 		    // str is not a number
 			bb1=-1;
 		}
 	}
	
	public AdminForm(String acc,String pass2,String empid3)
    {
		

		 setIconImage(icon); 
		 
        setTitle("addmin form");
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
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
        title.setForeground(Color.BLUE);
  
        acoun = new JLabel("Acount");
        acoun.setFont(new Font("Arial", Font.PLAIN, 20));
        acoun.setSize(100, 20);
        acoun.setLocation(100, 100);
        c.add(acoun);
  
        tacoun = new JTextField();
        tacoun.setFont(new Font("Arial", Font.PLAIN, 15));
        tacoun.setSize(190, 20);
        tacoun.setLocation(250, 100);
        if(acc.equals("NULL")) {
        	tacoun.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }else {
        	tacoun.setText(acc);
        }
        c.add(tacoun);
  
        pass = new JLabel("Password");
        pass.setFont(new Font("Arial", Font.PLAIN, 20));
        pass.setSize(100, 20);
        pass.setLocation(100, 130);
        c.add(pass);
  
        tpass = new JTextField();
        tpass.setFont(new Font("Arial", Font.PLAIN, 15));
        tpass.setSize(190, 20);
        tpass.setLocation(250, 130);
        if(pass2.equals("NULL")) {
        	tpass.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }else {
        	tpass.setText(pass2);
        }
        c.add(tpass);
  
        
        empid = new JLabel("Employee ID");
        empid.setFont(new Font("Arial", Font.PLAIN, 20));
        empid.setSize(150, 20);
        empid.setLocation(100, 160);
        c.add(empid);
  
        tempid = new JTextField();
        tempid.setFont(new Font("Arial", Font.PLAIN, 15));
        tempid.setSize(190, 20);
        tempid.setLocation(250, 160);
        if(empid3.equals("NULL")) {
        	tempid.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }else {
        	tempid.setText(empid3);
        }
        if(bb1==-1 || NewStationKM.n<1 || NewStationKM.n>50) {
        	tempid.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }
        c.add(tempid);
  
        
  
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(300, 200);
        sub.setBackground(Color.CYAN);
        sub.setForeground(Color.magenta);
        c.add(sub);
        sub.addActionListener(this);
        back.addActionListener(this);
       
        
        setVisible(true);
    }
	
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if(s.equals("Submit")) {
			String url="jdbc:mysql://localhost:3306/project";
    		String user="root";
    		String password="";
    		acc=tacoun.getText();
    		pass2=tpass.getText();
    		empid3=tempid.getText();
    		
    		onlyDigits(empid3);
    		
    		if(acc.length()==0 || pass2.length()==0 || empid3.length()==0) {
    			if(acc.length()==0) {
    				acc="NULL";
    			}
    			if(pass2.length()==0) {
    				pass2="NULL";
    			}
    			if(empid3.length()==0) {
    				empid3="NULL";
    			}
    			AdminForm af= new AdminForm(acc,pass2,empid3);
    		}else if(bb1==-1) {
    	        
            	JOptionPane.showMessageDialog(frame, "Employe id must be number");
            	this.setVisible(false);
            	AdminForm af= new AdminForm(acc,pass2,empid3);
            }else if(bb1==0 && NewStationKM.n<0 || NewStationKM.n>50 ) {
            	f=-1;
            	JOptionPane.showMessageDialog(frame, "Employe id can not  be  <1 and >50");
            	this.setVisible(false);
            	AdminForm af= new AdminForm(acc,pass2,empid3);
            }else {
    		empid2=Integer.parseInt(empid3);
    		
    		try {
    			Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
    			Connection con= DriverManager.getConnection(url,user,password);
    			Statement stt= con.createStatement();
    			stt.execute("INSERT INTO sign_inadmin (acount,pass,emp_Id) VALUES"+ 
			            "('"+acc+"','"+pass2+"','"+empid2+"')");
    	
    		this.setVisible(false);
    		
    		}catch(Exception ex) {
    			ex.printStackTrace();
    		}
    		}
        	
        }else  {
        	this.setVisible(false);
        	AdminWindow aw = new AdminWindow();
        }
		}

  
}
