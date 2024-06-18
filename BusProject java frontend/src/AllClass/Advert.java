package AllClass;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import javax.swing.border.Border;

public class Advert extends JFrame implements ActionListener {
	private Container c;
    private JLabel title;
    private JLabel addAdver;
    private JTextField taddAdver;
    
    private JButton sub,back;
    
    JFrame frame;
    private String adv="";
    int f=0;
    static int n=4;
    static int bb1=0;
    
    Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b10.png");
 	 Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png");
   
  
    public static void onlyDigits(String str){
 		try {
 		    n = Integer.parseInt(str);
 		    bb1=-2;
 		} catch (NumberFormatException e) {
 		    // str is not a number
 			bb1=-1;
 		}
 	}
	
	public Advert(String adv)
    {
		
		 setIconImage(icon);
		 
        setTitle("Advertise");
        setBounds(300, 90, 600, 250);
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
        title.setBackground(Color.orange);
        title.setForeground(Color.BLUE);
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
  
        addAdver = new JLabel("Advertise");
        addAdver.setFont(new Font("Arial", Font.PLAIN, 20));
        addAdver.setSize(120, 20);
        addAdver.setLocation(100, 100);
        c.add(addAdver);
  
        taddAdver = new JTextField();
        taddAdver.setFont(new Font("Arial", Font.PLAIN, 15));
        taddAdver.setSize(190, 20);
        taddAdver.setLocation(250, 100);
        if(adv.equals("NULL")) {
        	taddAdver.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }else {
        	taddAdver.setText(adv);
        }if(bb1==-2) {
        	taddAdver.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }
        c.add(taddAdver);
  
  
        
  
        sub = new JButton("ADD");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(300, 130);
        sub.setBackground(Color.CYAN);
        sub.setForeground(Color.magenta);
        
        c.add(sub);
        back.addActionListener(this);
        sub.addActionListener(this);
       
  
        
        setVisible(true);
    }
	
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if(s.equals("ADD")) {
			
	        String url="jdbc:mysql://localhost:3306/project";
    		String user="root";
    		String password="";
    		
			adv=taddAdver.getText();
			onlyDigits(adv);
			if(adv.length()==0) {
				adv="NULL";
				this.setVisible(false);
				 Advert a=new Advert(adv);
			}else if(bb1==-2) {
		        
	        	JOptionPane.showMessageDialog(frame, "advert must be a string");
	        	this.setVisible(false);
	        	 Advert a=new Advert(adv);
	        	
	        }else {
	        	//post to server
	        	try {
	    			Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
	    			Connection con= DriverManager.getConnection(url,user,password);
	    			Statement stt= con.createStatement();
	    			stt.execute("INSERT INTO advert (advertise) VALUES"+ 
				            "('"+adv+"')");
	    	
	    		
	    		this.setVisible(false);
	    		}catch(Exception ex) {
	    			ex.printStackTrace();
	    		}
	        }
		}else{
			this.setVisible(false);
			AdminWindow aw = new AdminWindow();
	        }
		
	}

}
