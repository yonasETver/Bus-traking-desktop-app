package AllClass;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class UserWindow  extends JFrame implements ActionListener {
	JLabel jl,jl1,jl2,jl3;
	JPanel jp,jp1,jp2,jp3,jp4,jp5,jp6,jp7;
	JButton jb,jb1,jb2,jb3,jb4;
	JButton back;
	

    Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b10.png");
	 Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png");
	
	//private String userName="",passWor="";
	
	UserWindow(){
		
		setIconImage(icon); 
		
		Container cp =getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("User window");
		setBounds(300, 90, 800, 400);
		
		back=new JButton(icon1);
        //back.setFont(new Font("Arial", Font.PLAIN, 18));
		//back.setText("Back");
	    back.setBackground(Color.decode("#F0F8FF"));
	    back.setBorder(BorderFactory.createLineBorder(Color.decode("#F0F8FF")));
	    back.setSize(60, 30);
        back.setLocation(60, 30);
	    
	        
		jp= new JPanel();
		jp1= new JPanel();
		jp2= new JPanel();
		jp3= new JPanel();
		jp4= new JPanel();
		jp5= new JPanel();
		jp6= new JPanel();
		jp7= new JPanel();
		
		jb= new JButton("List all root");
		jb1= new JButton("View spacific root");
		//jb2= new JButton("View spacific root payment");
		jb3= new JButton("View spacific root waiting time");
		//jb4= new JButton("View spacific root payment bus distance");
		
		jl= new JLabel("ABC CITY BUS TRACKING SYSTEM ");
		jl1= new JLabel("                  ");
		jl2= new JLabel("                   ");
		jl3= new JLabel(" ");
		jl3.setFont(new Font("Verdana",Font.BOLD,29));
		jl.setBounds(50, 100, 200, 50);
		jl.setFont(new Font("Verdana",Font.BOLD,29));
		jl.setForeground(Color.BLUE);
		
		back.setBounds(30, 100, 120, 20);
		back.setBackground(Color.ORANGE);
		jb.setBounds(30, 100, 100, 20);
		jb.setBackground(Color.CYAN);
		jb1.setBounds(30, 100, 100, 20);
		jb1.setBackground(Color.CYAN);
		//jb2.setBounds(30, 100, 100, 20);
		//jb2.setBackground(Color.CYAN);
		jb3.setBounds(30, 100, 100, 20);
		jb3.setBackground(Color.CYAN);
		//jb4.setBounds(30, 100, 100, 20);
		//jb4.setBackground(Color.CYAN);
		
		jp.setLayout(new BorderLayout());
		jp1.setLayout(new BorderLayout());
		jp2.setLayout(new BorderLayout());
		jp3.setLayout(new FlowLayout());
		jp4.setLayout(new FlowLayout());
		jp5.setLayout(new FlowLayout());
		jp6.setLayout(new FlowLayout());
		jp7.setLayout(new FlowLayout());
		
		
		cp.add(jp);
		jp.add(jp1,BorderLayout.CENTER);
		jp1.add(jp4,BorderLayout.NORTH);
		jp4.add(jl);
		jp1.add(jp2,BorderLayout.CENTER);
		jp2.add(jp3,BorderLayout.NORTH);
		
		jp1.add(jp5,BorderLayout.SOUTH);
		jp5.add(jl2);
		jp1.add(jp6,BorderLayout.EAST);
		jp6.add(jl1);
		jp1.add(jp7,BorderLayout.WEST);
		jp7.add(jl2);
		
		Border blue = BorderFactory.createLineBorder(Color.BLUE);
		jp2.setBorder(blue);
		
		jp3.add(back);
		jp3.add(jb);
		jp3.add(jb1);
		//jp3.add(jb2);
		jp3.add(jb3);
		//jp3.add(jb4);
		
		
		jb.addActionListener(this);
        jb1.addActionListener(this);
        //jb2.addActionListener(this);
        jb3.addActionListener(this);
        //jb4.addActionListener(this);
        back.addActionListener(this);
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if(s.equals("List all root")) {
        	this.setVisible(false);
        	CountTable ct= new CountTable();
        	
             
        }
        else if(s.equals("View spacific root")) {
        	//station id
        	this.setVisible(false);
        	SpecificRoot sp= new SpecificRoot();
        }
        else if(s.equals("View spacific root waiting time")) {
        	//Payment
        	this.setVisible(false);
        	BusTracking bt=new BusTracking();
        }else {
        	this.setVisible(false);
        	UserForm f = new UserForm(UserForm.userName,UserForm.passWor);
        }
    }


}
