package AllClass;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.Icon;

public class MainClass extends JFrame implements ActionListener {
	JPanel jp,jp1,jp2,jp3,jp4,jp5,jp6,jp7,jp8;
	JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6;
	JTextField tx;
	JButton jb,jb1;
	
	Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b1");
	Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png"); 
	 
	private String userName="",passWor="";
	
	public MainClass() throws IOException {
		
		BufferedImage image = ImageIO.read(new File("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\image1.jpg"));
		
		
	    JLabel label = new JLabel(new ImageIcon(image));
	    //label.setPreferredSize(new Dimension(0, 00));
	    setIconImage(icon); 
	    
	Container cp =getContentPane();
	setDefaultLookAndFeelDecorated(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	setTitle("Main window");
	setBounds(300, 90, 1200, 650);
	
	
	//JPanels
	jp=new JPanel();
	jp1=new JPanel();
	jp2=new JPanel();
	jp3=new JPanel();
	jp4=new JPanel();
	jp5=new JPanel();
	jp6=new JPanel();
	jp7=new JPanel();
	jp8=new JPanel();
	jp3.add(label);
	
	jb=new JButton("User");
	jb1=new JButton("Admin");
	jb.setFont(new Font("Verdana",Font.BOLD,18));
	jb1.setFont(new Font("Verdana",Font.BOLD,18));
	jb.setForeground(Color.BLUE);
	jb1.setForeground(Color.BLUE);
	
	jl=new JLabel("                             ");
	jl1=new JLabel("                             ");
	jl2=new JLabel("                             ");
	jl3=new JLabel("                             ");
	jl4=new JLabel("Search  ");
	jl5=new JLabel("                                                                                                        ");
	jl6=new JLabel("Who are you?");
	
	jl4.setBounds(100, 40, 100, 40);
	jl4.setFont(new Font("Verdana",Font.PLAIN,20));
	jl6.setFont(new Font("Verdana",Font.ITALIC,28));
	jl6.setForeground(Color.RED);
	
	tx= new JTextField();
	tx.setColumns(25);
	tx.setFont(new Font("Verdana",Font.PLAIN,20));
	tx.setEditable(false);
	
	cp.add(jp);
	
	
	
	//setLayout 
	jp.setLayout(new BorderLayout());
	//jp.setBackground(Color.orange);
	
	jp1.setLayout(new BorderLayout());
	jp1.setBackground(Color.lightGray);
	jp2.setBackground(Color.CYAN);
	
	jp.add(jp1,BorderLayout.CENTER);
	
	jp.add(jl,BorderLayout.EAST);
	jp.add(jl1,BorderLayout.WEST);
	jp.add(jl2,BorderLayout.NORTH);
	jp.add(jl3,BorderLayout.SOUTH);
	
	
	jp2.setLayout(new FlowLayout());
	jp1.add(jp2,BorderLayout.NORTH);
	jp2.add(jl4);
	jp2.add(tx);
	
	jp3.setLayout(new GridLayout(1,1));
	jp1.add(jp3,BorderLayout.WEST);
	
	//jp3.setBackground(Color.BLUE);
	
	
	
	
	//jp3.add(jl5);
	
	jp4.setLayout(new BorderLayout());
	jp1.add(jp4,BorderLayout.CENTER);
	
	jp6.setLayout(new FlowLayout());
	jp4.add(jp6,BorderLayout.NORTH);
	jp6.add(jl6);
	
	jp5.setLayout(new FlowLayout());
	jp7.setLayout(new BorderLayout());
	jp4.add(jp7,BorderLayout.CENTER);
	jp7.add(jp5,BorderLayout.NORTH);
	jp5.add(jb);
	jp8.setLayout(new FlowLayout());
	jp7.add(jp8,BorderLayout.CENTER);
	jp8.add(jb1);
	
	
	//MainClass c = new MainClass();
	
	jb.addActionListener(this);
	jb1.addActionListener(this);
	

	
	 
	
	//jp4.add(jp7);
	setVisible(true);
	
	}
	
	 public void actionPerformed(ActionEvent e)
	    {
	        String s = e.getActionCommand();
	        if(s.equals("User")) {
	        	this.setVisible(false);
	        	UserForm f = new UserForm(userName,passWor);
	        	
	        	
	        }
	        else if(s.equals("Admin")) {
	        	this.setVisible(false);
	        	AdminSin as= new AdminSin(userName,passWor);
	        	
	        }
	    }

	
	
}
