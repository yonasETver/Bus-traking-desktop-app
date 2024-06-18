package AllClass;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.Border;

public class SpecificRootView extends JFrame implements ActionListener,ItemListener {
	
	 
		private JLabel jl0,jl01,jl02,jl03,jl,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10;
		private JPanel jp0,jp01,jp02,jp03,jp04,jp05,jp06,jp07,jp,jp2,jp3,jp4,flow,flow1;
		private JButton jb0,jb01,jb02,jb03,jb04;
		private JButton back;
		private JComboBox jc,jc1,jc2,jc3;
		private JTextField jt,jt1,jt2,jt3,jt4;
		
		
		private String [] one,two,three,stationName,rootID;
		private float [] pay,staKm;
		private int [] bus_no;
		int indx3;
		private String bus;
		
		Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b10.png");
		 Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png");
		
		
		 int indx10;
		 int [] bus_no10;
		 String [] stationName10;
		 float [] pay10,staKm10;
		
	
	public SpecificRootView(String [] rootID,int indx,int [] bus_no,String [] stationName,float [] pay,float [] staKm) {
		setIconImage(icon); 
		
		indx10=indx;
		int i;
		this.bus_no10=new int[bus_no.length];
		for(i=0;i<bus_no.length;i++) {
			this.bus_no10[i]=bus_no[i];
		}
		
		stationName10= new String[stationName.length];
		for(i=0;i<stationName.length;i++) {
			stationName10[i]=stationName[i];
		}
		
		pay10= new float[pay.length];
		for(i=0;i<pay.length;i++) {
			pay10[i]=pay[i];
		}
		
		staKm10=new float[staKm.length];
		for(i=0;i<staKm.length;i++) {
			staKm10[i]=staKm[i];
		}
		
		
				
		this.rootID=new String[rootID.length];
		for(i=0;i<rootID.length;i++) {
			this.rootID[i]=rootID[i];
		}
		this.stationName= new String[stationName.length];
		for(i=0;i<stationName.length;i++) {
			this.stationName[i]=stationName[i];
		}
		this.pay=new float[pay.length]; 
		for(i=0;i<pay.length;i++) {
			this.pay[i]=pay[i];
		} 
		
		this.staKm=new float[staKm.length];
		for(i=0;i<staKm.length;i++) {
			this.staKm[i]=staKm[i];
		}
		
		this.bus_no=new int[bus_no.length];
		for(i=0;i<bus_no.length;i++) {
			this.bus_no[i]=bus_no[i];
		}
		
		this.indx3=indx;
		
		bus=String.valueOf(bus_no[indx3]);
		
		
		
		one =new String [4];
		two =new String [4];
		three =new String [4];
		Container cp =getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("User window");
		setBounds(300, 90, 800, 400);
		
		
		
		jp0= new JPanel();
		jp01= new JPanel();
		jp02= new JPanel();
		jp03= new JPanel();
		jp04= new JPanel();
		jp05= new JPanel();
		jp06= new JPanel();
		jp07= new JPanel();
		
		jl=new JLabel("Root");
		jl.setFont(new Font("Verdana",Font.BOLD,16));
		jl.setBackground(Color.orange);
		jl2=new JLabel("Station Start");
		jl2.setFont(new Font("Verdana",Font.BOLD,16));
		jl2.setBackground(Color.orange);
		jl3=new JLabel("Station end");
		jl3.setFont(new Font("Verdana",Font.BOLD,16));
		jl3.setBackground(Color.orange);
		jl4=new JLabel("Bus no");
		jl4.setFont(new Font("Verdana",Font.BOLD,16));
		jl4.setBackground(Color.pink);
		jl5=new JLabel("Start");
		jl5.setFont(new Font("Verdana",Font.BOLD,16));
		jl5.setBackground(Color.pink);
		jl6=new JLabel("End");
		jl6.setFont(new Font("Verdana",Font.BOLD,16));
		jl6.setBackground(Color.orange);
		jl7=new JLabel("Total km");
		jl7.setFont(new Font("Verdana",Font.BOLD,16));
		jl7.setBackground(Color.pink);
		jl8=new JLabel("Payment");
		jl8.setFont(new Font("Verdana",Font.BOLD,16));
		jl8.setBackground(Color.pink);
		
		jl10=new JLabel("Specific Root Detail");
		jl10.setFont(new Font("Verdana",Font.BOLD,29));
		jl10.setForeground(Color.BLACK);
		
		jt= new JTextField();
		jt.setEditable(false);
	    jt.setColumns(10);
	    jt.setForeground(Color.WHITE);
	    jt.setBackground(Color.darkGray);
		jt1= new JTextField();
		jt1.setEditable(false);
	    jt1.setColumns(10);
	    jt1.setForeground(Color.WHITE);
	    jt1.setBackground(Color.darkGray);
		jt2= new JTextField();
		jt2.setEditable(false);
	    jt2.setColumns(10);
	    jt2.setForeground(Color.WHITE);
	    jt2.setBackground(Color.darkGray);
		jt3= new JTextField();
		jt3.setEditable(false);
	    jt3.setColumns(10);
	    jt3.setForeground(Color.WHITE);
	    jt3.setBackground(Color.darkGray);
		jt4= new JTextField();
		jt4.setEditable(false);
	    jt4.setColumns(10);
	    jt4.setForeground(Color.WHITE);
	    jt4.setBackground(Color.darkGray);
		 
		jc=new JComboBox(rootID);
		jc.setFont(new Font("Arial", Font.PLAIN, 14));
        jc.setSize(50, 20);
        jc.setMaximumRowCount(4);
		jc2=new JComboBox(stationName);
		jc2.setSelectedIndex(-1);
		jc2.setFont(new Font("Arial", Font.PLAIN, 14));
        jc2.setSize(50, 20);
        jc2.setMaximumRowCount(4);
		jc3=new JComboBox(stationName);
		jc3.setSelectedIndex(-1);
		jc3.setFont(new Font("Arial", Font.PLAIN, 14));
        jc3.setSize(50, 20);
        jc3.setMaximumRowCount(4);
		
		
		
	 
		cp.add(jp0);
		
		    jp = new JPanel(new BorderLayout());
		    jp2 = new JPanel(new BorderLayout());
		    jp3 = new JPanel(new FlowLayout());
		    jp4 = new JPanel(new GridLayout(2,5,10,10));
		    flow=new JPanel(new FlowLayout());
		    flow1=new JPanel(new FlowLayout());
		   
		   // getContentPane().add(jp0);
		  
		    back=new JButton(icon1);
	        //back.setFont(new Font("Arial", Font.PLAIN, 18));
			back.setText("");
		    back.setBackground(Color.decode("#F0F8FF"));
		    back.setBorder(BorderFactory.createLineBorder(Color.decode("#F0F8FF")));
		    back.setSize(60, 30);
	        back.setLocation(60, 30);
	        
		    jb0= new JButton("List all root");
			jb01= new JButton("View spacific root");
			//jb02= new JButton("View spacific root payment");
			jb03= new JButton("View spacific root waiting time");
			//jb04= new JButton("View spacific root payment bus distance");
			
			jl0= new JLabel("ABC CITY BUS TRACKING SYSTEM");
			jl01= new JLabel("                  ");
			jl02= new JLabel("                   ");
			jl03= new JLabel(" ");
			jl03.setFont(new Font("Verdana",Font.BOLD,29));
			jl0.setBounds(50, 100, 200, 50);
			jl0.setFont(new Font("Verdana",Font.BOLD,29));
			jl0.setForeground(Color.BLUE);
			
			//back.setBounds(30, 100, 120, 20);
			//back.setBackground(Color.ORANGE);
			jb0.setBounds(30, 100, 100, 20);
			jb0.setBackground(Color.CYAN);
			jb01.setBounds(30, 100, 100, 20);
			jb01.setBackground(Color.orange);
			//jb02.setBounds(30, 100, 100, 20);
			//jb02.setBackground(Color.CYAN);
			jb03.setBounds(30, 100, 100, 20);
			jb03.setBackground(Color.CYAN);
			//jb04.setBounds(30, 100, 100, 20);
			//jb04.setBackground(Color.CYAN);
			
			jp0.setLayout(new BorderLayout());
			jp01.setLayout(new BorderLayout());
			jp02.setLayout(new BorderLayout());
			jp03.setLayout(new FlowLayout());
			jp04.setLayout(new FlowLayout());
			jp05.setLayout(new FlowLayout());
			jp06.setLayout(new FlowLayout());
			jp07.setLayout(new FlowLayout());
			
			
			
			//cp.add(jp0);
			jp0.add(jp01,BorderLayout.CENTER);
			jp0.add(jp04,BorderLayout.NORTH);
			jp04.add(jl0);
			jp01.add(jp02,BorderLayout.CENTER);
			jp02.add(jp03,BorderLayout.NORTH);
			
			jp01.add(jp05,BorderLayout.SOUTH);
			jp05.add(jl02);
			jp01.add(jp06,BorderLayout.EAST);
			jp06.add(jl01);
			jp01.add(jp07,BorderLayout.WEST);
			jp07.add(jl02);
			
			
			jp02.add(jp,BorderLayout.CENTER);
			jp.add(flow1,BorderLayout.NORTH);
			flow1.add(jl10);
			
			jp.add(jp2,BorderLayout.CENTER);
			jp2.add(jp3,BorderLayout.NORTH);
			jp2.add(flow,BorderLayout.CENTER);
			
			jp3.add(jl);
			jp3.add(jc);
			jp3.add(jl2);
			jp3.add(jc2);
			jp3.add(jl3);
			jp3.add(jc3);
			

			Border blue = BorderFactory.createLineBorder(Color.BLUE);
			jp02.setBorder(blue);
			
			jp03.add(back);
			jp03.add(jb0);
			jp03.add(jb01);
			//jp03.add(jb02);
			jp03.add(jb03);
			//jp03.add(jb04);
			
			//jp02.add(jp,BorderLayout.CENTER);
			
			jl=new JLabel();
		    jl.setText("Addis Ababa city all bus roots");
		    jl.setFont(new Font("Arial", Font.BOLD, 29));
	        jl.setForeground(Color.BLUE);
	        
	        
	        jc.addItemListener(this);
	        jc2.addItemListener(this);
	        jc3.addItemListener(this);

	        
	        
	        
	        
	        
	        jb0.addActionListener(this);
	        jb01.addActionListener(this);
	        //jb02.addActionListener(this);
	        jb03.addActionListener(this);
	        //jb04.addActionListener(this);
	        back.addActionListener(this);
	        jc.addItemListener(this);
	        jc2.addItemListener(this);
	        jc2.addItemListener(this);
	        
	        SpecificRootViewTwo svt=new SpecificRootViewTwo(this.indx10,this.bus_no10,this.stationName10,this.pay10,this.staKm10);   
	        
	        
	        setVisible(true);
	}
	
	
	
	public void itemStateChanged(ItemEvent ie) {
		String str = (String) jc.getSelectedItem();
	    String [] root=new String[1];
	    root[0]=str;
	    
	    str = (String) jc2.getSelectedItem();
	    String [] staNameSta=new String[1];
	    staNameSta[0]=str;
	    int indx,indx1;
	    indx=jc2.getSelectedIndex();
	    //System.out.println("The index..."+indx);
	    
	    indx1=jc3.getSelectedIndex();
	    //System.out.println("The index..."+indx1);
	    str = (String) jc3.getSelectedItem();
	    String [] staNameEnd=new String[1];
	    staNameEnd[0]=str;
	    
	    
	    
	    if(indx==0) {
	    	if(indx1==0) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    	
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==1) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==2) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    	
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==3) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==4) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==5) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==6) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==7) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==8) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==9) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==10) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    	
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==11) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==12) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    	
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}
	    	
	    	
	    }else if(indx==1) {
	    	if(indx1==0) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==1) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==2) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    	
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==3) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    	
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==4) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==5) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==6) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==7) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==8) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==9) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==10) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==11) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==12) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}
	    
	    }else if(indx==2) {
	    	if(indx1==0) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==1) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==2) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==3) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==4) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==5) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==6) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==7) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==8) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==9) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==10) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==11) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==12) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    	
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}
	  
	    }else if(indx==3) {
	    	if(indx1==0) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==1) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==2) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    	
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==3) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==4) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    	
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==5) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==6) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==7) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==8) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==9) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==10) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==11) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==12) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		//SpecificRootViewTwo svt=new SpecificRootViewTwo(this.indx10,this.bus_no10,this.stationName10,this.pay10,this.staKm10);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}
	    
	    	
	    }else if(indx==4) {
	    	if(indx1==0) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    	
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==1) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==2) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==3) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==4) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==5) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==6) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==7) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==8) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==9) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==10) {
	    		
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==11) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==12) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}
	  
	    }else if(indx==5) {
	    	if(indx1==0) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==1) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==2) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    	
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==3) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==4) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
	    		
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==5) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==6) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==7) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==8) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==9) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==10) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==11) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==12) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}
	    	
	    }else if(indx==6) {
	    	if(indx1==0) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==1) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==2) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==3) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==4) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==5) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==6) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==7) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==8) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==9) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==10) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==11) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==12) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}
	    	
	    }else if(indx==7) {
	    	if(indx1==0) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==1) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==2) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==3) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==4) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==5) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==6) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==7) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==8) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==9) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==10) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==11) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==12) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}
	    	
	    }else if(indx==8) {
	    	if(indx1==0) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==1) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==2) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==3) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==4) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==5) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==6) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==7) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==8) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==9) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==10) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==11) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==12) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}
	    	}else if(indx==9) {
		    	if(indx1==0) {
		    		System.out.println("The index 1..."+indx);
		    		System.out.println("The index 2..."+indx1);
		    		
		    		this.setVisible(false);
			    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
		    	}else if(indx1==1) {
		    		System.out.println("The index 1..."+indx);
		    		System.out.println("The index 2..."+indx1);
		    		
		    		this.setVisible(false);
			    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
		    	}else if(indx1==2) {
		    		System.out.println("The index 1..."+indx);
		    		System.out.println("The index 2..."+indx1);
		    		
		    		this.setVisible(false);
			    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
		    	}else if(indx1==3) {
		    		System.out.println("The index 1..."+indx);
		    		System.out.println("The index 2..."+indx1);
		    		
		    		this.setVisible(false);
			    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
		    	}else if(indx1==4) {
		    		System.out.println("The index 1..."+indx);
		    		System.out.println("The index 2..."+indx1);
		    		
		    		this.setVisible(false);
			    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
		    	}else if(indx1==5) {
		    		System.out.println("The index 1..."+indx);
		    		System.out.println("The index 2..."+indx1);
		    		
		    		this.setVisible(false);
			    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
		    	}else if(indx1==6) {
		    		System.out.println("The index 1..."+indx);
		    		System.out.println("The index 2..."+indx1);
		    		
		    		this.setVisible(false);
			    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
		    	}else if(indx1==7) {
		    		System.out.println("The index 1..."+indx);
		    		System.out.println("The index 2..."+indx1);
		    		
		    		this.setVisible(false);
			    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
		    	}else if(indx1==8) {
		    		System.out.println("The index 1..."+indx);
		    		System.out.println("The index 2..."+indx1);
		    		
		    		this.setVisible(false);
			    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
		    	}else if(indx1==9) {
		    		System.out.println("The index 1..."+indx);
		    		System.out.println("The index 2..."+indx1);
		    		
		    		this.setVisible(false);
			    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
		    	}else if(indx1==10) {
		    		System.out.println("The index 1..."+indx);
		    		System.out.println("The index 2..."+indx1);
		    		
		    		this.setVisible(false);
			    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
		    	}else if(indx1==11) {
		    		System.out.println("The index 1..."+indx);
		    		System.out.println("The index 2..."+indx1);
		    		
		    		this.setVisible(false);
			    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
		    	}else if(indx1==12) {
		    		System.out.println("The index 1..."+indx);
		    		System.out.println("The index 2..."+indx1);
		    		
		    		this.setVisible(false);
			    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
		    	}
	    	
	    }else if(indx==10) {
	    	if(indx1==0) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==1) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==2) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==3) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==4) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==5) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==6) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==7) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==8) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==9) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==10) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==11) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==12) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}
	    	
	    }else if(indx==11) {
	    	if(indx1==0) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==1) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==2) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==3) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==4) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==5) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==6) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==7) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==8) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==9) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==10) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==11) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==12) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}
	    
	    }else if(indx==12) {
	    	if(indx1==0) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==1) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==2) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==3) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==4) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==5) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==6) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==7) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==8) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==9) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==10) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==11) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}else if(indx1==12) {
	    		System.out.println("The index 1..."+indx);
	    		System.out.println("The index 2..."+indx1);
	    		
	    		this.setVisible(false);
		    	SpecificRootViewTwo sr= new SpecificRootViewTwo(root,indx3,bus,indx,indx1,staNameSta,staNameEnd,pay,staKm);
	    	}
	
	    }
	    
	  }
	
	
	public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
      
        if(s.equals("List all root")) {
        	//station id
        	this.setVisible(false);
        	CountTable ct= new CountTable();
        }
        else if(s.equals("View spacific root waiting time")) {
        	//Payment
        	this.setVisible(false);
        	BusTracking bt= new BusTracking();
        }
        else if(s.equals("")) {
        	this.setVisible(false);
        	UserForm f = new UserForm(UserForm.userName,UserForm.passWor);
        }
    }

}
