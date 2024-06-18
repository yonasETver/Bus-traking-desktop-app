package AllClass;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.border.Border;


public class Payment extends JFrame implements ActionListener {
	private Container c;
    private JLabel title;
    private JLabel rootid;
    private JTextField trootid;
    private JLabel payment;
    private JTextField tpayment;
    private JButton sub;
    private JButton back;
    
    private String id="",skm="";
    private float km;
    
    Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b10.png");
	 Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png");
    
    int f=0;
    static float n=0;
    
    JFrame frame;
    static int bb1=0;
   
    public static void onlyDigits(String str){
		try {
		    n = Float.parseFloat(str);
		    bb1=0;
		} catch (NumberFormatException e) {
		    // str is not a number
			bb1=-1;
		}
	}
	
	public Payment(String id,String skm)
    {
		
		 setIconImage(icon); 
		 
        setTitle("Payment");
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
        
        payment = new JLabel("Payment/KM");
        payment.setFont(new Font("Arial", Font.PLAIN, 20));
        payment.setSize(120, 20);
        payment.setLocation(100, 130);
        c.add(payment);
  
        tpayment = new JTextField();
        tpayment.setFont(new Font("Arial", Font.PLAIN, 15));
        tpayment.setSize(190, 20);
        tpayment.setLocation(250, 130);
        if(skm.equals("NULL") ) {
        	tpayment.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }else {
        	tpayment.setText(skm);
        }
        
        if(bb1==-1 || Payment.n<0 || Payment.n>1.5) {
        	tpayment.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }
        c.add(tpayment);
  
  
        
  
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
    		skm=tpayment.getText();
    		onlyDigits(skm);
    		if(id.length()==0 || skm.length()==0 ) {
    			if(id.length()==0) {
    				id="NULL";
    			}
    			if(skm.length()==0) {
    				skm="NULL";
    			}
    			
    			Payment p=new Payment(id,skm);
    			}else if(bb1==-1) {
    	            
                	JOptionPane.showMessageDialog(frame, "payment  must be number");
                	this.setVisible(false);
                	Payment p=new Payment(id,skm);
                	
                }else if(bb1==0 && Payment.n<=0 || Payment.n>1.5 ) {
                	f=-1;
                	JOptionPane.showMessageDialog(frame, "payment per km can not be <=0 and >1.5");
                	this.setVisible(false);
                	Payment p=new Payment(id,skm);
                }else {
    		 
    		km=Float.parseFloat(skm);
    		
    		try {
    			Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
    			Connection con= DriverManager.getConnection(url,user,password);
    			Statement stt= con.createStatement();
    			stt.execute("INSERT INTO paymentperkm (perKM,root_ID) VALUES"+ 
			            "('"+km+"','"+id+"')");
    	
    		
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
