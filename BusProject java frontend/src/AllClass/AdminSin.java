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

public class AdminSin extends JFrame implements ActionListener {
	private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JPasswordField tmno;
    private JButton sub;
    private JOptionPane jop;
    private JButton back;
    
    static int chk=0;
    Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b10.png");
    Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png"); 
    
    public static String userName="",passWor="";
     
    JFrame frame;
	
	public AdminSin(String uName,String passW)
    {
		
	   setIconImage(icon); 
		  
        setTitle("Admin login");
        setBounds(300, 90, 600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
  
        c = getContentPane();
        c.setLayout(null);
        
        back=new JButton(icon1);
        back.setFont(new Font("Arial", Font.PLAIN, 18));
        //back.setText("Back");
        back.setBackground(Color.decode("#F0F8FF"));
        back.setBorder(BorderFactory.createLineBorder(Color.decode("#F0F8FF")));
        //back.setBackground(Color.orange);
        back.setSize(50, 30);
        back.setLocation(60, 30);
        c.add(back);
  
        title = new JLabel("ABC");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.BLUE);
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
  
        name = new JLabel("Admin name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(150, 20);
        name.setLocation(100, 100);
        c.add(name);
  
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(250, 100);
        if(uName.equals("NULL")) {
        	tname.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }else if(chk==-1) {
        	tname.setText(uName);
        	tname.setForeground(Color.RED);
        }else {
        	tname.setText(uName);
        }
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
        sub.setSize(100, 20);
        sub.setLocation(300, 180);
        sub.setBackground(Color.CYAN);
        sub.setForeground(Color.magenta);
        c.add(sub);
  
        jop=new JOptionPane();
        sub.addActionListener(this);
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
      //  System.out.println("llllll"+ s);
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
    			AdminSin as= new AdminSin(name,passUs);
    		}else {
    		String qur="SELECT *FROM sign_inadmin WHERE acount='"+name+"'";
    		String qur1="SELECT *FROM sign_inadmin WHERE pass='"+passUs+"'";
    		
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
    				AdminWindow aw = new AdminWindow();
    			}else {
    				
    				jop.showMessageDialog(frame, "Password or user name dose not match!!! please try again.");
    				chk=-1;
    				userName=tname.getText();
    				passWor=tmno.getText();
    				this.setVisible(false);
    				AdminSin as= new AdminSin(userName,passWor);
    				
    			}
    			
    		}
    		else {
    			  
    			jop.showMessageDialog(frame, "Password or user name dose not match!!! please try again.");
    			chk=-1;
    			userName=tname.getText();
				passWor=tmno.getText();
    			this.setVisible(false);
    			AdminSin as= new AdminSin(userName,passWor);
    		}
    		
    		
    		}catch(Exception ex) {
    			ex.printStackTrace();
    		}
    	
    		}	
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


