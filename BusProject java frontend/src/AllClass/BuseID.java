package AllClass;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

import javax.imageio.ImageIO;



public class BuseID extends JFrame implements ActionListener  {
	
	
	private Container c;
    private JLabel title;
    private JLabel rootid;
    private JTextField trootid;
    private JLabel carid;
    private JTextField tcarid;
    private JLabel load_cap;
    private JTextField tload_cap;
    private JButton sub;
    private JButton back;
    
    private String id,skm;
    private int car_id;
    

    Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b10.png");
	 Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png");
    
    int f=0;
    static int n=4;
    
    JFrame frame;
    static int bb1=0;
    
   
    public static void onlyDigits(String str){
 		try {
 		    n = (int) Float.parseFloat(str);
 		    bb1=0;
 		} catch (NumberFormatException e) {
 		    // str is not a number
 			bb1=-1;
 		}
 	}
	
	public BuseID( String id,String skm) {
		
		setIconImage(icon); 
		
		
        setTitle("Buse id");
        setBounds(300, 90, 600, 300);
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
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.BLUE);
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
  
        rootid = new JLabel("Root ID");
        rootid.setFont(new Font("Arial", Font.PLAIN, 20));
        rootid.setSize(120, 20);
        rootid.setLocation(100, 100);
        c.add(rootid);
  
        trootid = new JTextField();
        trootid.setFont(new Font("Arial", Font.PLAIN, 15));
        trootid.setSize(190, 20);
        trootid.setLocation(250, 100);
        if(id.equals("NULL")) {
        	trootid.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }else {
        	trootid.setText(id);
        }
        c.add(trootid);
        
        carid = new JLabel("Bus number");
        carid.setFont(new Font("Arial", Font.PLAIN, 20));
        carid.setSize(120, 20);
        carid.setLocation(100, 130);
        c.add(carid);
  
        tcarid = new JTextField();
        tcarid.setFont(new Font("Arial", Font.PLAIN, 15));
        tcarid.setSize(190, 20);
        tcarid.setLocation(250, 130);
        if(skm.equals("NULL") ) {
        	 tcarid.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }else {
        	 tcarid.setText(skm);
        }
        
        if(bb1==-1 || StationName.n<0 || StationName.n>200) {
        	 tcarid.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }
        c.add(tcarid);
  
  
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(300, 170);
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
    		id=trootid.getText();
    		skm=tcarid.getText();
    		onlyDigits(skm);
    		if(id.length()==0 || skm.length()==0) {
    			if(id.length()==0) {
    				id="NULL";
    			}
    			if(skm.length()==0) {
    				skm="NULL";
    			}
    			this.setVisible(false);
    			BuseID b=new BuseID(id,skm);
    		}else if(bb1==-1) {
	            
            	JOptionPane.showMessageDialog(frame, "bus number   must be integer number");
            	this.setVisible(false);
            	BuseID b=new BuseID(id,skm);
            	
            }else if(bb1==0 && StationName.n<=0 || StationName.n>200 ) {
            	f=-1;
            	JOptionPane.showMessageDialog(frame, "Bus number must be between 1 and 200");
            	this.setVisible(false);
            	BuseID b=new BuseID(id,skm);
            }else {
    		
    		
    		car_id=Integer.parseInt(skm);
    	    
    		//load=tload_cap.getText();
    		//lod= Integer.parseInt(load);
    		
    		try {
    			Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
    			Connection con= DriverManager.getConnection(url,user,password);
    			Statement stt= con.createStatement();
    			stt.execute("INSERT INTO busid (carId,root_ID) VALUES"+ 
			            "('"+car_id+"','"+id+"')");
    	
    		
    		this.setVisible(false);
    		}catch(Exception ex) {
    			ex.printStackTrace();
    		}
    	
            }
        }else {
        	this.setVisible(false);
        	AdminWindow aw = new AdminWindow();
        }
		}

}
